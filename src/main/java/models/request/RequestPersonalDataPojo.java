package models.request;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class RequestPersonalDataPojo {

    public String first_name;
    public String last_name;
    public int age;
    public String email;
    public String gender;
    public String birthDate;
    public ArrayList<RequestAddressDataPojo> address;
    public String job;
    public String salary;
    public String eventId;

}