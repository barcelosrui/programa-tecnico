package pt.barcelos.karate.programa_tecnico.presistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.TechnicalProgramDao;

import java.util.Optional;

@Repository
public interface TechnicalProgramRepository extends JpaRepository<TechnicalProgramDao, Long>
{
    TechnicalProgramDao findTechnicalProgramById(Long id);

    Optional<TechnicalProgramDao> findTechnicalProgramByBeltDao(BeltDao beltDao);

}
