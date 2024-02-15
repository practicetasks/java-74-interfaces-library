public class ReaderImpl extends AbstractBookHolder implements Reader {


    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.printf("Читатель %s берет книгу у администратора %s\n", name, administrator.getName());
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.printf("Читатель %s возвращает книгу администратору %s\n", name, administrator.getName());
    }
}
