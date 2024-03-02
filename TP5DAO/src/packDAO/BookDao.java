package packDAO;

public interface BookDao {

	  public void addBook(BookBean book) throws SQLException;

	  public void updateBook(BookBean book) throws SQLException;

	  public void deleteBook(Long book_id) throws SQLException;

	  public List<BookBean> displayAll() throws SQLException;

	  public List<BookBean> findBook(String kw) throws SQLException;
	}

