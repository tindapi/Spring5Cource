package com.dapi.FirstWeb.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long publisherid;

    private String name;
    private String adressline1;
    private String city;
    private String zip;

    @OneToMany
    @JoinColumn(name="publisher_publisherid")
    private Set<Book> books= new HashSet<Book>();

    public Publisher() {
    }

    public Publisher(String name, String adressline1, String city, String zip) {
        this.name = name;
        this.adressline1 = adressline1;
        this.city = city;
        this.zip = zip;
    }

    public Long getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(Long publisherid) {
        this.publisherid = publisherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressline1() {
        return adressline1;
    }

    public void setAdressline1(String adressline1) {
        this.adressline1 = adressline1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherid=" + publisherid +
                ", lastname='" + name + '\'' +
                ", adressline='" + adressline1 + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return publisherid != null ? publisherid.equals(publisher.publisherid) : publisher.publisherid == null;
    }

    @Override
    public int hashCode() {
        return publisherid != null ? publisherid.hashCode() : 0;
    }


}
