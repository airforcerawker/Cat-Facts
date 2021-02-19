import './App.css';
// import 'bootstrap/dist/css/bootstrap.min.css';
import {useState, useEffect} from 'react';
import CatCard from './components/CatCard';

function App() {

  const [facts, setFacts] = useState([]);

  const getCatFacts = () => {
    fetch("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=")
      .then(res => res.json())
      .then(res => setFacts(res))
      .catch(err => console.log(err))
  }

  return (
    <div className="container">
      <div className="App">
        <button onClick={getCatFacts}>Get Cat Facts!</button>
        <div className="card">
          {
            facts.map((f,i) => {
              return <CatCard facts={f} key={i} />
            })
          }
        </div>
      </div>
    </div>
  );
}

export default App;
