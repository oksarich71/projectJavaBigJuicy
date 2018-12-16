import React from 'react';
import FormsListContainer from './FormsListContainer.js';
import ReviewListContainer from './ReviewListContainer.js';


const ReviewPage = (props) => {
  return (
    <div>
      <h2>Reviews</h2>
      <FormsListContainer/>
      <ReviewListContainer/>
    </div>
  )
}

export default ReviewPage;
