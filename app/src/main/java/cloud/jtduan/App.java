package cloud.jtduan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jtduan
 * @date 2016/12/15
 */

@EnableEurekaClient
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

@RestController
class ServiceInstanceRestController {

    @Autowired
    RestTemplate client;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(3000);
        return template;
    }

    @RequestMapping("/")
    public String helloWorld() {
        return client.getForObject("http://eureka-client/", String.class);
    }
}
