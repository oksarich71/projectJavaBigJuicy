import React, {Component, Fragment} from 'react';

class UserForm extends Component {
  constructor(props){
    super(props);
    this.state = {name: ""};
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  };

  handleTextChange(event){
    const inputText = event.target.value;
    this.setState({name: inputText})
  }

  handleSubmit(event){
    event.preventDefault();
    const {name} = this.state;

    if (!name) {
      return;
    }

    const newUser = {name: name};
    this.props.handleUserSubmit(newUser);
    this.setState({name: ""});
  }

  render(){
    return(
      <form onSubmit={this.handleSubmit}>
        <input
          type="text"
          placeholder="enter new user name"
          value={this.state.name}
          onChange={this.handleTextChange}
        />
        <input
          type="submit"
          value="Post"
        />
      </form>
    )
  }
}

export default UserForm;
