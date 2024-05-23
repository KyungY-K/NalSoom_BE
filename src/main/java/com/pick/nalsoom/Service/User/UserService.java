package com.pick.nalsoom.Service.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pick.nalsoom.Domain.User.User;
import com.pick.nalsoom.Dto.User.UserDto;
import com.pick.nalsoom.Repository.User.UserRepository;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    // 회원가입
    public Boolean join(UserDto userDto) {
        User result = userRepository.save(userDto.toEntity());
        if (result != null) {
            return true;
        } else {
            return false;
        }
    }

    // 아이디 중복검사
    public Boolean idDuplicateCheck(String userId) {
        Optional<User> result = userRepository.findByUserId(userId);
        if (result.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
