package steps;

import api.DummyRestApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import model.DataModel;
import model.RequestModel;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static validations.EmployeesRequest.createEmployees;

public class CreateEmployeeSteps {
    RequestModel requestModel;
    DataModel responseModel;
    Response currentResponse;

    DummyRestApi dummyRestApi = new DummyRestApi();

    @Given("usuário esteja autenticado como perfil de administrador.")
    public void usuário_esteja_autenticado_como_perfil_de_administrador() {
    }

    @And("fizer uma requisição utilizando o método {string} com a rota {string} da api CreateEmployee.")
    public void fizer_uma_requisição_utilizando_o_método_com_a_rota_da_api_create_employee(String string, String string2) {
    }

    @When("passar no body o idEmployees {string}, firstName {string}, lastName {string}.")
    public void passar_no_body_o_id_employees_first_name_last_name(String idEmployees, String firstName, String lastName) {
        requestModel = createEmployees(idEmployees, firstName, lastName);
        currentResponse = dummyRestApi.postCreateEmployee(this.requestModel);
        currentResponse.then().log().all();
    }

    @Then("o statusCode será {int}, o statusExecution será {string} e a mensagem recebida será {string}")
    public void o_status_code_será_o_statusExecution_será_e_a_mensagem_recebida_será(Integer statusCode, String statusExecution, String message) {
        responseModel = currentResponse.then().extract().as(DataModel.class);

        assertThat(requestModel.getProperties().firstName,equalTo(responseModel.getData().properties.firstName));

        assertThat(responseModel.getData().getId(), notNullValue());
        assertThat(responseModel.getStatus(), equalTo(statusExecution));
        assertThat(responseModel.getMessage(), equalTo(message));
        assertThat(currentResponse.getStatusCode(), equalTo(statusCode));

    }
}