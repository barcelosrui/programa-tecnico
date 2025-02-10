package pt.barcelos.karate.programa_tecnico.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.barcelos.karate.programa_tecnico.business.service.TechnicalProgramService;
import pt.barcelos.karate.programa_tecnico.presistence.dao.TechnicalProgramDao;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program")
public class TechnicalProgramController {
    @Autowired
    private TechnicalProgramService technicalProgramService;

    @GetMapping("")
    private List<TechnicalProgramDao> getAllTechnicalPrograms() {
        return technicalProgramService.findAllTechnicalPrograms();
    }
}
