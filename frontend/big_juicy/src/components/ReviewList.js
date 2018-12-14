import React, {Component, Fragment} from 'react';
import Review from './Review.js';

const ReviewList = (props) => {
  const arrayOfReviews = props.reviews.map((rev) => {
    return (
      <li key={rev.id}>
      <div className="is-this-a-review">
        <Review
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
      </li>
    )
  })

  return (
    <div className="review-thingy">

      {arrayOfReviews}

    </div>
  )
}

export default ReviewList;
