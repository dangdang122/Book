package kr.ac.kopo.jong.bookmarket.service;

import kr.ac.kopo.jong.bookmarket.domain.Book;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;
@Service
public interface BookService {
    List<Book> getAllBookList();

    Book getBookById(String bookId);

    List<Book> getBookListByCategory(String category);

    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
    void setNewBook(Book book);
}