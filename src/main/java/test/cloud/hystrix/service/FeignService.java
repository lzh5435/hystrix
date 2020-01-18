package test.cloud.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import test.cloud.hystrix.entity.Student;

import java.util.Collection;

@FeignClient(name = "provider" ,fallback = FeignImpl.class)
public interface FeignService {

    @GetMapping(value = "student/findAll")
    Collection<Student> findAll();

    @GetMapping("student/index")
    String index();
}
