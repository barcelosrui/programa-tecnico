package pt.barcelos.karate.programa_tecnico.business.service.technique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.DefenseRepository;

import java.util.List;

@Service
public class DefenseService {

    @Autowired
    private DefenseRepository defenseRepository;

    public Response<List<DefenseDao>> findAll() {
        final List<DefenseDao> defenses = defenseRepository.findAll();
        final HttpStatus status = (defenses.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new Response<>(status, defenses);
    }

}
