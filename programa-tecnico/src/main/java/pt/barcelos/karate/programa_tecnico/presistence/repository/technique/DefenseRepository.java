package pt.barcelos.karate.programa_tecnico.presistence.repository.technique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;

@Repository
public interface DefenseRepository extends JpaRepository<DefenseDao, Long> {
    DefenseDao findByName(String name);
}
