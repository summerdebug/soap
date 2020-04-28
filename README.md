# soap
SOAP service template

## Build
Execute maven clean and compile goals.

## Deploy
Run it as Spring Boot application, for example run main method of Application class in IDE.

## Test
WSDL URL: http://localhost:8080/ws/countries.wsdl  
Endpoint URL: http://localhost:8080/ws  
Request:

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
        xmlns:gs="http://www.example.com/springsoap/gen">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getCountryRequest>
            <gs:name>Spain</gs:name>
        </gs:getCountryRequest>
    </soapenv:Body>
 </soapenv:Envelope>
```

## Tutorials
https://www.baeldung.com/spring-boot-soap-web-service  
https://www.springboottutorial.com/creating-soap-web-service-with-spring-boot-web-services-starter  
https://spring.io/guides/gs/consuming-web-service/
