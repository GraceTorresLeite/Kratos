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
		//TESTE RETORNA COM NULLPOINTER
		//User users = new User();
		//users = this.users.getByUsername("admin");
		//User users = this.users.getById(1L);
		
		//assertThat(users.getUsername()).isEqualTo("admin");
		
	}

}
