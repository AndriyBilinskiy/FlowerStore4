package ua.edu.ucu.apps.demo.appUser;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }
}
