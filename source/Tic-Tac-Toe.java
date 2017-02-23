public class Tic-Tac-Toe
{
public static void main(String args[])
  {
char tic[][]=new char[3][3];
  for(int i=0;i<tic.length;i++)
    {

    for(int j=0;i<tic.length;j++)
       {
         tic[i][j]='.';
        }
      }
System.out.println(tic);
    }
}

