class Request {

  get(url) {
    return fetch(url)
    .then((res) => res.json())
  }

  post(url, payload){
    console.log("payload is:", payload);
    return fetch(url, {
      method: "POST",
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(payload)
    })
  }
}

export default Request;
