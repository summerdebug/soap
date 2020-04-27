package com.example.springsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * To build it run maven clean and compile - it will generate java files.
 * Run it as Spring Boot application.
 * WSDL URL: http://localhost:8080/ws/countries.wsdl
 * To test it in SOAP UI send to http://localhost:8080/ws SOAP request:
 <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
        xmlns:gs="http://www.example.com/springsoap/gen">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getCountryRequest>
            <gs:name>Spain</gs:name>
        </gs:getCountryRequest>
    </soapenv:Body>
 </soapenv:Envelope>
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
