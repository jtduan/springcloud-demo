java -jar ./config-server/target/config-server-*.jar &
java -jar ./eureka-server/target/eureka-server-*.jar --profile=dev1 &
java -jar ./eureka-server/target/eureka-server-*.jar --profile=dev2 &
java -jar ./springboot-admin/target/springboot-admin-*.jar &
java -jar ./hystrix-dashbard/target/hystrix-dashbard-*.jar &


java -jar ./eureka-client/target/eureka-client-*.jar &
java -jar ./app/target/app-*.jar &