package com.muchiri.persistence.domain;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AssociationOverrides;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity(name = "Book")
@AttributeOverrides({
        @AttributeOverride(name = "ebookPublisher.name", column = @Column(name = "ebook_pub_name")),
        @AttributeOverride(name = "paperBackPublisher.name", column = @Column(name = "paper_back_pub_name"))
})
@AssociationOverrides({
        @AssociationOverride(name = "ebookPublisher.country", joinColumns = @JoinColumn(name = "ebook_pub_country_id")),
        @AssociationOverride(name = "paperBackPublisher.country", joinColumns = @JoinColumn(name = "paper_back_pub_country_id"))
})
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String auther;
    private Publisher ebookPublisher;
    private Publisher paperBackPublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Publisher getEbookPublisher() {
        return ebookPublisher;
    }

    public void setEbookPublisher(Publisher ebookPublisher) {
        this.ebookPublisher = ebookPublisher;
    }

    public Publisher getPaperBackPublisher() {
        return paperBackPublisher;
    }

    public void setPaperBackPublisher(Publisher paperBackPublisher) {
        this.paperBackPublisher = paperBackPublisher;
    }

}
