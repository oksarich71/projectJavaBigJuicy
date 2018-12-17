import React, {Component} from 'react';
import ReviewList from '../components/ReviewList.js';
import Request from '../helpers/Request.js';

class ReviewListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {reviews: []}
  }


  componentDidMount(){
    let req = new Request()
    console.log("didmount method has been called in reviewlistcontainer");
    req.get('http://localhost:8080/api/reviews')
    .then((data) => {
    this.setState({reviews: data._embedded.reviews})
    })

  }

  render(){
    return(
      <div>
        <ReviewList reviews={this.state.reviews}/>
      </div>
    )
  }
}

export default ReviewListContainer;
