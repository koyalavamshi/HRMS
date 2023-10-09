package pojo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class Serialization {
    public static void main(String arg[]) {
        AddData d = new AddData();
        d.setId(5);
        d.setAvatar("https://reqres.in/img/faces/2-image.jpg");
        d.setFirst_name("Janet");
        d.setLast_name("Weaver");
        d.setEmail("janet.weaver@reqres.in");

        AddSupport s = new AddSupport();
        s.setUrl("https://reqres.in/#support-heading");
        s.setText("To keep ReqRes free, contributions towards server costs are appreciated!");

        postName p = new postName();
        p.setData(d);
        p.setSupport(s);

//        RestAssured.baseURI = "https://reqres.in/api";
//        String response = given().log().all().body(p).
//                when().get("/users/2").
//                then().log().all().assertThat().statusCode(200).extract().response().asString();
//        System.out.println(response);
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/api").setContentType(ContentType.JSON).build();
        ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        RequestSpecification res = given().log().all().spec(req).body(p);
        Response response = res.when().get("/users/2").then().spec(resspec).assertThat().extract().response();
        String responseString = response.asString();
        System.out.println(responseString);


    }
}


