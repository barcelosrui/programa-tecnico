package pt.barcelos.karate.programa_tecnico.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.business.service.BeltService;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program/belt")
public class BeltController
{
    @Autowired
    private BeltService beltService;

    @GetMapping("")
    private ResponseEntity<List<BeltDao>> getBelts()
    {
        final Response<List<BeltDao>> beltResponse = beltService.findAllBelts();
        return new ResponseEntity<>(beltResponse.getResponse(), beltResponse.getStatusCode());
    }

    @GetMapping("/{id}")
    private ResponseEntity<BeltDao> getBeltById(@PathVariable Long id)
    {
        final Response<BeltDao> beltResponse = beltService.findBeltById(id);
        return new ResponseEntity<>(beltResponse.getResponse(), beltResponse.getStatusCode());
    }
}
