package FullStack;
public class MirroredRhombusStar {
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
                System.out.print("*");
              
            }
            System.out.print("\n");
            
        }
    }
}