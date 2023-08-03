package com.sahia.authorization.repositories;

import com.sahia.authorization.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
