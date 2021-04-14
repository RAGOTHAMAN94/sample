package sample;

import java.util.ArrayList;

public class LambedaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> num=new ArrayList<Integer>();
num.add(2);
num.add(4);
num.add(6);
num.add(8);
/*
 * for(int i:num) { System.out.println(i); }
 */
num.forEach( (i) -> {System.out.println(i);});
	}}
