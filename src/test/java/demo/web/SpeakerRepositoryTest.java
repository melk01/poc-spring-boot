package demo.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.domain.Speaker;
import demo.domain.SpeakerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpeakerRepositoryTest {
	
	@Autowired
	private SpeakerRepository repository;
	
	@Test
	public void testFindByTwitter(){
		Speaker dave = repository.save(new Speaker("david_syer","Syer","DAve", "blabla", "bio"));
		Assert.assertTrue(repository.findByTwitter("blabla").getId().equals(dave.getId()));
	}

}
