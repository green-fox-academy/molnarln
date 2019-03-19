package com.greenfoxacademy.rest_exercises;

import com.greenfoxacademy.rest_exercises.controller.MainController;
import com.greenfoxacademy.rest_exercises.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.unbescape.html.HtmlEscape;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    LogService logService;

    @Test
    public void showIndexPage_ReturnIndexPage_IsOK() throws Exception {

        mockMvc.perform(
                get("/"))
                .andExpect(MockMvcResultMatchers.content().string("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\" />\n" +
                        "    <title>REST backend day - Frontend</title>\n" +
                        "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\" />\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<div class=\"container\">\n" +
                        "    <div class=\"header clearfix\">\n" +
                        "        <nav>\n" +
                        "            <form class=\"form-inline pull-right\" id=\"server_change\">\n" +
                        "                <div class=\"form-group\">\n" +
                        "                    <label for=\"server_address\">Your server's base url</label>\n" +
                        "                    <input type=\"text\" class=\"form-control\" id=\"server_address\" placeholder=\"http://localhost:8080\" />\n" +
                        "                </div>\n" +
                        "                <button type=\"submit\" class=\"btn btn-default\">Change</button>\n" +
                        "            </form>\n" +
                        "        </nav>\n" +
                        "        <h3 class=\"text-muted\">REST backend day - Frontend</h3>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <div class=\"jumbotron\">\n" +
                        "        <h1>Doubling</h1>\n" +
                        "        <p class=\"lead\">Try your first exercise with just one button</p>\n" +
                        "        <ul id=\"doubling_response\"></ul>\n" +
                        "        <p><a class=\"btn btn-lg btn-success\" href=\"#\" role=\"button\" id=\"doubling\">Try doubling endpoint</a></p>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <div class=\"jumbotron\">\n" +
                        "        <h1>Greeter</h1>\n" +
                        "        <p class=\"lead\">Try your greeter exercise with just one button</p>\n" +
                        "        <ul id=\"greeter_response\"></ul>\n" +
                        "        <p><a class=\"btn btn-lg btn-success\" href=\"#\" role=\"button\" id=\"greeter\">Try greeter endpoint</a></p>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <div class=\"jumbotron\">\n" +
                        "        <h1>Append A</h1>\n" +
                        "        <p class=\"lead\">Try your append-a exercise with just one button</p>\n" +
                        "        <ul id=\"appenda_response\"></ul>\n" +
                        "        <p><a class=\"btn btn-lg btn-success\" href=\"#\" role=\"button\" id=\"appenda\">Try appenda endpoint</a></p>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <div class=\"jumbotron\">\n" +
                        "        <h1>Do until</h1>\n" +
                        "        <p class=\"lead\">Try your do-until exercise with just one button</p>\n" +
                        "        <ul id=\"dountil_response\"></ul>\n" +
                        "        <p><a class=\"btn btn-lg btn-success\" href=\"#\" role=\"button\" id=\"dountil\">Try dountil endpoint</a></p>\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <footer class=\"footer\">\n" +
                        "        <p>&copy; 2017 Green Fox Academy</p>\n" +
                        "    </footer>\n" +
                        "    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n" +
                        "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n" +
                        "    <script src=\"/frontend.js\"></script>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>"));
    }
    @Test
    public void doubleTheInput_ReturnDoubleValue_IsOK() throws Exception {

        mockMvc.perform(
                get("/doubling?input=5"))
                .andExpect(MockMvcResultMatchers.jsonPath("received")
                        .value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("result")
                        .value(10));
    }

    @Test
    public void doubleTheInput_ReturnErrorMessage_IsOK() throws Exception {

        mockMvc.perform(
                get("/doubling"))
                .andExpect(MockMvcResultMatchers.jsonPath("error")
                        .value("Please provide an input!"));
    }
}
