mport java.util.Scanner;

class Book{
    int bookid;
    String bookname;
    int noofpages;
    String Publisher;
    int price;
    Scanner s = new Scanner(System.in);

    Book(){};
    void input(){
        System.out.println("Enter Details:");
        System.out.println("Bookid\nBook Name\nNumber of pages\nPublisher\nPrice");
        bookid = s.nextInt();
        bookname = s.next();
        noofpages = s.nextInt();
        Publisher = s.next();
        price = s.nextInt();
    }
}

public class Book_main {
    static Book b[];
    static void high(int n){
        int max = b[0].price;
        for(int i = 0; i < n; i++){
            if(b[i].price > max){
                max = b[i].price;
            }
        }
        for(int i = 0; i < n; i++){
            if(b[i].price == max){
                System.out.println("Book Name :" + b[i].bookname);
                System.out.println("Book ID :" + b[i].bookid);
            }
        }
    }
    static void Publish(String name, int n){
        for(int i = 0; i < n; i++){
            if(b[i].Publisher.equals(name)){
                System.out.println("Book Name :" + b[i].bookname);
                System.out.println("Book ID :" + b[i].bookid);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number of Books");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        b = new Book[n];
        for(int i = 0; i < n; i++){
            b[i] = new Book();
            b[i].input();
        }
        System.out.println("Enter Publisher Name :");
        String name = s.next();
        Publish(name, n);
        high(n);


    }
}