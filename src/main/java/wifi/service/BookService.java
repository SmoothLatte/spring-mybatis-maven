package wifi.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wifi.dao.BookDao;
import wifi.domain.Book;

@Service
public class BookService {
	@Resource
	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public int add(Book book){
		return bookDao.add(book);
	}
	
	public void update(Book book){
		bookDao.update(book);
	}
	
	public Book queryBook(long id){
		return bookDao.queryBook(id);
	}
	
	public List<Book> queryAllBooks(){
		return bookDao.queryAllBooks();
	}
}
