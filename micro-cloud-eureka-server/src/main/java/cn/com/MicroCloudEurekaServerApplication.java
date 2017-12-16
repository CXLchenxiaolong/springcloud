package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudEurekaServerApplication.class, args);
	}
}
