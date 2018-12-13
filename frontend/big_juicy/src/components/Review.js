import React from 'react';

const Review = (props) => {
  // if (!props.pub && !props.user) {
  //   return <h2>Reviews are...</h2>
  // }

  return (
    <div className="review-box">
      <h4>this is a review</h4>
      <p>overall: 10/10</p>
      <p>£3</p>
    </div>
  )
}

export default Review;
