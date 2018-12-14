import React, {Component} from 'react';
import Request from '../helpers/Request.js';
import ReviewForm from '../components/ReviewForm.js';

class FormsListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {users: [], pubs: []};
    this.handleReviewSubmit = this.handleReviewSubmit.bind(this);
  }

  handleReviewSubmit(review){
    const req = new Request();
    req.post('/address/of/api', review)
    // .then make sure its added or something

  }

  render(){
    return(
      <div>
        <h4>this is a form</h4>
        <h4>this is a second form</h4>
        <ReviewForm
          users={this.state.users}
          pubs={this.state.pubs}
          handleReviewSubmit={this.handleReviewSubmit}
          />
      </div>
    )
  }
}

export default FormsListContainer;
