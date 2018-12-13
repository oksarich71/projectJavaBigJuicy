import React, {Component} from 'react';
import ReviewList from '../components/ReviewList.js';

class ReviewListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {reviews: []}
  }


  componentDidMount(){
    let req = new Request()
    req.get('/SampleDataSet.JSON').then((data) => {
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
