package com.marcossial.SpringAPI.repository;

import com.marcossial.SpringAPI.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
