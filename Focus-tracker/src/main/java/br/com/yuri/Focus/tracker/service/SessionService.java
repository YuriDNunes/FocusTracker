package br.com.yuri.Focus.tracker.service;

import br.com.yuri.Focus.tracker.data.dto.SessionRequestDTO;
import br.com.yuri.Focus.tracker.data.dto.SessionResponseDTO;
import br.com.yuri.Focus.tracker.model.Session;
import br.com.yuri.Focus.tracker.repositories.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
