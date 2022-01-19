package com.neosoft.Poc2.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TestUserRepository  extends JpaRepository<TestUser, Integer>{
   Optional<TestUser> findByUserName(String userName);
}
