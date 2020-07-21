package com.thelem.springbootopenapi.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.thelem.springbootopenapi.entity.Book;

@Repository
public class BookRepository {
	
	private Map<Long, Book> books = new HashMap<>();
	
	public Optional<Book> findById(long id){
		return Optional.ofNullable(books.get(id));
	}
	
	public void add(Book book) {
		books.put(book.getId(), book);
	}
	
	public Collection<Book> getBooks(){
		return books.values();
	}
	
	/*public Page<Book> getBooks(Pageable pageable) {
        int toSkip = pageable.getPageSize() * pageable.getPageNumber();
        List<Book> result = books.values().stream().skip(toSkip).limit(pageable.getPageSize()).collect(toList());

        return new PageImpl<>(result, pageable, books.size());
    }*/
}
