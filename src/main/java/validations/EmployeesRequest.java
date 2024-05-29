package validations;


import model.AddressModel;
import model.PropertiesModel;
import model.RequestModel;

import java.util.ArrayList;
import java.util.UUID;

public class EmployeesRequest {

    public static RequestModel createEmployees(String idEmployees, String firstName, String lastName) {

        AddressModel address = AddressModel.builder()
                .street("40336 Redwing Avenue")
                .state("California")
                .city("Sacramento")
                .country("United States")
                .build();

        ArrayList<AddressModel> addressModels = new ArrayList<>();
        addressModels.add(address);

        PropertiesModel properties = PropertiesModel.builder()
                .idEmployees(idEmployees)
                .firstName(firstName)
                .lastName(lastName)
                .age(28)
                .email("lbecarra0@apache.org")
                .gender("Male")
                .birthDate("1984-11-09")
                .address(addressModels)
                .job("Programmer")
                .salary("usd 3637.34")
                .eventId(UUID.randomUUID().toString())
                .build();

        return RequestModel.builder()
                .properties(properties)
                .build();
    }
}
