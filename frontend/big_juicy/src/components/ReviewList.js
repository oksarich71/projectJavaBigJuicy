import React, {Component, Fragment} from 'react';
import Review from './Review.js';

const ReviewList = (props) => {
  const arrayOfReviews = props.reviews.map((rev) => {
    return (

      <div className="is-this-a-review">
        <Review
          // needs a key
          // pub={rev.pub}
          // user={rev.user}
          // // image={rev.image}
          // overall={rev.overall}
          // price={rev.price}
          // text={rev.text}
          name={rev.name}
          species={rev.species}
        />
      </div>

    )
  })

  return (
    <div className="review-thingy">

      <h2>Here is where all the reviews will be listed:</h2>

      {arrayOfReviews}

    </div>
  )
}

export default ReviewList;
