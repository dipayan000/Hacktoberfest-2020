
/*
   Name-Roshan Kumar Banwar
   Reg No.-2019PGCACA68
*/
/*
Write a java program to apply mod operation for each entry and display
multiplication table of modulo 16. The example for multiplication table modulo 4 is
given below:
X 0 1 2 3
0 0 0 0 0
1 0 1 2 3
2 0 2 0 2
3 0 3 2 1
*/






public class prog7 {
        public static void main(String[] args)
    {
        int arr[][]={{5,56,23},{13,24,40,},{10,20,30}};
       
        
          for(int i=0;i<3;i++)
          {
              for(int j=0;j<3;j++)
                System.out.print(arr[i][j]%16+"  ");
               System.out.print("\n");
          }
    }
}
