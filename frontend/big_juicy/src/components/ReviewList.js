import React from 'react';
import Review from './Review.js';

const ReviewList = (props) => {
  const arrayOfReviews = props.reviews.map((rev) => {
    return (

      <div className="is-this-a-review">
        <Review
          // needs a key
          pub={rev.pub.name}
          user={rev.user.name}
          date={rev.date}
          image={rev.image} className="image"
          rating={rev.rating}
          text={rev.text}
        />
      </div>

    )
    //do we now need to sort arrayOfReviews so that the newest review is at the top?
    //how does the id parameter work?
    //we submit a review, it is saved to the api, we get all reviews from the api
    //we want the most recent review to be at the top
  })
  const backwardsArrayOfReviews = arrayOfReviews.reverse();

  return (
    <div className="review-thingy">

      <h2></h2>

      {backwardsArrayOfReviews}

    </div>
  )
}

export default ReviewList;
