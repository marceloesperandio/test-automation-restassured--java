package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestModel {

    @JsonProperty("Properties")
    public PropertiesModel properties;
}