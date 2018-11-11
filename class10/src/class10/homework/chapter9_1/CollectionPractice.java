package class10.homework.chapter9_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class CollectionPractice {

	//封装读取文件的方法，返回String
	public String readFile(String fileName) {
		String string="" ;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String readline ;
			while((readline =br.readLine())!=null) {
				string+=readline;
			}
			br.close();
			return string;	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return null;	
	}
	
	//1.任意找一个文本文件，统计里面各种不同的单词
	public void hasWords() {
		Set <String> set = new HashSet<>();
		String str = readFile("./data/file.txt").toLowerCase();
//		String [] newStr = str.split("[ |,|.]");
		String[] newStr = str.split("\\s+|\\.|\\,|\\n|\\t");   //字符串有空格时，分割有问题
		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]);
		}
		for(String s:newStr) {
			set.add(s);
		}
		System.out.println("文本中包含不同的单词有： " + set);
	}
	//2.任找一个文本文件，统计各单词有个数
	public void numbsInWords() {
		Map<String, Integer>map = new HashMap<>();
		String str = readFile("./data/file.txt").toLowerCase();
		String [] newStr = str.split("\\s+|\\.|\\,|\\n|\\t");
		int counts;
		for(int i=0;i<newStr.length;i++) {
			if(map.containsKey(newStr[i])) {   //如果包含字符
				counts=map.get(newStr[i])+1;     //取该字符的第一个加1
				map.put(newStr[i], counts);
			}else {
				counts = 1;        
				map.put(newStr[i], counts);
			}
		}
		for(String key:map.keySet()) {
			System.out.println( key + "包含的个数有:" + map.get(key));
		}
	}
	
	//3.给一个文本文件，里面保存着一些水果名称，输入一个数字，
	//要求输出对应数量的水果名字且名字不重复
	public void getMapKey() {
		Map<String, Integer>map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String str = readFile("./data/fruit.txt").toLowerCase();
//		System.out.println(str);
		String [] newStr = str.split("，|,");
		//把从文本中获取到的字符串转为map
		int counts;
		for(int i=0;i<newStr.length;i++) {
			if(map.containsKey(newStr[i])) {   //如果包含字符
				counts=map.get(newStr[i])+1;     //取该字符的第一个加1
				map.put(newStr[i], counts);
			}else {
				counts = 1;        
				map.put(newStr[i], counts);
			}
		}
		System.out.println("输入一个整数：");
		int i = sc.nextInt();
		//根据输入数遍历map value值，输出相对于的key值
		for(Entry<String, Integer>kv:map.entrySet()) {
			if(kv.getValue()==i) {
				System.out.println("包含该数目的水果有：" + kv.getKey());
			}
			sc.close();
		}
		System.out.println("没有包含该数目的水果");
}
	
//	4.某学校有若干学生(学生对象放在一个List中)，
//	每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 某次考试结束后，
//	每个学生都获得了一个考试成绩。遍历list集合，把各班级学生人数、考试平均分计算出来
	
	

	public void name() {
		Map<String, String>map = new HashMap<>();
		Set<String> set = map.keySet();
		map.put("姓名", "april");
		map.put("name", "zeng");
		map.put("名字", "april");
		for(Entry<String, String>kv:map.entrySet()) {
			if(kv.getValue()=="april") {
				System.out.println(kv.getKey());
			}
		}		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		CollectionPractice cp = new CollectionPractice();
//		String t = cp.readFile();
//		System.out.println(t);
		cp.hasWords();
//		cp.numbsInWords();
//		cp.getMapKey();
//		cp.name();

	}
	
}
