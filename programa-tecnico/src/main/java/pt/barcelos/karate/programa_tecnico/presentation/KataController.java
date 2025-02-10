package pt.barcelos.karate.programa_tecnico.presentation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;
import pt.barcelos.karate.programa_tecnico.business.response.Response;
import pt.barcelos.karate.programa_tecnico.business.service.KataService;
import pt.barcelos.karate.programa_tecnico.business.dto.Kata;

import java.util.List;

@RestController
@RequestMapping("/tecnhical-program/kata")
public class KataController {

    @Autowired
    private KataService kataService;

    @GetMapping("")
    private List<KataDao> getKatas() {
        return kataService.findAllKatas();
    }

    @GetMapping("/{id}")
    private ResponseEntity<Kata> getKataById(@PathVariable Long id) {
        final Response<Kata> kataResponse = kataService.findKataById(id);
        return new ResponseEntity<>(kataResponse.getResponse(), kataResponse.getStatusCode());
    }

    @PostMapping("/")
    //@RequestMapping(path = "/", method = RequestMethod.POST)
    private ResponseEntity<KataDao> saveKata(@Valid @RequestBody Kata kata) {
        final Response<KataDao> kataResponse = kataService.saveKata(kata);
        return new ResponseEntity<>(kataResponse.getResponse(), kataResponse.getStatusCode());
    }

    @PutMapping("/{id}")
    //@RequestMapping(path = "/", method = RequestMethod.PUT)
    private ResponseEntity<KataDao> updateKata(@PathVariable Long id, @RequestBody Kata kata) {
        final Response<KataDao> kataResponse = kataService.updateKata(id, kata);
        return new ResponseEntity<>(kataResponse.getResponse(), kataResponse.getStatusCode());
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<KataDao> deleteKata(@PathVariable Long id) {
        final Response<KataDao> kataResponse = kataService.deleteKata(id);
        return new ResponseEntity<>(kataResponse.getStatusCode());
    }
}
