package pt.barcelos.karate.programa_tecnico.presistence.repository.technique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.PositionDao;

@Repository
public interface PositionRepository extends JpaRepository<PositionDao, Long> {
}
