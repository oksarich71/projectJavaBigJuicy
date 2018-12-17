import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';
import ReviewPage from './pages/ReviewPage.js';
import HomePage from './pages/HomePage.js';

const NavBar = (props) => {
  return (
    <Router>
      <Fragment>
        <ul>

          <li className="nav-bar-item">
            <Link to="/">Welcome</Link>
          </li>

          <li className="nav-bar-item">
            <Link to="/reviews">Reviews</Link>
          </li>

          <li className="nav-bar-item">
            <p>Map</p>
          </li>

          <li className="nav-bar-item">
            <p>My Reviews</p>
          </li>

          <li className="nav-bar-item">
            <p>Saved Reviews</p>
          </li>

        </ul>
        <Route exact path="/" component={HomePage} />
        <Route path="/reviews" component={ReviewPage} />
      </Fragment>
    </Router>
  )
}

export default NavBar;
