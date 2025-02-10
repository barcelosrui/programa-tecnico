package pt.barcelos.karate.programa_tecnico.business.service.technique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.PositionDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.PositionRepository;

import java.util.List;

@Service
public class PositionService
{
    @Autowired
    private PositionRepository positionRepository;

    public Response<List<PositionDao>> findAll() {
        final List<PositionDao> positionDaos = positionRepository.findAll();
        final HttpStatus status = (positionDaos.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new Response<>(status, positionDaos);
    }
}
