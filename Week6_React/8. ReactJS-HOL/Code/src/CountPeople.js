import React from 'react';

class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
    this.updateEntry = this.updateEntry.bind(this);
    this.updateExit = this.updateExit.bind(this);
  }

  updateEntry() {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  }

  updateExit() {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  }

 render() {
  return (
    <div style={{ textAlign: 'center', padding: '50px' }}>

      <div style={{ display: 'flex', justifyContent: 'center', gap: '40px', marginTop: '30px' }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
          <button onClick={this.updateEntry} style={{ padding: '10px 20px' }}>
            Login
          </button>
          <span><strong>Entered:</strong> {this.state.entrycount}</span>
        </div>
        <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
          <button onClick={this.updateExit} style={{ padding: '10px 20px' }}>
            Exit
          </button>
          <span><strong>Exited:</strong> {this.state.exitcount}</span>
        </div>
      </div>
    </div>
  );
}

}
export default CountPeople;