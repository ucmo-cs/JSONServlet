package edu.ucmo.demo;

import java.util.LinkedList;
import java.util.List;

public class MyArticle {

    private String title;
    private String url;

    private List<String> categories;
    private List<String> tags;

    //setters & getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String toString() {
        return "Title: " + title +
                "\nURL: " + url +
                "\nCategories: " + categories.toString() +
                "\nTags: " + tags.toString();
    }
}
