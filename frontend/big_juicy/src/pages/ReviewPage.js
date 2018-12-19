import React from 'react';
import FormsListContainer from '../containers/FormsListContainer.js';
import ReviewListContainer from '../containers/ReviewListContainer.js';


const ReviewPage = (props) => {
  return (
    <div className="reviews">
      <h2>Reviews</h2>
      <FormsListContainer/>
      <ReviewListContainer/>
    </div>
  )
}

export default ReviewPage;
