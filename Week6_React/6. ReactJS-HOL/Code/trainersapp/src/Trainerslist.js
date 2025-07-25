import React from 'react';
import { Link } from 'react-router-dom';
import trainersMock from './Trainersmock';

function TrainersList() {
  return (
    <div>
      <h2>Trainers List</h2>
      <ul>
        {trainersMock.map((tr) => (
          <li key={tr.trainerId}>
            <Link to={`/trainers/${tr.trainerId}`}>{tr.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainersList;
