public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */
    public Book() {

    }



    //Create 3 args custom constructor here
    //YOUR CODE HERE
    public Book(String name, String genre, int totalPage){
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }


    //Define instance variables here
    //YOUR CODE HERE
    public String name;
    public String genre;
    public int totalPage;




    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
/*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

}
