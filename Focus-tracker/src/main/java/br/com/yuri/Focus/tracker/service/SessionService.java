package br.com.yuri.Focus.tracker.service;

import br.com.yuri.Focus.tracker.data.dto.SessionRequestDTO;
import br.com.yuri.Focus.tracker.data.dto.SessionResponseDTO;
import br.com.yuri.Focus.tracker.model.Session;
import br.com.yuri.Focus.tracker.repositories.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.yuri.Focus.tracker.mapper.ObjectMapper.parseListObjects;
import static br.com.yuri.Focus.tracker.mapper.ObjectMapper.parseObject;

@Service
public class SessionService{

    private Logger logger = LoggerFactory.getLogger(SessionService.class.getName());

    @Autowired
    private SessionRepository repository;

    public SessionResponseDTO create(SessionRequestDTO session){

        logger.info("Creating one session");
        var entity = parseObject(session, Session.class);

        if (entity.getEndDate().isBefore(entity.getBeginDate())) throw new IllegalArgumentException();

        return parseObject(repository.save(entity), SessionResponseDTO.class);
    }

    public List<SessionResponseDTO> listSessions(){

        logger.info("Listing all focus sessions");

        return parseListObjects(repository.findAll(), SessionResponseDTO.class);
    }

    public SessionResponseDTO findById(Long id){

        logger.info("Finding one session");

        var entity = repository.findById(id);
        //TODO: make return not found exception when created

        return parseObject(entity, SessionResponseDTO.class);
    }

    public SessionResponseDTO update(Long id, SessionRequestDTO session){

        logger.info("Updating one session");
        Session entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No records found for this id"));

        entity.setTitle(session.getTitle());
        entity.setBeginDate(session.getBeginDate());
        entity.setEndDate(session.getEndDate());
        entity.setCategory(session.getCategory());

        if (entity.getEndDate().isBefore(entity.getBeginDate())) {
            throw new IllegalArgumentException("The end date needs to be after the begin date");
        }

        var updatedEntity = repository.save(entity);

        return parseObject(updatedEntity, SessionResponseDTO.class);
    }

}
