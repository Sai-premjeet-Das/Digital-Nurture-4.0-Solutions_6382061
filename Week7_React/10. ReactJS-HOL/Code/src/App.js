import React from 'react';
import OfficeCard from './OfficeCard';
import offices from './Offices';

function App() {
  const headingStyle = {
    color: 'darkblue',
    textAlign: 'center',
    paddingTop: '20px'
  };

  return (
    <div>
      <h1 style={headingStyle}>Office Space Rental Portal</h1>
      <div style={{ textAlign: 'center' }}>
        <img src="/office1.jpg" alt="Office" style={{
    maxWidth: '400px',
    width: '100%',
    borderRadius: '10px',
    marginTop: '20px'
  }}
/>
      </div>
      <div style={{ marginTop: '40px' }}>
        {offices.map((office, index) => (
          <OfficeCard
            key={index}
            name={office.name}
            rent={office.rent}
            address={office.address}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
