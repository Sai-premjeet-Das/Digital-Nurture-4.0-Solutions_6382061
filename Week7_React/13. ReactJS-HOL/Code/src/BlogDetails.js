import React from 'react';

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.length > 0 ? (
        blogs.map((blog) => (
          <div key={blog.id}>
            <h3>{blog.title}</h3>
            <p>{blog.author}</p>
          </div>
        ))
      ) : (
        <p>No blogs available.</p>
      )}
    </div>
  );
};

export default BlogDetails;
