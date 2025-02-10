package pt.barcelos.karate.programa_tecnico.business.service.technique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FistAttackDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.FistAttackRepository;

import java.util.List;

@Service
public class FistAttackService {

    @Autowired
    private FistAttackRepository fistAttackRepository;

    public Response<List<FistAttackDao>> findAll() {
        final List<FistAttackDao> fistAttackDaos = fistAttackRepository.findAll();
        final HttpStatus status = (fistAttackDaos.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new Response<>(status, fistAttackDaos);
    }

}
