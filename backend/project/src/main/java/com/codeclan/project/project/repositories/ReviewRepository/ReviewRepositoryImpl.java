package com.codeclan.project.project.repositories.ReviewRepository;

import com.codeclan.project.project.models.Review;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class ReviewRepositoryImpl {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Review> getAllReviewsForDate(String date){
        List<Review> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Review.class);
            cr.add(Restrictions.eq("date", date));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;

    }
}
