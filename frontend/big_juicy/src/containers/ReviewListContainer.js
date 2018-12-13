import React, {Component} from 'react';
import ReviewList from '../components/ReviewList.js';

class ReviewListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {reviews: []}
  }


  componentDidMount(){
    //make get request here
    //then remove the line below that says 'return null'
    // let req = new Request()
    //req.get('address of api').then((data) => {
    //this.setState({reviews: data._embedded.WHATGOESHERE})
    //})
    return null;
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
