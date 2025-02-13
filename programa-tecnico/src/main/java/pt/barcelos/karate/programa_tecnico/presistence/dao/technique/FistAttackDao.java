package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "fist_attacks")
public class FistAttackDao
{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    private String videoLink;
    private String imageLink;


    public FistAttackDao(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public FistAttackDao() {
        super();
    }
}