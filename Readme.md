execution

mvn spring-boot:run

mvn clean package 
 
mvn clean package -DskipTests

java -jar target/flyway-project-0.0.1-SNAPSHOT.jar --spring-profiles.active=dev