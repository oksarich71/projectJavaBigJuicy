import React from 'react';

const Review = (props) => {

  if (!props.rating && !props.text) {
    return <h2>Reviews are loading...</h2>
  }


  return (
    <div className="review-box">
      <p>Reviewed on: {props.date}</p>
      <p>Overall: {props.rating}</p>
      <p>Text: {props.text}</p>
    </div>
  )
}

export default Review;

// <p>Location: {props.pub}</p>
// <p>Reviwed by: {props.user}</p>
// <img src={props.image}>
