package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.Collection;
import java.util.Set;

public interface UserService {
    Set<User> getAllUsers();

    void save(User user);

    User getUserById(Long id);

    void delete(Long id);

    User findByUserName(String name);

    Collection<? extends GrantedAuthority> grantedAuthorities(Collection<Role> roles);

    User getUserByLogin(String name);

    User passwordCoder(User user);

    public void updateUser(Long id, User user);

    Role findById(Long id);

    void addRole(Role role);
}
