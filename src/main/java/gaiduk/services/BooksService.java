package gaiduk.services;

import gaiduk.domain.Book;
import gaiduk.domain.mappers.BookRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by igaiduk on 6/10/2017.
 */

@Service
public class BooksService {
    private JdbcTemplate template;
    private BookRowMapper bookRowMapper;

    public BooksService(JdbcTemplate template, BookRowMapper bookRowMapper){
        this.template = template;
        this.bookRowMapper = bookRowMapper;
    }

    public List<Book> getBooks(){
        return template.query("select * from books order by author", bookRowMapper);
    }

    public void remove (Long bookId){template.update("delete from books where Id = ?", bookId);}

    public void create (String author, String title, String description, String yearOfPublishing){
        SimpleJdbcInsert insert = new SimpleJdbcInsert (template)
                .withTableName("books");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("author", author);
        parameters.put("title", title);
        parameters.put("description", description);
        parameters.put("yearOfPublishing", yearOfPublishing);
        insert.execute(new MapSqlParameterSource(parameters));
    }
}