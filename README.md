# Data Collector

```
bin/zookeeper-server-start.sh config/zookeeper.properties
```

```
bin/kafka-server-start.sh config/server.properties
```

```
curl -v -H "Content-Type: application/json" http://localhost:8080/persons --data '{"first_name": "Koshchey", "last_name": "Immortal", "age": 20000}'
```
