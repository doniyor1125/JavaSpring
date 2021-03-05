package com.doniyor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Books
{
    //Defining book id as primary key
    @Id
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column

    public int getBookid()
    {
        return bookid;
    }
    public void setBookid(int bookid)
    {
        this.bookid = bookid;
    }
    public String getBookname()
    {
        return bookname;
    }
    public void setBookname(String bookname)
    {
        this.bookname = bookname;
    }

}
