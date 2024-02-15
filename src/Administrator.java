public interface Administrator extends User, BookHolder {
    void findBook(String bookTitle);

    void giveBook(Reader reader);

    void overdueNotifications(Reader reader);
}
