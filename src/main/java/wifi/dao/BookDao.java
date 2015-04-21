package wifi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import wifi.domain.Book;

@Repository
public interface BookDao {
	public static final String TABLE = "book";
	
	@Insert("INSERT INTO " + TABLE + "(name,author)" + 
		" VALUES(#{name},#{author})")
	public int add(Book book);
	
	@Update("UPDATE " + TABLE + " SET name=#{name},author=#{author}")
	public void update(Book book);
	
	@Select("select * from " + TABLE + " where id=#{id}")
	public Book queryBook(long id);
	
	@Select("select * from " + TABLE)
	public List<Book> queryAllBooks();
}
