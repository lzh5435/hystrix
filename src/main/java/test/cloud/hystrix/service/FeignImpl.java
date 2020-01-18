package test.cloud.hystrix.service;

import org.springframework.stereotype.Component;
import test.cloud.hystrix.entity.Student;

import java.util.Collection;
import java.util.Collections;

/**
 * @author liuzehua
 * 2020/1/17
 **/
@Component
public class FeignImpl  implements FeignService{

    @Override
    public Collection<Student> findAll() {
        return Collections.emptyList();
    }

    @Override
    public String index() {
        return "系统维护中·····";
    }
}
