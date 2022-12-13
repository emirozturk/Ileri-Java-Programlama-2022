package com.emirozturk.benzerbul.DataAccess;

import com.emirozturk.benzerbul.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
