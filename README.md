# Spring Cloud Demo
## spring-cloud:Greenwich.SR6
## spring-boot:2.1.9.RELEASE
## Spring Cloud Config/Spring Cloud Bus/Spring Cloud Gateway/Spring Cloud OpenFeign/Spring Cloud Security/Spring Cloud Netflix(Eureka/Ribbon/Hystrix) + Turbine/Spring Cloud Sleuth + Zipkin

## gateway:     8086
### http://localhost:8086
### http://localhost:8086/business/
### http://localhost:8086/business2/
### http://localhost:8086/business/openfeign/test
### http://localhost:8086/business2/test/rateLimiter
### GET:http://localhost:8086/actuator/refresh

## business:    8088
### http://localhost:8088
### http://localhost:8088/openfeign/test
### http://localhost:8088/autoShow
### GET:http://localhost:8088/actuator/refresh

## business2:   8014
### http://localhost:8014
### http://localhost:8014/test/rateLimiter
### GET:http://localhost:8014/actuator/refresh

## config:      8082
### http://localhost:8082/gateway-dev.yml
### POST:http://localhost:8082/actuator/bus-refresh

## eureka:      8084
### http://localhost:8084

## turbine:     8010
### http://localhost:8010/hystrix
### http://localhost:8010/turbine.stream

## zipkin:         8012
### http://localhost:8012
