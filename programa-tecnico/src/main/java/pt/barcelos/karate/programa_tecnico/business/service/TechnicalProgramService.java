package pt.barcelos.karate.programa_tecnico.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.TechnicalProgramDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.BeltRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.TechnicalProgramRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicalProgramService {

    @Autowired
    private BeltRepository beltRepository;

    @Autowired
    private TechnicalProgramRepository technicalProgramRepository;

    public List<TechnicalProgramDao> findAllTechnicalPrograms() {
        return technicalProgramRepository.findAll();
    }

    public Response<TechnicalProgramDao> technicalProgram(final String beltLevel) {
        final Optional<BeltDao> beltDaoOptional = beltRepository.findByLevel(beltLevel);
        HttpStatus status = HttpStatus.NOT_FOUND;
        TechnicalProgramDao technicalProgramDao = null;
        if (beltDaoOptional.isPresent()) {
            final Optional<TechnicalProgramDao> technicalProgramDaoOptional =
                    technicalProgramRepository.findTechnicalProgramByBeltDao(beltDaoOptional.get());
            if (technicalProgramDaoOptional.isPresent()) {
                technicalProgramDao = technicalProgramDaoOptional.get();
                status = HttpStatus.OK;
            }
        }
        return new Response<>(status, technicalProgramDao);
    }
}
