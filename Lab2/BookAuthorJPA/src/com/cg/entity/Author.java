package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	@Id
	private long authorId;
	private String authorName;
	@ManyToMany(targetEntity=Book.class)
	@JoinColumn(name="bookIsbn")
	private List<Book> bookList = new ArrayList<>();
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(long authorId, String authorName, List<Book> bookList) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.bookList = bookList;
	}
	public long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}


}
