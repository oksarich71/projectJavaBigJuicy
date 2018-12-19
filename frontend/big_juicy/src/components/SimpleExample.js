import React, { Component } from 'react'
import { Map, TileLayer, Marker, Popup } from 'react-leaflet';
import Request from '../helpers/Request.js';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';


type State = {
  lat: number,
  lng: number,
  zoom: number,
}

export default class SimpleExample extends Component<{}, State> {
  state = {
    lat: 55.945691,
    lng: -3.203956,
    zoom: 12,
    render: false,
    markers: [],
    testMarkers: {latlng: {lat: 55.945691, lng: -3.203956}, name: "testPub"}
  }



  componentDidMount() {
    const arrayOfMarkers = [];
    const arrayOfPubs = [];
    let arrayOfActualPubs = [];

  //   let req = new Request()
  //   req.get("http://localhost:8080/api/pubs").then((data) => {
  //     const arrayOfPubs = data._embedded.pubs
  //     arrayOfPubs.forEach((isItAPub) => {
  //       const maybeAPub = isItAPub.reviews[0].pub
  //       arrayOfActualPubs.push(maybeAPub)
  //       console.log("maybe a pub:", maybeAPub);
  //     })
  //   }).then(() => {
  //     arrayOfActualPubs.forEach((pub) => {
  //       const pubObject = {name: pub.name, latlng: [pub.latitude, pub.longitude], price: pub.price}
  //       arrayOfMarkers.push(pubObject);
  //     })
  //   // }).then(()=> {return arrayOfMarkers})
  // }).then(() => {
  //   const LeafletMarkers = arrayOfMarkers.map(marker => (
  //     <Marker position={marker.latlng} key={`marker_${marker.name}`}>
  //       <Popup>
  //         <span>{marker.name} <br /> £{marker.price}0 a pint</span>
  //       </Popup>
  //     </Marker>
  //   ))
  //   console.log("array of markers is", arrayOfMarkers);
  //   console.log("leafletmarkers is", LeafletMarkers);
  //   this.setState({markers: LeafletMarkers})
  //   this.setState({render: true})
  //   this.render();
  // })
  // }

  let req = new Request()
  req.get("http://localhost:8080/api/pubs").then((data) => {
    const arrayOfPubs = data._embedded.pubs
    arrayOfPubs.forEach((isItAPub) => {
      const newPubObject = {name: isItAPub.reviews[0].pub.name, latlng: [isItAPub.reviews[0].pub.latitude, isItAPub.reviews[0].pub.longitude], price: isItAPub.reviews[0].pub.price, reviews: isItAPub.reviews, pubID: isItAPub.id}
      arrayOfActualPubs.push(newPubObject)
    })
  }).then(() => {
    arrayOfActualPubs.forEach((pub) => {
      const pubObject = {name: pub.name, latlng: pub.latlng, price: pub.price, reviews: pub.reviews, id: pub.pubID}
      arrayOfMarkers.push(pubObject);
    })
  // }).then(()=> {return arrayOfMarkers})
}).then(() => {
  const LeafletMarkers = arrayOfMarkers.map(marker => (
    <Marker position={marker.latlng} key={`marker_${marker.name}`}>
      <Popup>
        <span>
          {marker.name}
          <br />
          £{marker.price}0 a pint
          <br />
          pub id is: {marker.id}
          <br />
          <a href="http://localhost:8080/api/pubs/`${marker.id}`">Click here for all reviews for this pub!</a>
        </span>
      </Popup>
    </Marker>
  ))
  this.setState({markers: LeafletMarkers})
  this.setState({render: true})
  this.render();
})
}





  render() {
    const position = [this.state.lat, this.state.lng]
      return (
        <div className="another-map-container">
        <Map className="this-is-map" center={position} zoom={this.state.zoom}>
          <TileLayer
            attribution='&amp;copy <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
            url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
          />
          {/* <style rel="stylesheet" href="http:/unpkg.com/leaflet@1.3.4/dist/leaflet.css"</link> */}
          <style>@import url('http:/unpkg.com/leaflet@1.3.4/dist/leaflet.css')</style>
          // <Marker position={position}>
          // </Marker>
          // <Marker position={this.state.testMarkers.latlng}>
          // </Marker>

          // <Marker position={[55.945691, -3.203956]} img="../../public/favicon.ico">
          //   <Popup>
          //   A pretty CSS3 popup. <br /> Easily customizable.
          //   </Popup>
          // </Marker>
          <div className="markers here">
            {this.state.markers}
          </div>
        </Map>
      </div>
    )


  }
}
