import java.util.Random;


class BigNumberLaw{
    static Random rand = new Random();

    /*die rolling*/
    public static int die(){
        return rand.nextInt(1,7);
    }
  
    public static void main(String args[])
    {   
        //THEORY: If I roll many times, the average will be close 3.5 
        double average = 0;
        long many = 100000;
        for(int i = 0; i < n; i++){
            average += die();
        }
        average /= n;
        System.out.println("The average is: " + average);
        System.out.println("distance: "+ Math.abs(3.5 - average));
    }
}
    
