public interface Reader extends User, BookHolder {
    void takeBook(Administrator administrator);

    void returnBook(Administrator administrator);
}


