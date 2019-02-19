package fr.ipme.coupe;

import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoupeApplicationTests {


	@Autowired
	private MatchRepository matchRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads()
	{



	}

}

