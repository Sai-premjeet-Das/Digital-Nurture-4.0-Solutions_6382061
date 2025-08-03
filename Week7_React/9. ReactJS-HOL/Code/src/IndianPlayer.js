import React from 'react';

class IndianPlayers extends React.Component {
  render() {
    const team = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];

    const odd = team.filter((_, i) => i % 2 === 0);
    const even = team.filter((_, i) => i % 2 !== 0);

    const t20 = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
    const ranji = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];
    const merged = [...t20, ...ranji];

    return (
      <div style={{ padding: '20px' }}>
        <h2>Odd Players</h2>
        <ul>
          {odd.map((p, idx) => (
            <li key={idx}>{['First', 'Third', 'Fifth'][idx]} : {p}</li>
          ))}
        </ul>

        <h2>Even Players</h2>
        <ul>
          {even.map((p, idx) => (
            <li key={idx}>{['Second', 'Fourth', 'Sixth'][idx]} : {p}</li>
          ))}
        </ul>

        <h2>List of Indian Players Merged:</h2>
        <ul>
          {merged.map((p, idx) => (
            <li key={idx}>{p}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default IndianPlayers;