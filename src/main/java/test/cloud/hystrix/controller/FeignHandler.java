package test.cloud.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cloud.hystrix.entity.Student;
import test.cloud.hystrix.service.FeignService;

import java.util.Collection;

/**
 * @author liuzehua
 * 2020/1/17
 **/
@RequestMapping("feign")
@RestController
public class FeignHandler {

    @Autowired
    private FeignService feignService;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return feignService.findAll();
    }

    @GetMapping("index")
    public String index(){
        return feignService.index();
    }

}
