package ribbon.service.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * TODO 描述:
 *
 * @author xiaobin.wang@marketin.cn
 * @create 2019-02-26 0:11
 * @since 2.16.6
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String getName() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hi", String.class);
    }

}