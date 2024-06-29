package com.financial.app.infraestructure.api.v1.controllers;


import com.financial.app.infraestructure.api.v1.inputs.CreateOrUpdateInput;
import com.financial.app.domain.resourses.CreateOrUpdateUser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final CreateOrUpdateUser createorUpdateUser;

    @PostMapping
    public void createUser(@RequestBody CreateOrUpdateInput input) {
        createorUpdateUser.createUser(input.toModel());
    }
}
