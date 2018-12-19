import React, {Component} from 'react';
import Request from '../helpers/Request.js';
import ReviewForm from '../components/ReviewForm.js';
import PubForm from '../components/PubForm.js';
import UserForm from '../components/UserForm.js';
import ReviewListContainer from './ReviewListContainer.js';

class FormsListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {users: [], pubs: []};
    this.handleReviewSubmit = this.handleReviewSubmit.bind(this);
    this.handlePubSubmit = this.handlePubSubmit.bind(this);
    this.handleUserSubmit = this.handleUserSubmit.bind(this);
  }

  componentDidMount(){
    const req = new Request();
    req.get("http://localhost:8080/api/pubs")
    .then((data) => {
      this.setState({pubs: data._embedded.pubs})
    }).then(() => {
      req.get("http://localhost:8080/api/users")
      .then((data) => {
        this.setState({users: data._embedded.users})
      });
    });
  }
  //do you want to sort the data so the newest thing is at the top of the list?

  handleReviewSubmit(review){
    const req = new Request();
    req.post('http://localhost:8080/api/reviews', review)
    .then(() => {
      this.componentDidMount();
    })
    .then(() => {
      const rlc = new ReviewListContainer();
      rlc.populate();
    })
    // .then make sure its added or something
    //maybe show a <p> review added! </p> or something
  }

  handleUserSubmit(user){
    const req = new Request();
    req.post('http://localhost:8080/api/users', user)
    .then(() => {
      this.componentDidMount();
    })
    // better make sure I can make multiple post requests here
    //maybe show a <p> user added! </p> or something
  }

  handlePubSubmit(pub){
    const req = new Request();
    req.post('http://localhost:8080/api/pubs', pub)
    .then(() => {
      this.componentDidMount();
    })
    //better make sure I can make multiple post requests
    //maybe show a <p> pub added! </p> or something
  }

  render(){
    return(
      <div>

        <UserForm
          handleUserSubmit={this.handleUserSubmit}
        />

        <PubForm
          handlePubSubmit={this.handlePubSubmit}
        />

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
