package com.sda.springboot.angulardemo.repository;

import com.sda.springboot.angulardemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {



}
