import React, { Component, Fragment } from 'react';
import './App.css';
import HomePage from './pages/HomePage.js';
import ReviewPage from './pages/ReviewPage.js';
import NavBar from './NavBar.js';

class App extends Component {
  render() {
    return (
      <Fragment>
        <NavBar/>
        <HomePage/>
      </Fragment>

    );
  }
}

export default App;
