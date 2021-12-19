package array;

public class ForEachLoopPractice1 {
    public static void main(String[] args) {

        double [] checks ={ 2540, 10000, 100000, 65.50, 1.99};
        //by using each loop, find and print out the total amount of checks
        double total = 0;
        for(double check : checks){
            total = total+ check;
            //or we can use this way total+=check

        }
            System.out.println(total);
    }

}
