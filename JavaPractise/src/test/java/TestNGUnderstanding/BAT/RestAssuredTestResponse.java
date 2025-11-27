package TestNGUnderstanding.BAT;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAssuredTestResponse {


    @Test
    public void getBookDetails(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

    }
}
