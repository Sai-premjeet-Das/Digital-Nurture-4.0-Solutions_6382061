import React from 'react';

class Post extends React.Component {
  render() {
    const { id, title, body } = this.props;

    return (
      <div className="post">
        <h3>Post #{id}</h3>
        <h2>{title}</h2>
        <p>{body}</p>
      </div>
    );
  }
}

export default Post;
