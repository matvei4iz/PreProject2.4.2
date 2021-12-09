package application.service;

import application.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> allUsers();

    void add(User user);

    void remove(User user);

    void edit(User user);

    User getById(long id);

    User findByUsername(String username);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
