package pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddData;
import pojo.AddSupport;
import resources.APIResource;
import resources.TestDataBulid;
import resources.Utils;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class StepDefination extends Utils {

    RequestSpecification res;
    ResponseSpecification resspec;
    Response response;
    TestDataBulid data = new TestDataBulid();


    @Given("User details playload with {string} {string}")
    public void user_details_playload_with(String firstName, String lastName) throws FileNotFoundException {
        res = given().log().all().spec(requestSpecification())
                .body(data.UserData(firstName, lastName));
    }

    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resources, String method) {
//constructor will be called the value of resource which we pass.
        APIResource resourceAPI = APIResource.valueOf(resources);
        System.out.println(resourceAPI.getResource());

        resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        if (method.equalsIgnoreCase("GET"))
            response = res.when().get(resourceAPI.getResource()).
                    then().spec(resspec).assertThat().extract().response();
        else if (method.equalsIgnoreCase("POST"))
            response = res.when().post(resourceAPI.getResource()).
                    then().spec(resspec).assertThat().extract().response();
    }

    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(), 200);
    }
//    @Then("{string} in response body is {string}")
//    public void in_response_body_is(String keyvalue, String Expectedvalue) {
//        String responseString = response.asString();
//        JsonPath js = new JsonPath(responseString);
//       assertEquals(js.get(keyvalue).toString(),Expectedvalue);
//
//    }


}
