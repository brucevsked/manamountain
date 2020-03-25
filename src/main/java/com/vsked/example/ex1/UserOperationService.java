package com.vsked.example.ex1;

//领域驱动服务
//@Service
public class UserOperationService{
    //@Autowired
    private UserRepository userRepository;
    public void activate(User user){
        user.activate();
        userRepository.save(user);
    }
}
