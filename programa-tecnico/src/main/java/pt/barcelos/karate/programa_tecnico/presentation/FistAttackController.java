package pt.barcelos.karate.programa_tecnico.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.business.service.technique.DefenseService;
import pt.barcelos.karate.programa_tecnico.business.service.technique.FistAttackService;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FistAttackDao;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program/fist-attack")
public class FistAttackController {
    @Autowired
    private FistAttackService fistAttackService;

    @GetMapping("")
    private Response<List<FistAttackDao>> getFistAttack() {
        return fistAttackService.findAll();
    }
}
