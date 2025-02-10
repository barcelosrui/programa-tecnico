package pt.barcelos.karate.programa_tecnico.business.service.technique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FootAttackDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.FootAttackRepository;

import java.util.List;

@Service
public class FootAttackService {

    @Autowired
    private FootAttackRepository footAttackRepository;

    public Response<List<FootAttackDao>> findAll() {
        final List<FootAttackDao> fistAttackDaos = footAttackRepository.findAll();
        final HttpStatus status = (fistAttackDaos.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new Response<>(status, fistAttackDaos);
    }

}
