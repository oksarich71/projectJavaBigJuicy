package com.codeclan.project.project;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.models.User;
import com.codeclan.project.project.repositories.PubRepository.PubRepository;
import com.codeclan.project.project.repositories.ReviewRepository.ReviewRepository;
import com.codeclan.project.project.repositories.UserRepository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApplicationTests {
	@Autowired
	UserRepository userRepository;
	@Autowired
	PubRepository pubRepository;
	@Autowired
	ReviewRepository reviewRepository;


	@Test
	public void contextLoads() {

	}
	@Test
	public void canGetReview(){

	}
	@Test
	public void canGetPubName(){
		Pub pub = new Pub("Chanter", 3.7, 55.945691, -3.203956);
		assertEquals("Chanter", pub.getName());
	}
	@Test
	public void canFindAllPubs(){
		List<Pub> found = pubRepository.findAll();
		assertEquals(5, found.size());
	}
	@Test
	public void canFindAllUsers(){
		List<User> found = userRepository.findAll();
		assertEquals(12, found.size());
	}
	@Test
	public void canFindAllReviews(){
		List<Review> found = reviewRepository.findAll();
		assertEquals(18, found.size());
	}

	@Test
	public void canGetAllReviewsForUser(){
		List<Review> results = userRepository.getAllReviewsForUser(2L);
	}
	@Test
	public void canGetReviewsForPub(){
		List<Review> results = pubRepository.getAllReviewsForPub(3L);

	}
	@Test
	public void canGetAllReviewsForDate(){
		List<Review> found = reviewRepository.getAllReviewsForDate("01.12.2018");
		assertEquals(2, found.size());
	}

	@Test
	public void canSaveReview(){
		Pub pub1 = new Pub("pub name", 3.5, 55.60, -3.4);
		pubRepository.save(pub1);
		User user1 = new User("iain");
		userRepository.save(user1);
		Review review1 = new Review(4, "bad pint", "01.12.2018", "image url here", user1, pub1 );
		reviewRepository.save(review1);
		List<Review> found = reviewRepository.getAllReviewsForDate("01.12.2018");
		assertEquals(3, found.size());
	}


}

