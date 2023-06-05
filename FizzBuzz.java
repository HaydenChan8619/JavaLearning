public class FizzBuzz {

    // This program prints the first 100 outputs for the basic coding problem "FizzBuzz"
    // if multiple of 3 & 7, print "FizzBuzz"
    // else if multiple of 3, print "Fizz"
    // else if multiple of 7, print "Buzz"
    // else print number
    //static int test = 10;
    static void FizzBuzzDisplay() {

        int counter = 1;

        while (counter < 101){

            if (counter % 3 == 0 && counter % 7 == 0){

                System.out.println("FizzBuzz");

            } else if (counter % 3 == 0){
                System.out.println("Fizz");

            } else if (counter % 7 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }

            counter = ++counter;

        }

        //test = ++test;

        //System.out.println(test);

    }

    public static void main(String[] args) {
        FizzBuzzDisplay();
    }
}
