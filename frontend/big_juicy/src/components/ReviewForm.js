import React, {Component} from 'react';

class ReviewForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      user: "",
      pub: "",
      image: "",
      review: "",
      overall: "",
      price: ""

    };
    this.handleImageTextChange = this.handleImageTextChange.bind(this);
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleDateChange = this.handleDateChange.bind(this);
    // this.handleSubmit = this.handleSubmit.bind(this);
  };

  handleImageTextChange(event){
    const imageUrl = event.target.value;
    this.setState({image: imageUrl})
  }

  handleTextChange(event){
    const inputText = event.target.value;
    this.setState({review: inputText})
  }

  handleDateChange(event){
    const inputText = event.target.value;
    this.setState({date: inputText})
  }

  //i dont curently have a handleRatingChange
  //or a handlePriceChange
  //see if theyre necessary

  handleSubmit(event){
    event.preventDefault();
    const {user, pub, image, review, overall, date} = this.state;

    if (!user || !pub || !overall) {
      return;
    }

    const newReview = {
      user: user,
      pub: pub,
      image: image,
      review: review,
      overall: overall,
      date: date
    };
    this.props.handleReviewSubmit(newReview);
    this.setState({user: "", pub: "", image: "", review: "", overall: "", date: ""});
  }



  render(){

    const allUsers = this.props.users.map((user, index) => {
      return <option key={index} value={user.name}>{user.name}</option>
    })

    const allPubs = this.props.pubs.map((pub, index) => {
      return <option key={index} value={pub.name}>{pub.name}</option>
    })


    return(
      <form className="form" onSubmit={this.handleSubmit}>

        <h3>Add a review:</h3>

        <div className="form-item">
          <label>Select User</label>
          <select name="user">
              {allUsers}
          </select>
        </div>

        <div className="form-item">
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
          <label>Overall rating:</label>
          <input id="rating" type="number" min="0" max="10"/>
        </div>

        <div className="form-item">
          <label>Data:</label>
          <input
            type="text"
            placeholder="Enter date"
            value={this.state.date}
            onChange={this.handleDateChange}
          />
        </div>


        <div className="form-item">
          <label>Write your review here:</label>
          <br/>
          <textarea
            rows="6"
            columns="10"
            placeholder="Enter review here"
            value={this.state.review}
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
