package pt.barcelos.karate.programa_tecnico.presistence.dao.technique;

public abstract class TechniqueDao {
    private String name;
    private String description;
    private String videoLink;
    private String imageLink;

    public TechniqueDao(String name, String description, String videoLink, String imageLink) {
        this.name = name;
        this.description = description;
        this.videoLink = videoLink;
        this.imageLink = imageLink;
    }

    public TechniqueDao() {
    }

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
