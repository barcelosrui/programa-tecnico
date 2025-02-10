package pt.barcelos.karate.programa_tecnico.presistence.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class KataDao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String videoLink;
    private String imageLink;

    public KataDao(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public KataDao() {

    }

    @Override
    public String toString() {
        return "Kata{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
