package kr.ac.kopo.jong.bookmarket.repository;

import kr.ac.kopo.jong.bookmarket.domain.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}