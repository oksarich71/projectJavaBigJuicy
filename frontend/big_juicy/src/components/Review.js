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
      <p>Venue: {props.pub}</p>
      <p>Review by: {props.user}</p>
      <p>Reviewed on: {props.date}</p>
      <p>Overall Rating: {props.rating}</p>
      <p>Text: {props.text}</p>
      <img src={props.image}></img>  
    </div>
  )
}

export default Review;

// <p>User: {props.user}</p>
// <p>Pub: {props.pub}</p>
// <p>Price: {props.price}</p>
// <p>Overall: {props.overall}</p>
// <p>Text: {props.text}</p>
