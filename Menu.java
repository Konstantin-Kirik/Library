package OOP.Library;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static void menu(List<Book> list) {
        int num = 0;
        do {

            System.out.println("Привет это библиотека!");
            System.out.println("Click 1 : Вывод всей книг.");
            System.out.println("Click 2 : Поиск книги.");
            System.out.println("Click 3 : Сортировка книг.");
            System.out.println("Click 4 : Изменение книг.");
            System.out.println("Click 0 : Выход");

            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            switch (num) {
                case 1 -> Realization.Show(list);
                case 2 -> {
                    System.out.println("Click 1 : Поиск книги по названию книги.");
                    System.out.println("Click 2 : Поиск книги по автору.");
                    int num1 = in.nextInt();
                    switch (num1) {
                        case 1 -> {
                            Scanner str = new Scanner(System.in);
                            System.out.println("Введите название книги :");
                            String str1 = str.nextLine();
                            Realization.FindNameBook(list, str1);
                        }
                        case 2 -> {
                            Scanner str = new Scanner(System.in);
                            System.out.println("Введите название автора книги :");
                            String str2 = str.nextLine();
                            Realization.FindNameAuthor(list, str2);
                        }
                    }

                }
                case 3 -> {
                    System.out.println("Click 1 : Сортировать библиотеку по названию книг.");
                    System.out.println("Click 2 : Сортировать библиотеку по автору.");
                    System.out.println("Click 3 : Сортировать библиотеку по издательству.");
                    int num2 = in.nextInt();

                    switch (num2) {
                        case 1 -> list.sort(new SortNameBook());
                        case 2 -> list.sort(new SortNameAuthor());
                        case 3 -> list.sort(new SortPublishingHouse());
                    }

                }
                case 4 -> {
                    Scanner scanner = new Scanner(System.in);
                    int number = Realization.ChangeBook(list);
                    Book book10 = list.get(number);
                    System.out.println("Введите название книги :");
                    String nameBookNew = scanner.nextLine();
                    System.out.println("Введите название автора :");
                    String nameAuthor = scanner.nextLine();
                    System.out.println("Введите публикацию книги :");
                    String publishingHouse = scanner.nextLine();
                    System.out.println("Введите жанр книги");
                    String genre = scanner.nextLine();
                    Book change = new Book(nameBookNew, nameAuthor, publishingHouse, genre);
                    list.set(number, change);
                }
                case 0 -> System.out.println("Bya!");
            }
        } while (num != 0);
    }
}
