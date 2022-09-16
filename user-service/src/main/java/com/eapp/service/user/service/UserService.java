package com.eapp.service.user.service;

import com.eapp.service.user.entity.UserInfo;
import com.eapp.service.user.repository.UserRepository;
import com.eapp.service.user.valueObject.Department;
import com.eapp.service.user.valueObject.ReposeTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate template;

    public UserInfo saveUser(UserInfo user) {
        return userRepository.save(user);
    }

    public Optional<ReposeTemplateVo> getuserWityDepartment(Long id) {
        log.info("inside fetching the user by department"  +id);
        Optional<UserInfo> user=userRepository.findById(id);
        Department department=template.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.get().getDepartmentId(),Department.class);

         return Optional.of(new ReposeTemplateVo(user.get(), department));
    }


}
