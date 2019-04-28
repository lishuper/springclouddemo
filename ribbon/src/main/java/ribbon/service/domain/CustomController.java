package ribbon.service.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 描述:
 *
 * @author xiaobin.wang@marketin.cn
 * @create 2019-02-26 0:10
 * @since 2.16.6
 */
@RestController
public class CustomController {

    @Autowired
    HelloService helloService;

    @GetMapping("/ribbon")
    public String ribbonTest(){
        return helloService.getName();
    }
}