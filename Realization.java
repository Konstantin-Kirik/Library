package OOP.Library;

import java.util.List;
import java.util.Scanner;

public class Realization {

    public static void Show(List<Book> list) {

        for (Book book : list) {
            System.out.println("Название книги : " + book.nameBook + " | Автор : "
                    + book.nameAuthor + " | Жанр : " + book.genre + " | Публикация :" + book.publishingHouse);
        }
    }

    public static void FindNameBook(List<Book> list, String nameBook) {
        for (Book book : list) {
            if (book.nameBook.equals(nameBook)) {
                System.out.println("Название книги : " + book.nameBook + " | Автор : "
                        + book.nameAuthor + " | Жанр : " + book.genre + " | Публикация :" + book.publishingHouse);
                break;
            }
        }
    }

    public static void FindNameAuthor(List<Book> list, String nameAuthor) {

        for (Book book : list) {
            if (book.nameAuthor.equals(nameAuthor)) {
                System.out.println("Название книги : " + book.nameBook + " | Автор : "
                        + book.nameAuthor + " | Жанр : " + book.genre + " | Публикация :" + book.publishingHouse);
            }
        }
    }

    public static int ChangeBook(List<Book> list) {

        int result = 0;
        System.out.println("Введите название книги в которой вы хотите что то поменять.");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (Book book : list) {
            if (book.nameBook.equals(str)) {
                FindNameBook(list,str);
                result = list.indexOf(book);
                break;
            }
        }
        return result;
    }
}
