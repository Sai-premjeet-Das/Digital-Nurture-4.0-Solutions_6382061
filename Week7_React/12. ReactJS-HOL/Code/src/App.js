import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

const App = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <Router>
      <Routes>
        <Route path="/" element={isLoggedIn ? <UserPage onLogout={handleLogout} /> : <GuestPage onLogin={handleLogin} />} />
      </Routes>
    </Router>
  );
};

export default App;