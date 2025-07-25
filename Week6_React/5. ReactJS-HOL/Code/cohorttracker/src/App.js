import React from 'react';
import './App.css';
import styles from './CohortDetails.module.css';
import { CohortsData } from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {

  return (
  <div className={styles.container}>
    <h2>Cohorts Details</h2>
    <div className={styles['cards-wrapper']}>
       {CohortsData.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
       ))}
    </div>
  </div>
  );
}

export default App;