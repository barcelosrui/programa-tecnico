package pt.barcelos.karate.programa_tecnico.business.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kata {

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String videoLink;
    @NotBlank
    private String imageLink;

    public Kata(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public Kata(final Long id, String name, String description, String videoLink, String imageLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public Kata() {

    }

    @Override
    public String toString() {
        return "Kata{" +
                "  id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
