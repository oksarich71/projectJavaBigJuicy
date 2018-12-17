import React from 'react';

const Review = (props) => {
  // if (!props.pub && !props.user) {
  //   return <h2>Reviews are loading...</h2>
  // }
  if (!props.rating && !props.text) {
    return <h2>Reviews are loading...</h2>
  }


  return (
    <div className="review-box">
      <p>Rating: {props.rating}</p>
      <p>Text: {props.text}</p>
    </div>
  )
}

export default Review;

// <p>User: {props.user}</p>
// <p>Pub: {props.pub}</p>
// <p>Price: {props.price}</p>
// <p>Overall: {props.overall}</p>
// <p>Text: {props.text}</p>
