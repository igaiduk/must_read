package gaiduk.domain.mappers;

import gaiduk.domain.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by igaiduk on 6/10/2017.
 */
@Component
public class BookRowMapper implements RowMapper<Book>{
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException{
        Book book = new Book (resultSet.getInt("id"),
                resultSet.getString("author"),
                resultSet.getString("title"),
                resultSet.getString("description"),
                resultSet.getString("yearOfPublishing")
        );
        return book;
    }
}
