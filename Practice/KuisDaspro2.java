package Practice;

public class KuisDaspro2{
    public static void main(String[]args){
        
        char A[] = {'A','B','C','D','E','F','G','H','I','J'};
        int index = 0;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(A[index]);
                index++;
            }
            System.out.println();
        }
    }
}