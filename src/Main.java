import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        String[] scStrings = scString.split(" ");
        int[] scNumbers = new int[scStrings.length];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < scStrings.length; i++) {
            scNumbers[i] = Integer.parseInt(scStrings[i]);
        }
        for(int i = 0; i<scNumbers.length;i++){
            if(scNumbers[i]<0){
                sum+=scNumbers[i];
                count+=1;
            }
        }
        System.out.println(count+" "+sum);
    }
}
