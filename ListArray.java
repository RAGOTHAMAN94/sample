package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
List<Integer> myList=new ArrayList<Integer>(a);
	for(int i=0;i<a;i++) {
		myList.add(s.nextInt());
		System.out.println(myList);
}
int q=s.nextInt();
for(int i=0;i<q;i++)
{
	if(s.next().equalsIgnoreCase("insert"))
	{
		int index=s.nextInt();
		int value=s.nextInt();
		myList.add(index, value);
		System.out.println(index+""+value);
	}else
	{
		myList.remove(0);
	}}
for(int z:myList) {
	System.out.println(myList);
	
}
}
}
