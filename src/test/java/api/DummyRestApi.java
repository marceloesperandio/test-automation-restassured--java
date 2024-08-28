package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.RequestModel;

import static constants.Endpoints.baseUrlDummyRestApi;
import static constants.Path.pathRequestEmployees;
import static io.restassured.RestAssured.given;

public class DummyRestApi {

    private RequestSpecification requestSpec = new RequestSpecBuilder()
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .setBaseUri(baseUrlDummyRestApi)
            .log(LogDetail.ALL)
            .build();

    public Response getSingleEmployees() {
        return given()
                .spec(requestSpec)
                .get(pathRequestEmployees + "employees")
                .then()
                .extract()
                .response();
    }

    public Response getListEmployees() {
        return given()
                .spec(requestSpec)
                .get(pathRequestEmployees + "employee/1")
                .then()
                .extract()
                .response();
    }

    public Response postCreateEmployee(RequestModel body) {
        return given()
                .spec(requestSpec)
                .body(body)
                .post(pathRequestEmployees + "create")
                .then()
                .extract()
                .response();
    }

    public Response putUpdateRegisterEmployee() {
        return given()
                .spec(requestSpec)
                .put(pathRequestEmployees + "update/21")
                .then()
                .extract()
                .response();
    }

    public Response deleteRegisterEmployee() {
        return given()
                .spec(requestSpec)
                .delete(pathRequestEmployees + "delete/21")
                .then()
                .extract()
                .response();
    }

}
