package ua.edu.ucu.apps.demo.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.apps.demo.flower.Flower;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
