package com.anuj.intuit.craft.dao;

import com.anuj.intuit.craft.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long >{
}
