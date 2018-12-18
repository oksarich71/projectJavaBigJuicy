import React, {Component} from 'react';

class PubForm extends Component {
  constructor(props){
    super(props);
    this.state = {name: ""};
    this.state = {price: ""};
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handlePriceChange = this.handlePriceChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  };

  handleTextChange(event){
    const inputText = event.target.value;
    this.setState({name: inputText})
  }
  handlePriceChange(event){
    const inputPrice = event.target.value;
    this.setState({price: inputPrice})
  }

  handleSubmit(event){
    event.preventDefault();
    const {name, price} = this.state;

    if (!name || !price) {
      return;
    }

    const newPub = {
      name: name,
      price: price
    };
    this.props.handlePubSubmit(newPub);
    this.setState({name: "", price: ""});
  }

  render(){
    return(
      <form className="form" onSubmit={this.handleSubmit}>
        <h3>Add a new pub:</h3>
        <div className="form-item">

        <label>Name of pub:</label>
        <input
          type="text"
          placeholder="enter new pub name"
          value={this.state.name}
          onChange={this.handleTextChange}
        />
        </div>
        <div className="form-item">
          <label>Price:</label>
        <input
          type="double"
          placeholder="enter pint's price"
          value={this.state.price}
          onChange={this.handlePriceChange}
        />
      </div>
        <input
          type="submit"
          value="Post"
        />
      </form>
    )
  }
}

export default PubForm;
