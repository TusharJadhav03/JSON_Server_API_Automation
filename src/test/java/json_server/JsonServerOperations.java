package json_server;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JsonServerOperations {

    //comments
    @Test
    public void postData_Comments(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "      \"id\": \"4\",\n" +
                        "      \"body\": \"large comment\",\n" +
                        "      \"postId\": 2\n" +
                        "    }")
                .when()
                .post("http://localhost:3000/comments");
        res.prettyPrint();
        res.then().statusCode(201);
        Assert.assertEquals(res.statusCode(),201);
    }

    @Test
    public void getData_Comments(){
        Response res = given()
                .header("Accept","*/*")
                .when()
                .get("http://localhost:3000/comments");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void putData_Comments(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "      \"id\": \"3\",\n" +
                        "      \"body\": \"m comment\",\n" +
                        "      \"postId\": 1\n" +
                        "    }")
                .when()
                .put("http://localhost:3000/comments/3");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void deleteData_Comments(){
        Response res = given()
                .header("Accept","*/*")
                .when()
                .delete("http://localhost:3000/comments/3");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void patchData_Comments(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "      \"body\": \"small comment\"\n" +
                        "    }\n")
                .when()
                .patch("http://localhost:3000/comments/3");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    //posts

    @Test
    public void postData_Posts(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body(" {\n" +
                        "        \"id\": \"28\",\n" +
                        "        \"title\": \"Java Developer\",\n" +
                        "        \"author\": \"Sakshi Mam\"\n" +
                        "    }")
                .when()
                .post("http://localhost:3000/posts");
        res.prettyPrint();
        res.then().statusCode(201);
        Assert.assertEquals(res.statusCode(),201);
    }

    @Test
    public void getData_Posts(){
        Response res = given()
                .header("Accept","*/*")
                .when()
                .get("http://localhost:3000/posts");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void putData_Posts(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "      \"id\": \"28\",\n" +
                        "      \"title\": \"Python Developer\",\n" +
                        "      \"author\": \"Sakshi Mam\"\n" +
                        "    }")
                .when()
                .put("http://localhost:3000/posts/28");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void deleteData_Posts(){
        Response res = given()
                .header("Accept","*/*")
                .when()
                .delete("http://localhost:3000/posts/28");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void patchData_Posts(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("[\n" +
                        "    {\n" +
                        "        \"author\": \"Sakshi Jadhav\"\n" +
                        "    }\n" +
                        "]")
                .when()
                .patch("http://localhost:3000/posts/28");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    //profile

    @Test
    public void getData_Profile(){
        Response res = given()
                .header("Accept","*/*")
                .when()
                .get("http://localhost:3000/profile");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void putData_Profile(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"SDET\"\n" +
                        "}")
                .when()
                .put("http://localhost:3000/posts/28");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }


}
