package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseModel {

    @JsonProperty("Properties")
    public PropertiesModel properties;
    public int id;
}