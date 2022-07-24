spring.application.name = app
server.port = 10008

eureka.client.service-url.defaultZone=http://localhost:10001/eureka

spring.datasource.driverClassName = com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/frame?autoreconnect = true
spring.datasource.username = frame
spring.datasource.password = frame
spring.datasource.testOnBorrow = true
spring.datasource.testWhileIdle = true
spring.datasource.timeBetweenEvictionRunsMillis = 60000
spring.datasource.minEvictableIdleTimeMillis = 30000
spring.datasource.validationQuery = SELECT 1
spring.datasource.max-active = 15
spring.datasource.max-idle = 10
spring.datasource.max-wait = 8000

mybatis.mapper-locations=classpath*:mapper/*Mapper.xml


logging.level.com.example.demo=debug
logging.level.org.springframework=info
