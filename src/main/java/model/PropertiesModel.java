package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesModel {

    public String idEmployees;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String gender;
    public String birthDate;
    public ArrayList<AddressModel> address;
    public String job;
    public String salary;
    public String eventId;

}
