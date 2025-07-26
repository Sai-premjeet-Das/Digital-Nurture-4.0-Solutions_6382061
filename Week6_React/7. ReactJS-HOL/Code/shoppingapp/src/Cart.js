import React, { Component } from 'react';

class Cart extends Component {
  render() {
    const { items } = this.props;

    return (
      <>
        {items && items.map((item, index) => (
          <tr key={index}>
            <td style={{ textAlign:"center", border: "1px solid gray", padding: "10px 20px" }}>
              {item.itemName}
            </td>
            <td style={{ border: "1px solid gray", padding: "10px 20px" }}>
              {item.price}
            </td>
          </tr>
        ))}
      </>
    );
  }
}

export default Cart;
