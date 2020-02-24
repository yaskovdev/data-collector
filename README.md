# Data Collector

Tested with:
* Java 8
* Maven 3.6.3
* Kafka 2.4.0
* Redis 5.0.7

## To Run Without Docker

Run Zookeeper and Kafka (if they are not yet running):
```
cd kafka_2.12-2.4.0
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```

Build and run the application:
```
cd data-collector
mvn clean package -D maven.test.skip
java -jar ./target/*.jar --spring.config.location=classpath:/local.properties
```

Run [Social Rating Calculator](https://github.com/yaskovdev/social-rating-calculator).

Send the test request:
```
curl -v -H "Content-Type: application/json" http://localhost:8080/persons --data '{"first_name": "Koshchey", "last_name": "Immortal", "age": 20000}'
```

See the logs of Social Rating Calculator, the social rating for the user from the cURL request should be logged there.
