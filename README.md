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



List of EndPoints

Endpoint	Description
/actuator	Shows all available endpoints
/actuator/health	Shows application health
/actuator/info	Displays custom app info
/actuator/beans	Lists all Spring beans
/actuator/mappings	Shows all URL mappings in the app
/actuator/env	Displays environment properties
/actuator/metrics	Provides app performance metrics
/actuator/loggers	Allows logging configuration changes
/actuator/threaddump	Dumps thread information
/actuator/heapdump	Shows JVM heap dump (for memory analysis)
/actuator/caches	Shows cache statistics
/actuator/scheduledtasks	Lists scheduled tasks
/actuator/httptrace	Shows recent HTTP request traces
/actuator/shutdown	Gracefully shuts down the app (if enabled)






