package fr.flavien.demo.domain;

import org.springframework.data.annotation.Id;

public class Music {

    @Id private String id;
    private String title;
    private String author;

    protected Music(){}

    public Music(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
                "Music[id=%s, title='%s', author='%s']",
                id, title, author);
    }


    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
