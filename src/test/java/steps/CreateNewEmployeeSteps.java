package steps;

import api.DummyRestApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import models.request.RequestDataPojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static validations.EmployeesRequest.createEmployees;

public class CreateNewEmployeeSteps {
    RequestDataPojo requestDataPojo;
    Response currentResponse;

    DummyRestApi dummyRestApi = new DummyRestApi();

    @Given("que estou autenticado como administrador")
    public void que_estou_autenticado_como_administrador() {
    }

    @When("envie uma requisição POST para o path api.funcionarios.")
    public void envie_uma_requisição_post_para_o_path_api_funcionarios() {
        requestDataPojo = createEmployees();
        currentResponse = dummyRestApi.postCreateEmployee(this.requestDataPojo);
        currentResponse.then().log().all();
    }

    @Then("o statusCode será {int}")
    public void o_status_code_será(int statusCode) {
        assertThat(currentResponse.getStatusCode(), equalTo(statusCode));
    }
}
