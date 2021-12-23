package com.example.openfeign.service;

import com.example.openfeign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value = "USER-SERVICE")
public interface UserService {

    @RequestMapping("/users")
    List<User> users();
}
