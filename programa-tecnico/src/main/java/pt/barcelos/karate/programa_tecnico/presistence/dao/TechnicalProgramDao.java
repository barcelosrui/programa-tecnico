package pt.barcelos.karate.programa_tecnico.presistence.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FistAttackDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.FootAttackDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.PositionDao;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "technical_program")
public class TechnicalProgramDao
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "belt_id")
    private BeltDao beltDao;

    @OneToMany
    private List<PositionDao> positionDaos;

    @OneToMany
    private List<FistAttackDao> fistAttackDaos;

    @OneToMany
    private List<FootAttackDao> footAttackDaos;

    @OneToMany
    private List<DefenseDao> defenseDaos;

    @OneToMany
    private List<KataDao> kataDaos;

    // TODO: ADD Kumite in the future

    public TechnicalProgramDao() {
    }

    public TechnicalProgramDao(BeltDao beltDao, List<PositionDao> positionDaos, List<FistAttackDao> fistAttackDaos, List<FootAttackDao> footAttackDaos, List<DefenseDao> defenseDaos, List<KataDao> kataDaos) {
        this.beltDao = beltDao;
        this.positionDaos = positionDaos;
        this.fistAttackDaos = fistAttackDaos;
        this.footAttackDaos = footAttackDaos;
        this.defenseDaos = defenseDaos;
        this.kataDaos = kataDaos;
    }

    @Override
    public String toString() {
        return "TechnicalProgram{" +
                "id='" + id + '\'' +
                ", belt=" + beltDao +
                ", katas=" + kataDaos +
                '}';
    }
}
