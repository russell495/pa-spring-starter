package com.galvanize.tmo.paspringstarter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Id;



@Entity
public class BookEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    private LocalDate datePublished;

    public BookEntity() {}

    public BookEntity(String author, String title, LocalDate datePublished) {
        this.author = author;
        this.title = title;
        this.datePublished = datePublished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }

//    @Override
//    public boolean equals(Object actual) {
//        if (this == actual) return true;
//        if (actual == null || getClass() != actual.getClass()) return false;
//        BookEntity bookEntity = (BookEntity) actual;
//        return Objects.equals(id, bookEntity.id) &&
//                Objects.equals(author, bookEntity.author) &&
//                Objects.equals(title, bookEntity.title) &&
//                Objects.equals(datePublished, bookEntity.datePublished);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, datePublished);
    }
}
