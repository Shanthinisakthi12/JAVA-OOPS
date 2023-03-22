class Animal1{  
int a;
int b;
void eat(int a,int b){
this.a=a;
this.b=b; 
} }
class Dog extends Animal1{ 
int c;
 void sum(){
	c=a+b;
System.out.println("sum="+c);}  
}
class fg extends Dog {
	void h(){
		int j=c*b;
System.out.println("prod="+j);}}
class Animal{  
public static void main(String args[]){  
fg d=new fg();  
d.eat(1,2);  
d.sum(); 
d.h(); 
}}  