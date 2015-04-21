package wifi.webmvct.cmd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import wifi.domain.Book;
import wifi.service.BookService;

@Controller
@RequestMapping(value="book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping(value="add")
	public String add(Book book){
		int id = bookService.add(book);
		logger.debug("Add Success");
		Book dest = bookService.queryBook(id);
		logger.debug(book.toString());
		return "redirect:/book/index";
	}
	
	@RequestMapping(value="update")
	public String update(Book book){
		bookService.update(book);
		logger.debug("Update Success");
		return "Update Success";
	}
	
	@RequestMapping(value="index")
	public String listBooks(ModelMap model){
		model.addObject("command", bookService.queryAllBooks());
		return "/index/index";
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
}
