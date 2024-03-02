package packDAO;

public class BookBean {

	  private long book_id;
	  private String title;
	  private String author;
	  private float price;

	  public long getBookId() {
	    return book_id;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public String getAuthor() {
	    return author;
	  }

	  public float getPrice() {
	    return price;
	  }
	  
	  public void setBookId(long bookId) {
	    this.book_id = bookId;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public void setAuthor(String author) {
	    this.author = author;
	  }

	  public void setPrice(float price) {
	    this.price = price;
	  }

	}
