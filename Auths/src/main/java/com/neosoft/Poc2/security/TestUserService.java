package com.neosoft.Poc2.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.neosoft.SpringBoot.Exception.ResourceNotFoundException;

@Service
public class TestUserService implements UserDetailsService{
	@Autowired
    TestUserRepository testUserRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<TestUser> user = testUserRepository.findByUserName(userName);
		user.orElseThrow(()->new ResourceNotFoundException("User", "User name", userName));
		return user.map(TestUserDetails::new).get();
	}

}
