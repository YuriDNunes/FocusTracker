package br.com.yuri.Focus.tracker.controller;

import br.com.yuri.Focus.tracker.data.dto.SessionRequestDTO;
import br.com.yuri.Focus.tracker.data.dto.SessionResponseDTO;
import br.com.yuri.Focus.tracker.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/focus-tracker/v1")
public class SessionController {

    @Autowired
    private SessionService services;

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public SessionResponseDTO create(@RequestBody SessionRequestDTO session){
        return services.create(session);
    }

    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<SessionResponseDTO> listSessions(){
        return services.listSessions();
    }

    @GetMapping(value = "/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public SessionResponseDTO findById(@PathVariable Long id){
        return services.findById(id);
    }

    @PutMapping( value = "/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public SessionResponseDTO update(
        @PathVariable Long id,
        @RequestBody SessionRequestDTO session
    ){
        return services.update(id, session);
    }

    @DeleteMapping(
            value = "/{id}"
    )
    public ResponseEntity<?> delete(@PathVariable Long id){
        services.delete(id);
        return ResponseEntity.noContent().build();
    }

}
