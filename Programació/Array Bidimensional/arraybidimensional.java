import java.util.Random;

public class arraybidimensional {

    public static void main(String[] args) {
        Random random = new Random();
        int array1[][] = new int[3][4];
        
        for(int x = 0; x < array1.length;x++)
        {
            for(int i = 0; i < array1[x].length;i++)
            {
                array1[x][i] = random.nextInt(10)+1;
                System.out.print("\t" + array1[x][i] + " ");
                

            }
        }
        System.out.print();
        
    }
}