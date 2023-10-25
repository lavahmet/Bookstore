package com.mnb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;
    @Column(name = "BOOK_NAME")
    String bookName;
    @Column(name = "BOOK_SUBNAME")
    String bookSubname;
    @Column(name = "BOOK_SERIAL_NAME")
    String serialName;
    @Column(name = "BOOKS_AUTHOR")
    String booksAuthor;
    @Column(name = "BOOKS_PUBLISHER")
    String booksPublisher;
    @Column(name = "DESCRIPTION")
    String description;
    @Column(name = "ISBN")
    String isbn;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "AUTHOR_ID")
    Author author;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

}
