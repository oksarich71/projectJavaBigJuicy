import React, { Component } from 'react'
import { Map, TileLayer, Marker, Popup } from 'react-leaflet';
import Request from '../helpers/Request.js';


type State = {
  lat: number,
  lng: number,
  zoom: number,
}

export default class SimpleExample extends Component<{}, State> {
  state = {
    lat: 55.945691,
    lng: -3.203956,
    zoom: 12
  }



  getMarkers() {
    const arrayOfMarkers = [];
    const arrayOfPubs = [];
    let req = new Request()
    req.get("http://localhost:8080/api/pubs").then((data) => {
      const arrayOfPubs = data._embedded.pubs
    }).then(() => {
      arrayOfPubs.forEach((pub) => {
        const pubObject = {name: pub.name, latlng: [pub.latitude, pub.longitude]}
        arrayOfMarkers.push(pubObject);
      })
    }).then(()=> {return arrayOfMarkers})
  }

  render() {
    const position = [this.state.lat, this.state.lng]
    const markers = this.getMarkers()

    const LeafletMarkers = markers.map(marker => (
      <Marker position={marker.latlng} key={`marker_${marker.name}`}>
        <Popup>
          <span>{marker.name}</span>
        </Popup>
      </Marker>
    ))
    return (
      <div className="another-map-container">
      <Map className="this-is-map" center={position} zoom={this.state.zoom}>
        <TileLayer
          attribution='&amp;copy <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />
        {/* <style rel="stylesheet" href="http:/unpkg.com/leaflet@1.3.4/dist/leaflet.css"</link> */}
        <style>@import url('http:/unpkg.com/leaflet@1.3.4/dist/leaflet.css')</style>
        <Marker position={position}>
          <Popup>
            A pretty CSS3 popup. <br /> Easily customizable.
          </Popup>
        </Marker>
      </Map>
    </div>
    )
  }
}

//
// //
// import React from 'react'
// import { render } from 'react-dom'
// import { Map, Marker, Popup, TileLayer } from 'react-leaflet'
// import 'leaflet/dist/leaflet.css';
//
// class SimpleExample extends Component<{}, State> {
//
//
// const position = [51.505, -0.09];
// const map = (
//   <Map center={position} zoom={13}>
//     <TileLayer
//       url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
//       attribution="&copy; <a href=&quot;http://osm.org/copyright&quot;>OpenStreetMap</a> contributors"
//     />
//     <Marker position={position}>
//       <Popup>A pretty CSS3 popup.<br />Easily customizable.</Popup>
//     </Marker>
//   </Map>
// )
// }

//
// // export default
// import React from "react";
// import { Map, TileLayer, Marker, Popup } from "react-leaflet";

// import L from 'leaflet';
//
// delete L.Icon.Default.prototype._getIconUrl;
//
// L.Icon.Default.mergeOptions({
//     iconRetinaUrl: require('leaflet/dist/images/marker-icon-2x.png'),
//     iconUrl: require('leaflet/dist/images/marker-icon.png'),
//     shadowUrl: require('leaflet/dist/images/marker-shadow.png')
// });
//
//
// const SimpleExample = (props) => {
//     return (
//         <Map center={props.position} zoom={props.zoom} style={{height: '350px'}}>
//           <TileLayer
//             attribution="&amp;copy <a href=&quot;http://osm.org/copyright&quot;>OpenStreetMap</a> contributors"
//             url="https://cartodb-basemaps-{s}.global.ssl.fastly.net/light_all/{z}/{x}/{y}.png"
//           />
//           <Marker position={props.center}>
//             <Popup>
//               A pretty CSS3 popup. <br /> Easily customizable.
//             </Popup>
//           </Marker>
//         </Map>
//     )
// }

// export default SimpleExample;
