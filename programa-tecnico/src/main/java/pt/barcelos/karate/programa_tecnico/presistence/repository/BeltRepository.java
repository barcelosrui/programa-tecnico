package pt.barcelos.karate.programa_tecnico.presistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;

import java.util.List;
import java.util.Optional;

@Repository
public interface BeltRepository extends JpaRepository<BeltDao, Long> {

    List<BeltDao> findAll();

    BeltDao findById(long id);

    Optional<BeltDao> findByLevel(String level);
}
