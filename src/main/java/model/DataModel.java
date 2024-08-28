package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataModel {

    public String status;
    public ResponseModel data;
    public String message;
}