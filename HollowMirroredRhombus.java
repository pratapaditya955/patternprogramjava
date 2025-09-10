package FullStack;

public class HollowMirroredRhombus{
     public static void main(String[] args) {
        int i;
        for( i=0;i<5;i++)

        {
            for(int k=0;k<i+1;k++)
            {
                System.out.print( " ");
            }
            for( int j=0;j<5;j++)
            {
                 if(i==0 ||i==4 ||j==0||j==4)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
            }
            System.out.print("\n");
            
        }
    }
    
}
