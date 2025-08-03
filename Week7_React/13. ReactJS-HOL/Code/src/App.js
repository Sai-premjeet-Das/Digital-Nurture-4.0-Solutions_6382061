import React from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetail';

const App = () => {
  const books = [
    { id: 1, name: 'Master React', price: '670' },
    { id: 2, name: 'Deep Dive into Angular 11', price: '800' },
    { id: 3, name: 'Mongo Essentials', price: '450' },
  ];

  const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz' },
    { id: 2, title: 'Welcome to learning React!', author: 'Schwedenier' },
  ];

  const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '3/6/2021' },
  ];

  return (
    <div style={{ display: 'flex', justifyContent: 'space-around' }}>
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </div>
  );
};

export default App;