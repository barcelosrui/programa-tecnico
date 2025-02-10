package pt.barcelos.karate.programa_tecnico.presistence.repository.technique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FistAttackDao;

@Repository
public interface FistAttackRepository extends JpaRepository<FistAttackDao, Long> {
}
