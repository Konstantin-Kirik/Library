package OOP.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        Book book = new Book("Анна Каренина", "Лев Толстой", "Москвич", "Русская классика");
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", "Питер", "Мистика");
        Book book2 = new Book("1984", "Джордж Оруэлл", "Москвич", "Дэтектив");
        Book book3 = new Book("Шерлока Холмса", "Артур Конан Дойл", "Ромашка", "Классический дэтектив");
        Book book4 = new Book("Евгений Онегин", "Александр Пушкин", "Москвич", "Русская классика");
        Book book5 = new Book("Портрет Дориана Грея", "Оскар Уайльд", "Питер", "Мистика");
        Book book6 = new Book("Великий Гэтсби", "Оскар Уайльд", "Ромашка", "Американская литература");
        Book book7 = new Book("Фауст", "Иоганн Вольфганг Гёте", "Москвич", "Мистика");
        Book book8 = new Book("Сонеты. Гамлет", "Уильям Шекспир", "Питер", "Зарубежная поэзия");
        Book book9 = new Book("Ромео и Джульетта", "Уильям Шекспир", "Москвич", "Зарубежная драматургия");

        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);

        Menu.menu(list);
    }
}
