import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        Author aut = new Author();


        System.out.println("What is your favorite authors First Name?");
        aut.firstName = input.nextLine();

        System.out.println("What is your favorite authors Last Name?");
        aut.lastName = input.nextLine();

        System.out.println("What country is your favorite author from");
        aut.country = input.nextLine();

        System.out.println("How old is your favorite author?");
        aut.age = input.nextInt();
        input.nextLine();
        System.out.println("Is your favorite author still alive? (Y/N)");
        aut.isAlive = input.nextLine().toLowerCase().startsWith("y");
        ArrayList<Book> bookList = new ArrayList<>();


        String continueAddingBooks;
        do {
            System.out.println("Would you like to enter a book?(Y/N)");
            continueAddingBooks = input.next().toLowerCase();

            if (continueAddingBooks.equals("y")) {
                input.nextLine();
                System.out.println("Whats the title of the book?");
                String title = input.nextLine();
                System.out.println("Whats the genre of the book?");
                String genre = input.nextLine();
                System.out.println("How many pages does the book have?");
                int pages = input.nextInt();

                bookList.add(new Book(title, genre, pages));
            } else break;

        } while (continueAddingBooks.equals("y"));

        Author author = new Author(aut.firstName, aut.lastName, aut.country, aut.isAlive, aut.age, bookList);


        System.out.println("The authors information is " + author);


    }

}
