
package com.example.buoi3.services;
import com.example.buoi3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.buoi3.repository. IUserRepository;
import com.example.buoi3.repository. IRoleRepository;
import org.springframework. stereotype.Service;



@Service
public class UserService {



    @Autowired
    private IUserRepository userRepository;


    @Autowired
    private IRoleRepository roleRepository;


    public void save (User user) {
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername (user.getUsername());
        Long roleId = roleRepository.getRoleIdByName ("USER");
        if (roleId != 0 && userId != 0) {
            userRepository.addRoleToUser (userId, roleId);
        }
}
}