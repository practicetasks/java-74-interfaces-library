public abstract class AbstractBookHolder extends AbstractUser {
    protected Book book;

    public AbstractBookHolder(String name) {
        super(name);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
