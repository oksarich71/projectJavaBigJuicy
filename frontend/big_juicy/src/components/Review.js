import React from 'react';

const Review = (props) => {

  if (!props.rating && !props.text) {
    return <h2>Reviews are loading...</h2>
  }


  return (
    <div className="review-box">
<<<<<<< HEAD
      <p>Reviewed on: {props.date}</p>
      <p>Overall: {props.rating}</p>
=======
      <p>Venue: {props.pub}</p>
      <p>Review by: {props.user}</p>
      <p>Reviewed on: {props.date}</p>
      <p>Overall Rating: {props.rating}</p>
>>>>>>> develop
      <p>Text: {props.text}</p>
      <img src={props.image}></img>  
    </div>
  )
}

export default Review;

// <p>Location: {props.pub}</p>
// <p>Reviwed by: {props.user}</p>
// <img src={props.image}>
