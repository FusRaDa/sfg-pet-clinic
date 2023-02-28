package guru.springframework.sfgpetclinic.model;

/**
 * Created by FusRada on February 28, 2023
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
