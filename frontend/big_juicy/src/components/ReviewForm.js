import React, {Component, Fragment} from 'react';

class ReviewForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      image: "",
      review: "",
      overall: "",
      price: ""

    };
    this.handleImageTextChange = this.handleImageTextChange.bind(this);
    this.handleTextChange = this.handleTextChange.bind(this);
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

  //i dont curently have a handleRatingChange
  //or a handlePriceChange
  //see if theyre necessary

  handleSubmit(event){
    event.preventDefault();
    const {image, review, overall, price} = this.state;

    // if (!user || !pub || !overall) {
    //   return;
    // }

    const newReview = {
      image: image,
      review: review,
      overall: overall,
      price: price
    };
    this.props.handleReviewSubmit(newReview);
    this.setState({image: "", review: "", overall: "", price: ""});
  }



  render(){

    const allUsers = this.props.users.map((user, index) => {
      return <option key={index} value={user.name}>{user.name}</option>
    })
    
    const allPubs = this.props.pubs.map((pub, index) => {
      return <option key={index} value={pub.species}>{pub.species}</option>
    })


    return(
      <form onSubmit={this.handleSubmit}>

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
          <label>Price: £</label>
          <input id="price" type="number" step=".01"/>
        </div>

        <div className="form-item">
          <label>Add some text to this review:</label>
          <input
            type="text"
            placeholder="Enter review here"
            value={this.state.review}
            onChange={this.handleTextChange}
          />
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


//need to make drop-down menu for users and pubs and populate dynamically
// <div class="form-item">
//   <label for="user">Select user:</label>
//   <input id="user" type="select"/>
// </div>
