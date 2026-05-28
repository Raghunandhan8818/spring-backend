package backend.hobbiebackend.model.dto;

import backend.hobbiebackend.model.entities.enums.GenderEnum;

public class UpdateAppClientDto {
    private Long id;
    private String displayName;
    private GenderEnum gender;
    private String password;

    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
