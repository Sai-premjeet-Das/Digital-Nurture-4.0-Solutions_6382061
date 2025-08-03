import React from 'react';
import ListOfPlayers from './PlayersList';
import IndianPlayers from './IndianPlayer';

function App() {
  const flag = false;

  return (
    <div className="App">
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
