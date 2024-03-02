package packDAO;

public class BookDaoImpl implements BookDao {



 @Override

 public void addBook(BookBean book) throws SQLException {

  Connection connection = ConnectionFactory.getConnection();

  String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";

  PreparedStatement statement = connection.prepareStatement(sql);

  try {

   statement.setString(1, book.getTitle());

   statement.setString(2, book.getAuthor());

   statement.setFloat(3, book.getPrice());

   statement.executeUpdate();

  } finally {

   // Close resources regardless of exceptions

   if (statement != null) {

    statement.close();

   }

   if (connection != null) {

    connection.close();

   }

  }

 }



 @Override

 public void updateBook(BookBean book) throws SQLException {

  Connection connection = ConnectionFactory.getConnection();

  String sql = "UPDATE books SET title = ?, author = ?, price = ? WHERE book_id = ?";

  PreparedStatement statement = connection.prepareStatement(sql);

  try {

   statement.setString(1, book.getTitle());

   statement.setString(2, book.getAuthor());

   statement.setFloat(3, book.getPrice());

   statement.setLong(4, book.getBook_id());

   statement.executeUpdate();

  } finally {

   // Close resources regardless of exceptions

   if (statement != null) {

    statement.close();

   }

   if (connection != null) {

    connection.close();

   }

  }

 }



 @Override

 public void deleteBook(Long book_id) throws SQLException {

  Connection connection = ConnectionFactory.getConnection();

  String sql = "DELETE FROM books WHERE book_id = ?";

  PreparedStatement statement = connection.prepareStatement(sql);

  try {

   statement.setLong(1, book_id);

   statement.executeUpdate();

  } finally {

   // Close resources regardless of exceptions

   if (statement != null) {

    statement.close();

   }

   if (connection != null) {

    connection.close();

   }

  }

 }



 @Override

 public List<BookBean> displayAll() throws SQLException {

  Connection connection = ConnectionFactory.getConnection();

  String sql = "SELECT * FROM books";

  PreparedStatement statement = connection.prepareStatement(sql);

  List<BookBean> bookList = new ArrayList<>();

  ResultSet resultSet = null;

  try {

   resultSet = statement.executeQuery();

   while (resultSet.next()) {

    BookBean book = new BookBean();

    book.setBook_id(resultSet.getLong("book_id"));

    book.setTitle(resultSet.getString("title"));

    book.setAuthor(resultSet.getString("author"));

    book.setPrice(resultSet.getFloat("price"));

    bookList.add(book);

   }

  } finally {

   // Close resources regardless of exceptions

   if (resultSet != null) {

    resultSet.close();

   }

   if (statement != null) {

    statement.close();

   }

   if (connection != null) {

    connection.close();

   }

  }

  return bookList;

 }



 @Override

 public List<BookBean> findBook(String keyword) throws SQLException {

  Connection connection = ConnectionFactory.getConnection();

  String sql = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ?";

  PreparedStatement statement = connection.prepareStatement(sql);

  List<BookBean> bookList = new ArrayList<>();

  ResultSet resultSet = null;

  try {

   statement.setString(1, "%" + keyword + "%"); // Add wildcards for partial matches

   statement.setString(2, "%" + keyword + "%");

   resultSet = statement.executeQuery();

   while (resultSet.next()) {

    BookBean book = new BookBean();

    book.setBook_id(resultSet.getLong("book_id"));

    book.setTitle(resultSet.getString("title"));

    book.setAuthor(resultSet.getString("author"));

    book.setPrice(resultSet.getFloat("price"));

    bookList.add(book);

   }

    } finally {

   // Close resources regardless of exceptions

   if (resultSet != null) {

    resultSet.close();

   }

   if (statement != null) {

    statement.close();

   }

   if (connection != null) {

    connection.close();

   }

  }

  return bookList;

 }

}

