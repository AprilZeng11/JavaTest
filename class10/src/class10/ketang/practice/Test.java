package class10.ketang.practice;

import java.util.Arrays;

public class Test{
public static void main (String[] args) {

	int []array = new int [10]; //分配长度
	String [] array1 = new String[] {}; //初始化一个字符数据，未有初始值
	String [] array2 = new String[] {"hello","world"};//初始化一个字符数据，有初始值，此时长度不能写
	int [] array3 = {1,2,3,4};//有初始值简化版
	for (int i=0;i<array3.length;i++) {
		System.out.println(array3[i]);
	}
	for (int i=0;i<array2.length;i++) {
		System.out.println(array2[i]);
	}
	System.out.println(Arrays.toString(array3));


	}
}