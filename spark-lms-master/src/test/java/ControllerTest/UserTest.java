package ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spark.lms.model.User;
import com.spark.lms.service.UserService;



@SpringBootTest
public class UserTest {
	
	@Autowired
	protected UserService users;
	
	@Test
	public void localizaUsuario() {
		//User users = this.users.findByUsername("Mr. Admin");
		//assertThat(users.getUsername()).isEqualTo("Mr. Admin");
		
		User users = this.users.getByUsername("admin");
		
		assertThat(users).isEqualTo("admin");
		//assertThat(users.getUsername()).getId(0)).isEqualTo("admin");
	}

}
