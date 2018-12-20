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

            User user13 = new User("Iain Floyd");
            userRepository.save(user13);
            User user14 = new User("Oksana Richards");
            userRepository.save(user14);
            User user15 = new User("Chris Reid");
            userRepository.save(user15);
            User user16 = new User("Michael Capmbell");
            userRepository.save(user16);
            User user17 = new User("Hugh Brechin");
            userRepository.save(user17);

            User user1 = new User("Jack Bell");
            userRepository.save(user1);
            User user2 = new User("George Whitelow");
            userRepository.save(user2);
            User user3 = new User("Cameron Edwards");
            userRepository.save(user3);
            User user4 = new User("Billy Mate");
            userRepository.save(user4);
            User user5 = new User("Louise Wilkins");
            userRepository.save(user5);
            User user6 = new User("Cameron Jenkins");
            userRepository.save(user6);
            User user7 = new User("Edward Dunn");
            userRepository.save(user7);
            User user8 = new User("Dave D");
            userRepository.save(user8);
            User user9 = new User("Dominic Perry");
            userRepository.save(user9);
            User user10 = new User("Mary McGinn");
            userRepository.save(user10);
            User user11= new User("Ben Dale");
            userRepository.save(user11);
            User user12 = new User("Natasha Richards");
            userRepository.save(user12);
            Pub pub1 = new Pub("Chanter", 3.85, 55.945691, -3.203956);
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
            Pub pub6 = new Pub("Tiles", 4.00, 55.953627, -3.192097);
            pubRepository.save(pub6);
            Pub pub7 = new Pub("Footlights", 4.30, 55.946040, -3.203641);
            pubRepository.save(pub7);
            Pub pub8 = new Pub("Dagda", 3.70, 55.942128, -3.183932);
            pubRepository.save(pub8);
            Pub pub9 = new Pub("The Waiting Room", 3.60, 55.925335, -3.210406);
            pubRepository.save(pub9);

            Review review1 = new Review(10, "Head: 8/10\n" +
                    "Carbonation: 10/10 \n" +
                    "Vessel: 10/10\n" +
                    "Tide lines: well proven\n" +
                    "Taste: 10/10", "12.12.2018", "https://media-cdn.tripadvisor.com/media/photo-s/0d/1b/54/39/pint-of-tennents-at-the.jpg", user2, pub1);
            reviewRepository.save(review1);
            Review review2 = new Review( 9, "Excellent taste, great carbonation. Superb 9 all round", "01.12.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48260340_10155756156351481_3865223335197540352_n.jpg?_nc_cat=105&_nc_ht=scontent-ams3-1.xx&oh=9d54eeeb7b4fbaed0c85566c0bf7fc78&oe=5CA54E77", user1, pub2);
            reviewRepository.save(review2);
            Review review3 = new Review(9, "Head - 8/10. Temperature - Ice cold 10/10. Vessel - As expected 10/10. Carbonation - Reminiscent of Hurricane Bawbag - proud 8/10. Overall a very strong juicy, 9/10", "25.11.2018", "https://scontent-lhr3-1.cdninstagram.com/vp/079aaf5f2586da65e4a7fcad617d8f22/5CAABA17/t51.2885-15/e35/45364182_479266365928525_7590845999425481712_n.jpg?se=7&ig_cache_key=MTkxOTgwNDk1NTYzMjY3OTYxMg%3D%3D.2",user3, pub4);
            reviewRepository.save(review3);
            Review review4 = new Review( 9, "Head-8/10: too much foam in the centre, but I’ll allow it.\n" +
                    "carbonation-9/10\n" +
                    "Taste:10/10: down like water, as per usual.\n" +
                    "Tide lines- 7/10: stellar lines, unfortunately few and far between.\n" +
                    "Vessel- 10/10: cast from clydside sand as it should be.\n" +

                    "Overall- 9/10", "15.11.2018", "https://scontent-atl3-1.cdninstagram.com/vp/066c181eba280a44f6c651b0372f63de/5C37B64E/t51.2885-15/e35/39749597_2144117482528129_6272576650911678464_n.jpg", user10, pub3);

            reviewRepository.save(review4);
            Review review5 = new Review(9, "Head- too skinny 7/10\n" +
                    "Vessel-Xmas classic, easy 10/10\n" +
                    "Carbonation- average 6/10\n" +
                    "Taste-spot on 10/10\n" +
                    "Price - £3 fairly competitive\n" +
                    "Overall superb juicer, will be returning","11.12.2018", "https://media-cdn.tripadvisor.com/media/photo-s/0d/16/91/c7/babu-bombay-street-food.jpg", user1, pub5);
            reviewRepository.save(review5);
            Review review6 = new Review(9, "A fine big juicy (never a fan of yer phone light pish, but tbf it does the pint justice).\n" +
                    "Head - 10/10. Perfect. \n" +
                    "Carbonation - 8/10\n" +
                    "Vessel - 10/10\n" +
                    "Tide lines - TBC\n" +
                    "Taste - 9/10\n" +
                    "Price - £3.60, fair enough. ", "01.12.2018", "https://pbs.twimg.com/media/B0MGqUbCQAAbBco.jpg", user5, pub3);
            reviewRepository.save(review6);
            Review review7 = new Review(10, "Head 11/10\n" +
                    "Taste 10/10\n" +
                    "Carbonisation 10/10\n" +
                    "Vessel - classic T\n" +
                    "Price - not important\n" +
                    "it was the best of times, it was the blurst of times", "16.11.2018", "http://farm3.static.flickr.com/2110/2613327862_7315c4df63_o.jpg", user12, pub4);
            reviewRepository.save(review7);
            Review review8 = new Review( 10, "Heed - fatter than a Morrison’s green grocer 10/10\n" +
                    "Vessel - Frosty & Jolly 10/10\n" +
                    "Carbonation - fizzy\n" +
                    "Tidelines - yet to see but I’m looking forward to sailing the seven shores.", "28.10.2018", "https://pbs.twimg.com/media/Bv4ZV0rIcAE_PdR.jpg", user8, pub2);
            reviewRepository.save(review8);
            Review review9 = new Review( 8, "Nae filters, nae torch, just a solid 8/10 juicy for £3.50\n", "15.10.2018", "https://c1.staticflickr.com/6/5004/29398635824_fa1e5924ab_m.jpg", user7, pub4);
            reviewRepository.save(review9);
            Review review10 =  new Review( 9, "Head - 7 bit steep \n" +
                    "Carbonation - 9 quite lively \n" +
                    "Vessel - 10 classic \n" +
                    "Taste - 10 juicy \n" +
                    "Temp - 10 frosty \n" +
                    "Tide lines tbc", "18.10.2018", "https://pbs.twimg.com/media/BtY-71hCIAAxUon.jpg", user9, pub3);
            reviewRepository.save(review10);
            Review review11 = new Review( 9, "Carbonation - for the nation - 10\n" +
                    "Head - 9 \n" +
                    "Price - A south side snip at £3:45\n" +
                    "Taste - premium 9.5\n" +
                    "Temp - Shove the heater on - 9.5\n" +
                    "Vessel Standard - 9\n", "03.09.2018", "https://dramscotland.co.uk/wp-content/uploads/2016/03/tennents.jpg", user3, pub1);
            reviewRepository.save(review11);
            Review review12 = new Review(8, "Tide lines from heaven 10/10\n" +
                    "Head 7/10\n" +
                    "Carbonation 8/10\n" +
                    "Vessel of course 10/10\n" +
                    "Taste 9/10 for refreshment", "25.10.2018", "https://pbs.twimg.com/media/CdsQY6KW8AQpT7u.jpg", user6, pub2);
            reviewRepository.save(review12);
            Review review13 = new Review( 8, "Vessel 5/10 as it’s an old one \n" +
                    "Taste 8/10 \n" +
                    "Head 8/10 \n" +
                    "All round no bad juicy and seen as it’s a Tuesday it tastes bloody marvellous", "25.09.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48373499_2028230560546340_322147324866330624_n.jpg?_nc_cat=106&_nc_ht=scontent-ams3-1.xx&oh=a23e679b2d4e75afc259c79fc35a8de5&oe=5CADB031", user7, pub5);
            reviewRepository.save(review13);
            Review review14 = new Review( 8, "Vessel - 10/10\n" +
                    "Head - 4/10 its trapping the Simpsons in.\n" +
                    "Carbonation - a solid 8/10 ", "25.11.2018", "https://www.pieandbovril.com/forum/uploads/monthly_2018_04/CF5301C9-6D42-405C-9101-BA4773603FED.jpeg.bd2ec484ea3a4fc38be4626599f9acab.jpeg", user8, pub1);
            reviewRepository.save(review14);
            Review review15 = new Review(10, "10/10 for head \n" +
                    "Vessel 10/10\n" +
                    "Tide lines tbc\n" +
                    "All around cracking pint", "05.12.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48387129_10205725146484850_8383652037237145600_n.jpg?_nc_cat=109&_nc_ht=scontent-ams3-1.xx&oh=28b1bbc628a3bcb05617c7193eeb8c80&oe=5CA48754", user9, pub2);
            reviewRepository.save(review15);
            Review review16 = new Review(9, "First Time post long time juicer \n" +
                    "Head 10/10\n" +
                    "Vessel classic 10/10\n" +
                    "Carbonation 7/10\n" +
                    "Temp a cool 8/10\n" +
                    "Head 10/10\n" +
                    "Tide lines: not shown but a solid 7/10\n", "09.12.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48059326_718896928503722_5183967947940429824_o.jpg?_nc_cat=107&_nc_ht=scontent-ams3-1.xx&oh=66ad013bd2480733d84d4ed9829fd629&oe=5C9C83B4", user10, pub4);
            reviewRepository.save(review16);
            Review review17 = new Review(10, "11/10 for this sexy bad boy.....\n" +
                    " nice big frothy head..like an ice cream float but alcoholic...my life is made", "15.12.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48381641_10155888111740857_6269863051919360000_n.jpg?_nc_cat=103&_nc_ht=scontent-ams3-1.xx&oh=f5696aaedf0571de15a8ba6c93778b32&oe=5C8B1772", user12, pub3);
            reviewRepository.save(review17);
            Review review18 = new Review(5, "Head: non-existent\n" +
                    "Vessel: wrong\n" +
                    "Carbonation: flat\n" +
                    "Tide lines: don't care anymore\n" +
                    "Price: too much", "10.12.2018", "https://scontent-ams3-1.xx.fbcdn.net/v/t1.0-9/48424988_2556802214346153_6937252140234571776_o.jpg?_nc_cat=104&_nc_ht=scontent-ams3-1.xx&oh=45717c0766aea89deff121ae609a990b&oe=5CD7E72F", user11, pub4);
            reviewRepository.save(review18);














        }
    }





