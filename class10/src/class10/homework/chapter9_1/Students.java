package class10.homework.chapter9_1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//4.某学校有若干学生(学生对象放在一个List中)，
//每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 某次考试结束后，
//每个学生都获得了一个考试成绩。遍历list集合，把各班级学生人数、考试平均分计算出来
public class Students {
	String name;
	String grade;
	double score;
	
	public ArrayList <Object> add(String name,String grade,double score) {
		ArrayList <Object>a = new ArrayList<Object>();
		a.add(name);
		a.add(grade);
		a.add(score);
//		System.out.println(al.get(2));
		return a;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Students studs = new Students();
//		Map<String,Object>map=new HashMap<String,Object>();
		ArrayList <Object>al = new ArrayList<Object>();	
		al.add(studs.add("学生a", "一年级", 50));
		al.add(studs.add("学生b", "二年级", 60));
		al.add(studs.add("学生c", "一年级", 50));
		Iterator it = al.iterator();
		while(it.hasNext()) {
			ArrayList<String> list = (ArrayList<String>) it.next();
			Set<String>set =new HashSet<String>();
			String str = list.get(1);
			set.add(str)	;
			System.out.println(list);
		}
		
		//第2种方法
//		for(Object o:al) {
//			ArrayList<Object> list1 = (ArrayList<Object>) o;
//			System.out.println(list1.get(2));
//		}
		//第三种方法
//		for (int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//				Object obj= al.get(i);
//				Iterator<Object> it = ((ArrayList<Object>) obj).iterator();
//				while(it.hasNext()) {
//					System.out.println(it.next());					
//				}
//			}
	}
	
	
}
