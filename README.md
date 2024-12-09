# SB-Actuator

Endpoints: 


http://localhost:8080/actuator/health   - GET  - Custom predefined(Health)

http://localhost:8080/actuator/myend  - GET  - Custom (Userdefined)
http://localhost:8080/actuator/myend   - DELETE 
http://localhost:8080/actuator/myend   - POST 
{
"message" : "sb microservices",
"status":  "inactive"
}

OR  
http://localhost:8080/actuator/myend?message=sb microservices&status=inactive
