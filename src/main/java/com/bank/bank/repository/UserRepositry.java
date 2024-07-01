package com.bank.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.bank.entity.User;

public interface UserRepositry  extends JpaRepository<User,Long>{
    Boolean existByEmail(String email);
} 