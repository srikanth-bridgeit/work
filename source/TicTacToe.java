import java.util.*;
public class TicTacToe
{
char tic[][]=new char[3][3];
public void startGame()
{
  for(int i=0;i<tic.length;i++)
    {

    for(int j=0;j<tic.length;j++)
       {
         tic[i][j]='.';

        }
      }
}
public void change(int c,int x,int y)
{
switch( c)
{
case 1:
tic[x][y]='X';
break;
case 2:
tic[x][y]='0';
}
}
public void view()
{
for(int i=0;i<tic.length;i++)
    {

    for(int j=0;j<tic.length;j++)
       {
    System.out.print(tic[i][j]+"    ");

        }
System.out.println();
System.out.println();
      }
System.out.println();
System.out.println("------------------");

    }
public boolean check(char c)
{
System.out.println("....");

if(tic[0][0]==c &&tic[0][1]==c &&tic[0][2]==c ||tic[1][0]==c &&tic[1][1]==c &&tic[1][2]==c  || tic[2][0]==c && tic[2][1]==c &&tic[2][2]==c || tic[0][0]==c && tic[1][1]==c &&tic[2][2]==c || tic[0][2]==c &&tic[1][1]==c &&tic[2][0]==c ||tic[0][0]==c &&tic[1][0]==c &&tic[2][0]==c || tic[0][1]==c &&tic[1][1]==c &&tic[2][1]==c || tic[0][2]==c &&tic[1][2]==c &&tic[2][2]==c )
{
System.out.println("....");
return true;
}else
{
return false;
}
}
public void game()
{
int row;
int col;
boolean x=true;
Scanner sc1= new Scanner(System.in);
Scanner sc2= new Scanner(System.in);
for(int count=1;count<=9;count++)
{
    if(x)
      {

	System.out.println("Player 1 has to play now....");
	
	row=sc1.nextInt();
	col=sc2.nextInt();
	change(1,row,col);
         if(check('X')==true)
        {
     System.out.println("the palyer1 won the match");
       break;
	}
       x=false;
view(); }
      
	else
	{
	System.out.println("Player 2 has to play now....");
	
	row=sc1.nextInt();
	col=sc2.nextInt();
	change(2,row,col);
         if(check('0')==true)
{
  System.out.println("the palyer 2 won the match");
break;
	}
         x=true;
        view();
	}
      
     }
System.out.println("the game is ended.........");

}

 public static void main(String args[])
   {
    	TicTacToe t=new TicTacToe();
	t.startGame();
	t.view();
	t.game();
	t.view();

       }
}

