import React, {Component} from 'react';
import { Map, Marker, Popup, TileLayer } from 'react-leaflet';
import SimpleExample from '../components/SimpleExample.js';


class MapContainer extends Component {
  constructor(props) {
    super(props);
      this.state = {}
    }

    // componentDidMount(){
    //   //this happens when the page is laoded
    //   const position = [55.9, -3.2];
    //   const map = (
    //       <Map center={position} zoom={13}>
    //         <TileLayer
    //           url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
    //           attribution="&copy; <a href=&quot;http://osm.org/copyright&quot;>OpenStreetMap</a> contributors"
    //         />
    //         <Marker position={position}>
    //           <Popup>A pretty CSS3 popup.<br />Easily customizable.</Popup>
    //         </Marker>
    //       </Map>
    //   )
    // }


    render(){
      return (
        <div className="map-child-component">
          <SimpleExample/>
        </div>
      )

  }
}


export default MapContainer;
