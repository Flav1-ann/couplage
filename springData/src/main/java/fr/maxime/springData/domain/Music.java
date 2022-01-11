package fr.maxime.springData.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
                "Music[id=%d, title='%s', author='%s']",
                id, title, author);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
