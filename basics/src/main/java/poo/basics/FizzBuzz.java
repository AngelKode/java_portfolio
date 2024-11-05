package poo.basics;

public class FizzBuzz {
    private int range;
    FizzBuzz(int _range){
        this.range = _range;
    }
    public void calculate(){
        if(this.range == 0){
            System.out.println("Can't calculate fizzbuzz. Set a valid range");
            return;
        }

        for(int initialIterator = 1; initialIterator <= this.range; initialIterator++){

            if(initialIterator % 3 != 0 && initialIterator % 5 != 0){
                System.out.print(initialIterator + " ");
                continue;
            }

            if(initialIterator % 3 == 0){
                System.out.print("FIZZ");
            }

            if(initialIterator % 5 == 0){
                System.out.print("BUZZ ");
                continue;
            }

            System.out.print(" ");
        }
    }

    private void setRange(int _range){
        this.range = _range;
    }
}
