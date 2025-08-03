import React from 'react';

class ListOfPlayers extends React.Component {
  render() {
    const players = [
      { name: "Mr. Jack", score: 50 },
      { name: "Mr. Michael", score: 70 },
      { name: "Mr. John", score: 40 },
      { name: "Mr. Ann", score: 61 },
      { name: "Mr. Elisabeth", score: 61 },
      { name: "Mr. Sachin", score: 95 },
      { name: "Mr. Dhoni", score: 100 },
      { name: "Mr. Virat", score: 84 },
      { name: "Mr. Jadeja", score: 64 },
      { name: "Mr. Raina", score: 75 },
      { name: "Mr. Rohit", score: 80 }
    ];

    const below70 = players.filter(p => p.score < 70);

    return (
      <div style={{ padding: '20px' }}>
        <h2>List of Players</h2>
        <ul>
          {players.map((p, idx) => (
            <li key={idx}>{p.name} {p.score}</li>
          ))}
        </ul>

        <h2>List of Players having Scores Less than 70</h2>
        <ul>
          {below70.map((p, idx) => (
            <li key={idx}>{p.name} {p.score}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default ListOfPlayers;