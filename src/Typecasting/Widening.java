package Typecasting;
class Widening
{
public static void main(String[] args)
{
	
	
	//byte to all
	{
byte a=125;
short b=a;
System.out.println("orignal value of byte  a is "+a);
System.out.println("converted value byte to short "+b);

int c=a;
System.out.println("converted value byte to int "+c);

long d=a;
System.out.println("converted value byte to long "+d);

float e=a;
System.out.println("converted value byte to float "+e);

double f=a;
System.out.println("converted value byte to doable  "+f);
System.out.println();
	}
	
	//short to all
	
		{

short a=126;
int c=a;
System.out.println("orignal value of  short a "+a);
System.out.println("converted value short to int "+c);

long d=a;
System.out.println("converted value short to long "+d);

float e=a;
System.out.println("converted value short to float "+e);

double f=a;
System.out.println("converted value short to doable  "+f);
System.out.println();
	}


//int to all
	{
int a=127;
long d=a;
System.out.println("orignal value of  int a "+a);
System.out.println("converted value int to long "+d);

float e=a;
System.out.println("converted value int to float "+e);

double f=a;
System.out.println("converted value int to doable  "+f);
System.out.println();
	}


//long to all
	{

long a=128;
float e=a;
double f=a;
System.out.println("orignal value of  long a "+a);
System.out.println("converted value long to float "+e);
System.out.println("converted value long to doable  "+f);
System.out.println();
	}
	

//float to all
	{
float a=129;
double f=a;
System.out.println("orignal value of  float a "+a);
System.out.println("converted value float to doable  "+f);
System.out.println();
	}


}
}
