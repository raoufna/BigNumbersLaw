import java.util.Random;


class BigNumberLaw{
    static Random rand = new Random();

    /*die rolling*/
    public static int die(){
        return rand.nextInt(1,7);
    }
  
    public static void main(String args[])
    {   
        //THEORY: The average value of a fair 6-sided die is 3.5.
        //If I roll many times, the average will be close 3.5 
        double average = 0;
        long many = 10000000;
        for(int i = 0; i < many; i++){
            average += die();
        }
        average /= many;
        System.out.println("The average is: " + average);
        System.out.println("distance: "+ Math.abs(3.5 - average));
    }
}
    
