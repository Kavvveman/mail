package main.Services;

import com.abc.mail.model.UsersModel;
import com.abc.mail.Repositories.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    public UserDetails FindUser(int UserID) throws UsernameNotFoundException {
        UsersModel user = userRepository.FindUserByID(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
        return new MyUserPrincipal(user);
    }


    
    public String saveUser(UsersModel user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user).toString();
            return "User Already Exist";

        } catch (Exception e) {
            System.out.println(e.toString());
            return e.toString();
        }

    }


  //  public String SaveUser(User);
//

    // public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    //     User user = userRepository.findByEmail(email);
    //     if (user == null) {
    //         throw new UsernameNotFoundException(email);
    //     }
    //     return new MyUserPrincipal(user);
    // }



}
