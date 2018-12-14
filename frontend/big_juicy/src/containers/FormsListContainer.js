import React, {Component} from 'react';
import Request from '../helpers/Request.js';
import ReviewForm from '../components/ReviewForm.js';
import PubForm from '../components/PubForm.js';
import UserForm from '../components/UserForm.js';

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
    req.get("http://hp-api.herokuapp.com/api/characters/students")
    .then((data) => {
      this.setState({pubs: data})
    }).then(() => {
      req.get("http://hp-api.herokuapp.com/api/characters/students")
      .then((data) => {
        this.setState({users: data})
      });
    });
  }

  handleReviewSubmit(review){
    const req = new Request();
    req.post('/address/of/api', review)
    // .then make sure its added or something
  }

  handleUserSubmit(user){
    const req = new Request();
    req.post('address', user)
    // better make sure I can make multiple post requests here
  }

  handlePubSubmit(pub){
    const req = new Request();
    req.post('address', pub)
    //better make sure I can make multiple post requests
  }

  render(){
    return(
      <div>
        <h3>Add a new user:</h3>
        <UserForm
          handleUserSubmit={this.handleUserSubmit}
        />
        <h3>Add a new pub</h3>
        <PubForm
          handlePubSubmit={this.handlePubSubmit}
        />
        <h3>Add a new review</h3>
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
