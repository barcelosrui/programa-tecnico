package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "defenses")
public class DefenseDao
{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    private String videoLink;
    private String imageLink;

    public DefenseDao(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public DefenseDao() {
        super();
    }
}