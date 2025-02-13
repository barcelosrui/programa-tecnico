package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "foot_attacks")
public class FootAttackDao
{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    private String videoLink;
    private String imageLink;

    public FootAttackDao(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public FootAttackDao() {
        super();
    }
}