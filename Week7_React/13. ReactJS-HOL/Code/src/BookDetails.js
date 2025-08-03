import React from 'react';

const BookDetails = ({ books }) => {
  return (
    <div>
      <h2>Book Details</h2>
      {books.length > 0 ? (
        books.map((book) => (
          <div key={book.id}>
            <h3>{book.name}</h3>
            <h4>{book.price}</h4>
          </div>
        ))
      ) : (
        <p>No books available.</p>
      )}
    </div>
  );
};

export default BookDetails;
