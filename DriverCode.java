package algo.ADCOM;
import java.util.Scanner;

public class DriverCode {
    private static int []arr;
    private static int []brr;
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to use Custom Input, or 0 to use System Defined Input ");
        int K = sc.nextInt();
            if (K == 0) {
                arr = new int[]{18,15,10,11,11,12,8,10,10,8,6,8,6,6,5,6,7};//HOME WINS IN 19/20
                brr = new int[]{10,13,9,9,9,10,7,8,5,4,8,6,6,6,4,10,7};//HOME WINS IN 20/21
                /**Liverpool, Oily Blues, True Manchester, Chelsea, Leicester, Spurs, Wolves, Arsenal, Sheffield,
                 *Burnley, Saints, Everton, Newcastle, Palace, Brighton, West Ham, Aston Villa.
                 * All 17 teams which played in both seasons (3 relegated). Corresponds to Index 0-16 respectively */
                N=arr.length;
            }
            else if (K == 1)
            {
                System.out.println("ENTER SIZE OF INPUT");
                N = sc.nextInt();
                arr=new int[N];
                brr=new int[N];
                for(int i=0;i<N;i++)
                {
                    System.out.println("ENTER "+(i+1)+"th VALUE FOR First Sample");
                    arr[i]=sc.nextInt();
                    System.out.println("ENTER "+(i+1)+"th VALUE FOR Second Sample");
                    brr[i]=sc.nextInt();
                }
            }
        pairedT_Test pairedT_test=new pairedT_Test();
        double D=pairedT_test.sumOfDiff(arr,brr);
        double sqD= pairedT_test.sumOfSquaredDiff(arr,brr);
        pairedT_test.tTest(D,sqD,N);
    }
}
