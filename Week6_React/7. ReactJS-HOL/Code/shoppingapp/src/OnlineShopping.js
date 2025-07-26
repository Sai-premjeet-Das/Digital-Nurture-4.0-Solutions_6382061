import React from "react";
import Cart from './Cart';

export class OnlineShopping extends React.Component{
    render() {
        const CartInfo =[{itemName: "Laptop",price: 80000},
            {itemName: "TV",price: 120000},
            {itemName: "Washing Machine",price: 50000},
            {itemName: "Mobile",price: 30000},
            {itemName: "Fridge",price: 70000}
        ];
         return (
      <div style={{ textAlign: 'center', paddingTop: '40px' }}>
        <h1 style={{ color: 'green' }}>Items Ordered :</h1>
        <div style={{ display: 'flex', justifyContent: 'center' }}>
          <table
            style={{
              borderCollapse: 'collapse',
              border: '1px solid gray',
              boxShadow: '0 0 5px rgba(0, 0, 0, 0.2)'
            }}
          >
            <thead>
              <tr style={{ backgroundColor: '#f0f0f0' }}>
                <th
                  style={{
                    border: '1px solid gray',
                    padding: '10px 20px',
                    fontWeight: 'bold',
                    color: 'green',
                    textAlign: 'center'
                  }}
                >
                  Name
                </th>
                <th
                  style={{
                    border: '1px solid gray',
                    padding: '10px 20px',
                    fontWeight: 'bold',
                    color: 'green',
                    textAlign: 'center'
                  }}
                >
                  Price
                </th>
              </tr>
            </thead>
            <tbody>
              <Cart items={CartInfo} />
            </tbody>
          </table>
        </div>
      </div>
    );
    }
}