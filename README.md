# Spring Cloud Demo3
- ### spring-cloud: Greenwich.SR6
- ### spring-boot: 2.1.9.RELEASE
- ### docker
- ### kubernates
- #### Spring Cloud Config/Spring Cloud Bus/Spring Cloud OpenFeign/Spring Cloud Security+ Oauth2 + SSO + Spring Session/Spring Cloud Netflix(Zuul/Eureka/Ribbon/Hystrix) + Turbine/Spring Cloud Sleuth + Zipkin/Redis/Rabbitmq/Docker/Kubernates

## 1. config:      8082

http://localhost:8082/business-dev.yml

POST:http://localhost:8082/actuator/bus-refresh

## 2. oauth2:      8016   

http://localhost:8016

## 3. zuul:     8086

http://localhost:8086

http://localhost:8086/business/

http://localhost:8086/business/autoShow

http://localhost:8086/business/openfeign/test

http://localhost:8086/business2/

http://localhost:8086/business2/test/rateLimiter

POST:http://localhost:8086/actuator/refresh

## 4. turbine:     8010

http://localhost:8010/hystrix

http://localhost:8010/turbine.stream

## 5. zipkin:         8012

http://localhost:8012

## 6. redis:         6379

## 7. rabbitmq:         5672
