import React, {Component} from 'react';

class ReviewForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      user: "",
      pub: "",
      image: "",
      text: "",
      rating: "",
      date: ""

    };
    this.handleImageTextChange = this.handleImageTextChange.bind(this);
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleDateChange = this.handleDateChange.bind(this);
    this.handleRatingChange = this.handleRatingChange.bind(this);
    this.handleUserChange = this.handleUserChange.bind(this);
    this.handlePubChange = this.handlePubChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  };

  handleImageTextChange(event){
    const imageUrl = event.target.value;
    this.setState({image: imageUrl})
  }

  handleTextChange(event){
    const inputText = event.target.value;
    this.setState({text: inputText})
  }

  handleDateChange(event){
    const inputText = event.target.value;
    this.setState({date: inputText})
  }

  handleRatingChange(event){
    const input = event.target.value;
    this.setState({rating: input})
  }

  handleUserChange(event){
    const actualUser = this.props.users[event.target.value]
    this.setState({user: actualUser.id})
  }

  handlePubChange(event){
    const input = this.props.pubs[event.target.value];
    this.setState({pub: input.id})
  }

  handleDateChange(event){
    const inputText = event.target.value;
    this.setState({date: inputText})
  }


  handleSubmit(event){
    event.preventDefault();
    const {user, pub, image, text, rating, date} = this.state;

    if (!user || !pub || !rating) {
      console.log("something wrong in reviewform submit");
      return;
    }

    const newReview = {
      user: "http://localhost:8080/api/users/" + user,
      pub: "http://localhost:8080/api/pubs/" + pub,
      image: image,
      text: text,
      rating: rating,
      date: date
    };
    this.props.handleReviewSubmit(newReview);
    this.setState({user: "", pub: "", image: "", text: "", rating: "", date: ""});
  }



  render(){

    const allUsers = this.props.users.map((user, index) => {
      return <option key={index} value={index}>{user.name}</option>
    })


    const allPubs = this.props.pubs.map((pub, index) => {
      return <option key={index} value={index}>{pub.name}</option>
    })


    return(
      <form className="form" onSubmit={this.handleSubmit}>

        <h3>Add a review:</h3>

        <div className="form-item">
          <label>Select User</label>
          <select name="user" onChange={this.handleUserChange}>
              {allUsers}
          </select>
        </div>

        <div className="form-item" onChange={this.handlePubChange}>
          <label>Select Pub</label>
          <select name="pub">
              {allPubs}
          </select>
        </div>

        <div className="form-item">
          <label>Add image:</label>
          <input
            type="text"
            placeholder="Enter url"
            value={this.state.image}
            onChange={this.handleImageTextChange}
          />
        </div>

        <div className="form-item">
          <label>Date reviewed:</label>
          <input
            type="text"
            placeholder="Enter date here"
            value={this.state.date}
            onChange={this.handleDateChange}
          />
        </div>


        <div className="form-item">
          <label>Overall rating:</label>
          <input id="rating" type="number" min="0" max="10" onChange={this.handleRatingChange}/>
        </div>




        <div className="form-item">
          <label>Write your review here:</label>
          <br/>
          <textarea
            rows="6"
            columns="10"
            placeholder="Enter review here"
            value={this.state.text}
            onChange={this.handleTextChange}
            >
          </textarea>
        </div>

        <div className="form-item">
          <input
            type="submit"
            value="Post"
          />
        </div>

      </form>
    )
  }
}

export default ReviewForm;

// <div className="form-item">
//   <label>Price: £</label>
//   <input id="price" type="number" step=".01" min="0"/>
// </div>
