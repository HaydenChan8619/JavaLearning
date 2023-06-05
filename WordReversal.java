import java.util.Scanner; // scanner class used to acquire user input

public class WordReversal {

    // The following code will flip the order of the words in an inputted sentence (based on spaces)
    // Example: Input "Dog is good" ; Output "good is Dog"

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String sentence;

        System.out.println("Type a sentence to be reversed!");

        sentence = userInput.nextLine();

        String[] stringArrayed; //user input split into each word

        stringArrayed = sentence.split(" ");

        for (int i = stringArrayed.length; i > 0; i--){
             System.out.print(stringArrayed[i-1] + " ");
        }
    }
}
