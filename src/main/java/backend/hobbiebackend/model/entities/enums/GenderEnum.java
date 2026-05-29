package backend.hobbiebackend.model.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GenderEnum {
    MALE, FEMALE;

    @JsonValue
    public String toJson() {
        return this.name().toLowerCase();
    }
}
