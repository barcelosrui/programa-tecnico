package pt.barcelos.karate.programa_tecnico.presistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;

@Repository
public interface KataRepository extends JpaRepository<KataDao, Long> {

    KataDao findByName(String name);

    KataDao findById(long id);
}
