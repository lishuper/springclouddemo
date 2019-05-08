package hello.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 描述:
 *
 * @author xiaobin.wang@marketin.cn
 * @create 2019-02-25 23:35
 * @since 2.16.6
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;

    @GetMapping("/hi")
    public String index() {
        logger.info("you are visiting hello service!");
        return "hi " + name + ",i am from port:" + port;
    }

}