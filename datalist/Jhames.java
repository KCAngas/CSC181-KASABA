import java.util.Scanner;

class hakdog{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean proceed = true;

        while (proceed){
            boolean[] checker = {false, false, false, false, false, false, false, false, false, false};
            int checkerI = 0;
            int result = 0;
            
            System.out.println("Choose a number from 1-10");
            int multiplier = input.nextInt();
            
            for (int multiplicand = 1; multiplicand <= 10;){
                System.out.print(multiplier +" x "+ multiplicand + ": ");
                int answer = input.nextInt();

                if(checkerI <= 10){
                    if(answer == multiplier * multiplicand){
                    checker[checkerI] = true;
                    checkerI++;
                    }
                    else{
                        checkerI++;
                    }
                }
                multiplicand++;
            } 
            for(int r = 0; r < 10;){
                
                if(checker[r] == true){
                    result++; 
                    r++;
                }
                else{
                    r++;
                }
            }
            System.out.println("You got " +result+ " out of 10"+"\n");
            System.out.print("Try again? [y] or [n]: ");
            String choice = input.next();

            switch(choice){
                case("y"):
                    continue;
                case("n"):
                    input.close();
                    proceed = false;
                    break;
                default:
                    input.close();
                    proceed = false;
                    break;
            }
        }  
    }
}