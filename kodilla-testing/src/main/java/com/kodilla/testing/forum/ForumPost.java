package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    String postBody;
    String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //rzutowanie typów
        ForumPost forumPost = (ForumPost) o;
        return Objects.equals(postBody, forumPost.postBody) &&
                Objects.equals(author, forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}