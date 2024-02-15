public class AdministratorImpl extends AbstractBookHolder implements Administrator {
    public AdministratorImpl(String name) {
        super(name);
    }

    @Override
    public void findBook(String bookTitle) {
        book = new Book(bookTitle, "");
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.printf("Администратор %s отдает книгу читателю " + reader.getName());
    }

    @Override
    public void overdueNotifications(Reader reader) {
        System.out.println("Администратор уведомляет читателя о просрочке");
    }
}
