package pt.barcelos.karate.programa_tecnico.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.business.service.technique.FistAttackService;
import pt.barcelos.karate.programa_tecnico.business.service.technique.FootAttackService;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FistAttackDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FootAttackDao;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program/foot-attack")
public class FootAttackController {
    @Autowired
    private FootAttackService footAttackService;

    @GetMapping("")
    private Response<List<FootAttackDao>> getFootAttacks() {
        return footAttackService.findAll();
    }
}
