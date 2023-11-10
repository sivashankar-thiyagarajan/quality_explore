
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

    //write a negative test case to get pet by id
    @Test
    void getPetByIdNegative() {
        RestAssured.given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/0")
                .then()
                .statusCode(404);
    }

    //write a test case to add new pet
    @Test
    void addNewPetWithEmptyPayload() {
        RestAssured.given()
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(405);
    }
    //create a payload for add new pet and test add new pet API with the payload
    @Test
    void addNewPetwithPayload() {

        Pet pet = new Pet(1, "doggie", "available", new Pet.Category(1, "string"));
        RestAssured.given()
                .contentType("application/json")
                .body(pet)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200);
    }
}
