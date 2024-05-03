package validations;

import models.request.RequestAddressDataPojo;
import models.request.RequestDataPojo;
import models.request.RequestPersonalDataPojo;

import java.util.ArrayList;
import java.util.UUID;

public class EmployeesRequest {

    public static RequestDataPojo createEmployees() {

        RequestAddressDataPojo addressDataPojo = RequestAddressDataPojo.builder()
                .street("40336 Redwing Avenue")
                .state("California")
                .city("Sacramento")
                .country("United States")
                .build();

        ArrayList<RequestAddressDataPojo> addresses = new ArrayList<>();
        addresses.add(addressDataPojo);

        RequestPersonalDataPojo employeesPersonalData = RequestPersonalDataPojo.builder()
                .first_name("Lindsay")
                .last_name("Becarra")
                .age(28)
                .email("lbecarra0@apache.org")
                .gender("Male")
                .birthDate("1984-11-09")
                .address(addresses)
                .job("Programmer I")
                .salary("usd 3637.34")
                .eventId(UUID.randomUUID().toString())
                .build();

        return RequestDataPojo.builder()
                .properties(employeesPersonalData)
                .build();
    }
}
