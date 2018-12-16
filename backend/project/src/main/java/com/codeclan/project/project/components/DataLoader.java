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
            Pub pub1 = new Pub("Chanter", 3.7, 55.945691, -3.203956);
            pubRepository.save(pub1);
            Pub pub2 = new Pub("Teviot Row House", 3.9, 55.944728, -3.189007);
            pubRepository.save(pub2);
            Pub pub3 = new Pub("Argyle Bar", 4.2, 55.938311, -3.191750);
            pubRepository.save(pub3);
            Pub pub4 = new Pub("Cask and Barrel Southside", 4.5,
                    55.939009, -3.180055);
            pubRepository.save(pub4);
            Pub pub5 = new Pub("The Merlin", 3.8, 55.929056, -3.210270);
            pubRepository.save(pub5);
            Review review1 = new Review(10, "Head: Monica Lewinsky\n" +
                    "Carbonation: Roy Keane, away to Juventus in ‘99; volatile \n" +
                    "Vessel: 10/10\n" +
                    "Tide lines: artic shelf \n" +
                    "Taste: 10/10", "12.12.2018", user2, pub1);
            reviewRepository.save(review1);
            Review review2 = new Review( 9, "Excellent taste, great carbonation\n" +
                    "Superb 9 all round", "01.12.2018", user1, pub2);
            reviewRepository.save(review2);
            Review review3 = new Review(9, "Head - 8/10\n" +
                    "Temperature - Ice cold 10/10\n" +
                    "Vessel - As expected 10/10\n" +
                    "Carbonation - Reminiscent of Hurricane Bawbag - proud 8/10\n" +
                    "Overall a very strong juicy, 9/10", "25.11.2018", user3, pub4);
            reviewRepository.save(review3);
            Review review4 = new Review( 9, "Head-8/10: too much foam in the centre, but I’ll allow it.\n" +
                    "carbonation-9/10\n" +
                    "Taste:10/10: down like water, as per usual.\n" +
                    "Tide lines- 7/10: stellar lines, unfortunately few and far between.\n" +
                    "Vessel- 10/10: cast from clydside sand as it should be.\n" +
                    "Overall- 9/10: hits the spot. Just what a man needs", "15.11.2018", user10, pub3);
            reviewRepository.save(review4);
            Review review5 = new Review(9, "Head- too skinny 7/10\n" +
                    "Vessel-Xmas classic, easy 10/10\n" +
                    "Carbonation- average 6/10\n" +
                    "Taste-spot on 10/10\n" +
                    "Price - £3 fairly competitive\n" +
                    "Overall superb juicer, will be returning","11.12.2018", user1, pub5);
            reviewRepository.save(review5);
            Review review6 = new Review(9, "A fine big juicy (never a fan of yer phone light pish, but tbf it does the pint justice).\n" +
                    "Head - 10/10. Perfect. \n" +
                    "Carbonation - 8/10\n" +
                    "Vessel - 10/10\n" +
                    "Tide lines - TBC\n" +
                    "Taste - 9/10\n" +
                    "The game - 2/10 so far...\n" +
                    "Price - £3.60, fair enough. ", "01.12.2018", user5, pub3);
            reviewRepository.save(review6);
            Review review7 = new Review(10, "Head 11/10\n" +
                    "Taste 10/10\n" +
                    "Carbonisation 10/10\n" +
                    "Vessel - classic T\n" +
                    "Price - not important\n" +
                    "it was the best of times, it was the blurst of times", "16.11.2018", user12, pub4);
            reviewRepository.save(review7);
            Review review8 = new Review( 10, "Heed - fatter than a Morrison’s green grocer 10/10\n" +
                    "Vessel - Frosty & Jolly 10/10\n" +
                    "Carbonation - fizzy\n" +
                    "Tidelines - yet to see but I’m looking forward to sailing the seven shores.", "28.10.2018", user8, pub2);
            reviewRepository.save(review8);
            Review review9 = new Review( 8, "Nae filters, nae torch, just a solid 8/10 juicy for £3.50\n", "15.10.2018", user7, pub4);
            reviewRepository.save(review9);
            Review review10 =  new Review( 9, "Head - 7 bit steep \n" +
                    "Carbonation - 9 quite lively \n" +
                    "Vessel - 10 classic \n" +
                    "Taste - 10 juicy \n" +
                    "Temp - 10 frosty \n" +
                    "Tide lines tbc", "18.10.2018", user9, pub3);
            reviewRepository.save(review10);
            Review review11 = new Review( 9, "Carbonation - for the nation - 10\n" +
                    "Head - 9 \n" +
                    "Price - A south side snip at £3:45\n" +
                    "Taste - premium 9.5\n" +
                    "Temp - Shove the heater on - 9.5\n" +
                    "Vessel Standard - 9\n", "03.09.2018", user3, pub1);
            reviewRepository.save(review11);
            Review review12 = new Review(8, "Tide lines from heaven 10/10\n" +
                    "Head 7/10\n" +
                    "Carbonation 8/10\n" +
                    "Vessel of course 10/10\n" +
                    "Taste 9/10 for refreshment", "25.10.2018", user6, pub2);
            reviewRepository.save(review12);
            Review review13 = new Review( 8, "Vessel 5/10 as it’s an old one \n" +
                    "Taste 8/10 \n" +
                    "Head 8/10 \n" +
                    "All round no bad juicy and seen as it’s a Tuesday it tastes bloody marvellous", "25.09.2018", user7, pub5);
            reviewRepository.save(review13);
            Review review14 = new Review( 8, "Vessel - 10/10\n" +
                    "Head - 4/10 its trapping the Simpsons in.\n" +
                    "Carbonation - a solid 8/10 ", "25.11.2018", user8, pub1);
            reviewRepository.save(review14);
            Review review15 = new Review(10, "10/10 for head \n" +
                    "Vessel 10/10\n" +
                    "Tide lines tbc\n" +
                    "All around cracking pint", "05.12.2018", user9, pub2);
            reviewRepository.save(review15);
            Review review16 = new Review(9, "First Time post long time juicer \n" +
                    "Head 10/10\n" +
                    "Vessel classic 10/10\n" +
                    "Carbonation 7/10\n" +
                    "Temp a cool 8/10\n" +
                    "Head 10/10\n" +
                    "Tide lines: not shown but a solid 7/10\n", "09.12.2018", user10, pub4);
            reviewRepository.save(review16);
            Review review17 = new Review(10, "11/10 for this sexy bad boy.....\n" +
                    " nice big frothy head..like an ice cream float but alcoholic...my life is made", "15.12.2018", user12, pub3);
            reviewRepository.save(review17);
            Review review18 = new Review(5, "Head: non-existent\n" +
                    "Vessel: wrong\n" +
                    "Carbonation: flat\n" +
                    "Tide lines: don't care anymore\n" +
                    "Price: too much", "10.12.2018", user11, pub4);
            reviewRepository.save(review18);














        }
    }





