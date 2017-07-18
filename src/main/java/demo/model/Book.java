package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    private Integer id;
    private String title;
    private String author;
    private String date;
    private double price;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public Book() {
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public Book(Integer id, String title, String author, String date, double price) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.date = date;
//        this.price = price;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", date='" + date + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
