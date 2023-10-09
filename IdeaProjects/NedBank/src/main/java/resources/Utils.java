package resources;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.asynchttpclient.filter.ResponseFilter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Utils {
   public static RequestSpecification req;
    public RequestSpecification requestSpecification() throws FileNotFoundException {

        if (req ==null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.text"));
            RestAssured.baseURI = "https://reqres.in/api";


//        RestAssured.baseURI = "https://reqres.in/api";
//        String response = given().log().all().body(p).
//                when().get("/users/2").
//                then().log().all().assertThat().statusCode(200).extract().response().asString();
//        System.out.println(response);
            req = new RequestSpecBuilder().setBaseUri("https://reqres.in/api").
                    addFilter(RequestLoggingFilter.logRequestTo(log)).
                    addFilter(ResponseLoggingFilter.logResponseTo(log)).
                    setContentType(ContentType.JSON).build();
            return req;
        }
        return req;
    }
}
