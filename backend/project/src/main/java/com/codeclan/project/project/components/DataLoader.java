package com.codeclan.project.project.components;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.models.User;
import com.codeclan.project.project.repositories.PubRepository.PubRepository;
import com.codeclan.project.project.repositories.ReviewRepository.ReviewRepository;
import com.codeclan.project.project.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    PubRepository pubRepository;

    public DataLoader() {
    }
        public void run(ApplicationArguments args) {

            User user1 = new User("Jack Bell");
            userRepository.save(user1);
            User user2 = new User("George Whitelow");
            userRepository.save(user2);
            User user3 = new User("Cameron Edwards");
            userRepository.save(user3);
            User user4 = new User("Cameron Edwards");
            userRepository.save(user4);
            User user5 = new User("Louise Wilkins");
            userRepository.save(user5);
            User user6 = new User("Cameron Jenkins");
            userRepository.save(user6);
            User user7 = new User("Edward Dunn");
            userRepository.save(user7);
            User user8 = new User("Edward Dunn");
            userRepository.save(user8);
            User user9 = new User("Dominic Perry");
            userRepository.save(user9);
            User user10 = new User("Mary McGinn");
            userRepository.save(user10);
            User user11= new User("Ben Dale");
            userRepository.save(user11);
            User user12 = new User("Natasha Richards");
            userRepository.save(user12);
            Pub pub1 = new Pub("Chanter", 55.945691, -3.203956);
            pubRepository.save(pub1);
            Pub pub2 = new Pub("Teviot Row House", 55.944728, -3.189007);
            pubRepository.save(pub2);
            Pub pub3 = new Pub("Argyle Bar", 55.938311, -3.191750);
            pubRepository.save(pub3);
            Pub pub4 = new Pub("Cask and Barrel Southside", 55.939009, -3.180055);
            pubRepository.save(pub4);
            Pub pub5 = new Pub("The Merlin", 55.929056, -3.210270);
            pubRepository.save(pub5);
            Review review1 = new Review(2.20, 10, "Head: Monica Lewinsky\n" +
                    "Carbonation: Roy Keane, away to Juventus in ‘99; volatile \n" +
                    "Vessel: 10/10\n" +
                    "Tide lines: artic shelf \n" +
                    "Taste: 10/10", "12.12.2018", user2, pub1);
            Review review2 = new Review(2.7, 9, "Excellent taste, great carbonation\n" +
                    "Superb 9 all round", "01.12.2018", user1, pub2);
            Review review3 = new Review(3.8, 9, "Head - 8/10\n" +
                    "Temperature - Ice cold 10/10\n" +
                    "Vessel - As expected 10/10\n" +
                    "Carbonation - Reminiscent of Hurricane Bawbag - proud 8/10\n" +
                    "Overall a very strong juicy, 9/10", "25.11.2018", user3, pub4);










        }
    }





