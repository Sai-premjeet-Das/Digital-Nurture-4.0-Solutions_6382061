import React from 'react';
import { BrowserRouter, Routes, Route, Navigate, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './Trainerslist';
import TrainerDetails from './Trainersdetails';

function App() {
  return (
    <BrowserRouter>
      <div style={{ textAlign: 'left', marginTop: '20px' }}>
        <Home />
        <nav style={{ marginBottom: '20px' }}>
          <Link to="/" style={{ margin: '0 10px' }}>Home</Link>
          <Link to="/trainers" style={{ margin: '0 10px' }}>View Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<></>} />
          <Route path="/trainers" element={<TrainersList />} />
          <Route path="/trainers/:id" element={<TrainerDetails />} />
          <Route path="*" element={<Navigate to="/" />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
