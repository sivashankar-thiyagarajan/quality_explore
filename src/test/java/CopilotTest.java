
import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured.*;

/**
 * Write API test for PetStore  (https://petstore.swagger.io/)
 */
public class CopilotTest {

    //write a test case to get all pets
    @Test
    public void getAllPets() {
        RestAssured.given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then()
                .statusCode(200);

    }

    //write a test case to get pet by id
    @Test
    void getPetById() {
        RestAssured.given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/1")
                .then()
                .statusCode(200);
    }



}
