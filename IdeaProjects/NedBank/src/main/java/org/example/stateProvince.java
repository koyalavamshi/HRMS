package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class stateProvince {
    public static void main(String[] args) {

        JsonPath js = new JsonPath(playload.getstate());
        String state = js.get("[0].name");
        System.out.println(state);


    }
}
