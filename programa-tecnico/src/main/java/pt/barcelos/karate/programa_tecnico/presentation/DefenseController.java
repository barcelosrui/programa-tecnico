package pt.barcelos.karate.programa_tecnico.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.business.service.technique.DefenseService;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program/defense")
public class DefenseController {
    @Autowired
    private DefenseService defenseService;

    @GetMapping("")
    private Response<List<DefenseDao>> getDefenses() {
        return defenseService.findAll();
    }
}
