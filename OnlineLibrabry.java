import java.util.Objects;
import java.util.Scanner;

public class OnlineLibrabry {
    static String[] availableBooks={
        "Gitanjli","Geeta","Ramayan","The Rig Veda","The Yajur Veda","The Runner"
    };
    static String [] issuedBooks=new String[availableBooks.length];

    public static void main(String[] args){
        for(;;){
            int choice=userInput();
            switch(choice){
                case 0:
                System.out.print("Library closed");
                System.out.println(0);
                break;
                case 1:
                printAvailableBook();
                break;

                case 2:
                returnBook();
                break;

                case 3:
                printIssuedBooks();
                break;

                default:
                System.out.println("Inavlid Input");
            }
        }
    }
    
        static int userInput(){
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("\n1.To see Available books \n2.To issue a book \n3.To submit a book\n");
                System.out.print("4.To see issued books \n0 To close Library \n Enter your choice:");
                return scan.nextInt();
            }
        }        
            static void printAvailableBook(){
            int j=1;
            for(String availableBook:availableBooks){
                if(availableBook!=null){
                    System.out.println((j++)+"."+availableBook);
                }
               
            }
            
        }
      
            static void printIssuedBooks(){
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the book name which to be issue");
                String bookName=scan.next();
                int i=0;
                while(!Objects.equals(bookName,availableBooks[i])){
                    i++;
                    if(i==availableBooks.length){
                        System.out.println("\n"+bookName+"is not available in the library");
                        return ;
                    }
                    scan.close();
              }
              System.out.println("Book Issued");
              int j=0;
              while(!Objects.equals(null,issuedBooks[i])){
                j++;
              }
              issuedBooks[j]=availableBooks[i];
              availableBooks[i]=null;
            }
            static void returnBook(){
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the book name which to be submit");
                String bookName=scan.next();
                for(int j=0;j<issuedBooks.length;j++){
                    if(Objects.equals(issuedBooks[j],bookName)){
                        int i=0;
                        while(availableBooks[i]!=null){
                            i++;
                        }
                        availableBooks[i]=bookName;
                        issuedBooks[i]=null;
                        System.out.println("\n Book submitted");
                        return ;
                    }
                    scan.close();
                }
                System.out.println("\n This book has not issued from this Library");
            }
            static void printIssuedBook(){
                int n=1;
                for(String issuedBook:issuedBooks){
                    if(issuedBook!=null){
                        System.out.println((n++)+"."+issuedBook);
                    }
                }
                if(n==1)
                {
                    System.out.println("No any book issued yet!");
                }
            }
        }


