package pt.barcelos.karate.programa_tecnico.presistence.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "belts")
public class BeltDao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String level;
    private String color;
    private String idColor;

    public BeltDao(String level, String color, String idColor) {
        this.level = level;
        this.color = color;
        this.idColor = idColor;
    }

    public BeltDao() {
    }
}
