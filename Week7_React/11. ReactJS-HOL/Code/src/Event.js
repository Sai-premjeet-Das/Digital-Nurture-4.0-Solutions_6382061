import React, { useState } from 'react';

const EventExamples = () => {
  const [counter, setCounter] = useState(0);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const increment = () => {
    setCounter(counter + 1);
    sayHello();
  };

  const decrement = () => {
    setCounter(counter - 1);
  };

  const sayHello = () => {
    alert(`Hello! This is a static message.`);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = () => {
    alert('I was clicked');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const euroAmount = (amount * 0.011).toFixed(2);
    alert(`Converting to Euro Amount: ${euroAmount}`);
  };

  return (
    <div>
      <h1>{counter}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={() => sayWelcome('Welcome')}>Say Welcome</button>
      <button onClick={handleClick}>Click on me</button>

      <h2>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          placeholder="Amount"
        />
        <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
          <option value="Euro">Euro</option>
          <option value="Dollar">Dollar</option>
        </select>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default EventExamples;