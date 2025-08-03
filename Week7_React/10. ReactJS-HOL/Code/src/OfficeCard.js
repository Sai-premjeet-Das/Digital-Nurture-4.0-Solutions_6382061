import React from 'react';

function OfficeCard({ name, rent, address }) {
  const cardStyle = {
    border: '1px solid #ccc',
    borderRadius: '10px',
    padding: '15px',
    margin: '15px auto',
    width: '60%',
    boxShadow: '2px 2px 10px rgba(0,0,0,0.1)'
  };

  const rentStyle = {
    color: rent > 60000 ? 'green' : 'red',
    fontWeight: 'bold'
  };

  return (
    <div style={cardStyle}>
      <h3>{name}</h3>
      <p><strong>Address:</strong> {address}</p>
      <p>
        <strong>Rent:</strong> <span style={rentStyle}>{rent} ₹</span>
      </p>
    </div>
  );
}

export default OfficeCard;