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
