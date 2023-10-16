package com.example.barerepo.Model;

public class SampleBook {

    // Fields

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPrice;
    private String pageQuality;
    private int pageCount;
    private String bookCount;
    // merged remote and local changes
    private String bookContent;


    public SampleBook() {
    }
    public SampleBook(int bookId, String bookName, String bookAuthor, String bookPrice, String pageQuality, int pageCount, String bookCount, String bookContent) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.pageQuality = pageQuality;
        this.pageCount = pageCount;
        this.bookCount = bookCount;
        this.bookContent = bookContent;
    }
}
