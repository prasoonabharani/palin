import java.util.*;
class Palindrome
 {
public static void main(String[] args) 
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
str=sc.nextLine();
char ch[]=str.toCharArray();
int n=ch.length;
 char arr[]=new char[n];
int j=0,count=0;
for(int i=n-1;i>=0;i--)
{
 arr[j]=ch[i];
 j++;
  }
for(int i=0;i<n;i++)
 {
  if(arr[i]==ch[i])
   count++;
 }
 if(count==n)
 {      
 System.out.println("it is Palindrome");
}       
 else
{
System.out.println("it  is not a palindrome"); }
}}
