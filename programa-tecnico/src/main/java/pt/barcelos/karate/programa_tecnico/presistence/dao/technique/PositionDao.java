package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PositionDao extends TechniqueDao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public PositionDao(String name, String description, String videoLink, String imageLink) {
        super(name, description, videoLink, imageLink);
    }

    public PositionDao() {
        super();
    }
}
