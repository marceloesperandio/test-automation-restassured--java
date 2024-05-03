package models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestDataPojo {

    @JsonProperty("properties")
    private RequestPersonalDataPojo properties;

}