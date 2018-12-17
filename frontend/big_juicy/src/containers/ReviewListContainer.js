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
    req.get('http://hp-api.herokuapp.com/api/characters/students')
    .then((data) => {
    this.setState({reviews: data})
    console.log("this is this.state.reviews:", this.state.reviews);
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
