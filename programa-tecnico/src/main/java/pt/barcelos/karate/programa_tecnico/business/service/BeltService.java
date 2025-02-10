package pt.barcelos.karate.programa_tecnico.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.BeltRepository;
import pt.barcelos.karate.programa_tecnico.business.response.Response;

import java.util.List;
import java.util.Optional;

@Service
public class BeltService
{
    @Autowired
    private BeltRepository beltRepository;

    public Response<List<BeltDao>> findAllBelts() {
        final List<BeltDao> beltDaos = beltRepository.findAll();
        final HttpStatus code = !beltDaos.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new Response<>(code, beltDaos);
    }

    public Response<BeltDao> findBeltById(Long id) {
        final Optional<BeltDao> belt = beltRepository.findById(id);
        HttpStatus status = belt.isPresent()? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new Response<>(status, belt.orElse(null));
    }
}
