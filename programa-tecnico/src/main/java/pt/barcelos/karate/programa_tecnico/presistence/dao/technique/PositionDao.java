package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "positions")
public class PositionDao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    private String videoLink;
    private String imageLink;

    private boolean isDisplacement;


    public PositionDao(String name, String description, String videoLink, String imageLink, boolean isDisplacement) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
        this.isDisplacement = isDisplacement;
    }

    public PositionDao() {
        super();
    }
}
