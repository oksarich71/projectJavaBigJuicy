import React from 'react';
import Review from './Review.js';

const ReviewList = (props) => {
  const arrayOfReviews = props.reviews.map((rev) => {
    return (

      <div className="is-this-a-review">
        <Review
          // needs a key
          // pub={rev.links}
          // user={rev.user}
          // // image={rev.image}
          rating={rev.rating}
          // price={rev.price}
          text={rev.text}
          date={rev.date}
        />
      </div>

    )
    //do we now need to sort arrayOfReviews so that the newest review is at the top?
    //how does the id parameter work?
    //we submit a review, it is saved to the api, we get all reviews from the api
    //we want the most recent review to be at the top
  })

  return (
    <div className="review-thingy">

      <h2>Here is where all the reviews will be listed:</h2>

      {arrayOfReviews}

    </div>
  )
}

export default ReviewList;
