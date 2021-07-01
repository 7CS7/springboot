package com.example.userRegn;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.userRegn.dao.UserRepository;
import com.example.userRegn.entity.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestRepository {
	@Autowired
private UserRepository userRepo;
	@Autowired
	private TestEntityManager tem;
	@Test
	public void create() {
		User u=new User();
		u.setFirstName("Gopal");
		u.setLastName("verma");
		u.setEmail("gopal@mail.com");
		u.setPassword("gopal2020");
		User savedUser=userRepo.save(u);
		
		User existUser=tem.find(User.class, savedUser.getId());
		assertThat(existUser.getEmail()).isEqualTo(u.getEmail());
	}
}
