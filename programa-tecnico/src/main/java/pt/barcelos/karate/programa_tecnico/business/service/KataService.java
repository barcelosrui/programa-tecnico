package pt.barcelos.karate.programa_tecnico.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pt.barcelos.karate.programa_tecnico.business.dto.Kata;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.KataRepository;
import pt.barcelos.karate.programa_tecnico.business.response.Response;

import java.util.List;
import java.util.Optional;

@Service
public class KataService {

    @Autowired
    private KataRepository kataRepository;

    public List<KataDao> findAllKatas() {
        return kataRepository.findAll();
    }

    public Response<Kata> findKataById(final Long id) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        final Optional<KataDao> kataDaoOpt = kataRepository.findById(id);

        Kata kata = null;
        if (kataDaoOpt.isPresent()) {
            final KataDao kataDao = kataDaoOpt.get();
            status = HttpStatus.OK;
            kata = new Kata(id, kataDao.getName(), kataDao.getDescription(), kataDao.getImageLink(), kataDao.getImageLink());
        }
        return new Response<>(status, kata);
    }

    public Response<KataDao> saveKata(final Kata kata) {
        KataDao kataDao = kataRepository.findByName(kata.getName());
        HttpStatus status = HttpStatus.CONFLICT;
        if (kataDao == null) {
            kataDao = new KataDao(kata.getName(), kata.getDescription(), kata.getVideoLink(), kata.getImageLink());
            kataRepository.save(kataDao);
            status = HttpStatus.CREATED;
        }
        return new Response<>(status, kataDao);
    }

    public Response<KataDao> updateKata(final long id, final Kata kata) {
        KataDao kataDao = kataRepository.findById(id);
        HttpStatus status = HttpStatus.NOT_FOUND;
        if (kataDao != null) {
            kataDao.setName(kata.getName());
            kataDao.setDescription(kata.getDescription());
            kataDao.setVideoLink(kata.getVideoLink());
            kataDao.setImageLink(kata.getImageLink());
            kataRepository.save(kataDao);
            status = HttpStatus.OK;
        }
        return new Response<>(status, kataDao);
    }

    public Response<KataDao> deleteKata(final long id) {
        final KataDao kataDao = kataRepository.findById(id);
        HttpStatus status = HttpStatus.NOT_FOUND;
        if (kataDao != null) {
            kataRepository.delete(kataDao);
            status = HttpStatus.OK;
        }
        return new Response<>(status, null);
    }
}
