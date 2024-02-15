public class Test {
    public static void main(String[] args) {
        Administrator administrator = new AdministratorImpl("Вася");
        administrator.findBook("Гарри Поттер");

        Reader reader = new ReaderImpl("Дима");
        administrator.giveBook(reader);

        reader.returnBook(administrator);

    }
}
