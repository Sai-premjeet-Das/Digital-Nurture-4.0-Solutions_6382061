import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props){
        super(props);
        this.state = { posts: [] };
    }

    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((response) => response.json())
        .then((data) => {
            this.setState({posts: data});
        });
    }

    componentDidMount() {
        this.loadPosts();
    }

    render(){
        const {posts} = this.state;
        return(
            <div className="posts-container">
                <h1>Blog Posts</h1>
                {posts.map((post)=> (
                    <Post key={post.id} title={post.title} body={post.body} />
                ))}
            </div>
        );
    }
}
export default Posts;