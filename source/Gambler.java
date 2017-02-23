import java.util.*;
public class Gambler
{
private int stack;
private int chances;
private int goal;
public Gambler(int stack,int chances,int goal)
{
this.stack=stack;
this.chances=chances;
this.goal=goal;
}
public int getStack()
{
return stack;
}
public int getChances()
{
return chances;
}

public int getGoal()
{
return goal;
}
public void play()
{
if(stack !=0 && goal !=0 && chances != 0)
{

double num1=Math.random()*(10);
int num=(int)num1;
System.out.println(num);
Scanner sc=new Scanner(System.in);
System.out.println("The number is generated...for u..please enter ur guess");
int guess=sc.nextInt();
if(guess==num)
{ stack=stack+1;
chances--;
System.out.println("ur guess is correct....you won the bet");
goal--;
}
else
{
stack--;
chances--;
System.out.println("oops..ur guess is wrong.....");
}
}
else
{
System.out.println("oops u dont have option tp play.....");
System.out.println("Register again nd play");
}
}
public static void main(String args[])
{
System.out.println("u want to play...");
System.out.println("the game is simple u have to guess the number between 1to 10");
System.out.println("if ur guess is right u will win the bet...nd rewards $1");
System.out.println("if u loss the bet u have to pay 1$");
Scanner sc =new Scanner(System.in);
System.out.println("please enter with how much money u wanted play");
int g1=sc.nextInt();
int g2=0;
if(g1<10)
{
g2=g1;System.out.println("u have only "+ g2 +" chances");
}
else
{
g2=10;
System.out.println("u have only "+g2+" chances");
}
System.out.println("how much money u wanted to win");
int g3=sc.nextInt();
Gambler g =new Gambler(g1,g2,g3);
for(int i=0;i<=g2;i++)
{
g.play();
System.out.println("Balance :"+g.getStack()+" no of chances remaining : "+g.getChances());
}
}
}


