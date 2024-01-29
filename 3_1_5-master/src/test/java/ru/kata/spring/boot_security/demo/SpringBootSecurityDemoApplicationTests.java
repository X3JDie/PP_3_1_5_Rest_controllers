package ru.kata.spring.boot_security.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repositories.UserRepository;
import ru.kata.spring.boot_security.demo.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringBootSecurityDemoApplicationTests {


    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void whenValidName_thenUserShouldBeFound() {
        String name = "qwe";
        User user = new User();
        user.setName(name);
        when(userRepository.getUserByName(name)).thenReturn(user);

        User found = userService.findByUserName(name);

        assertEquals(found.getUsername(), name);
    }

    @Test
    void contextLoads() {
    }

}
