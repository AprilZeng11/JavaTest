package class10.ketang.stuty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class Stu{
	public Stu(String name, String className, double score) {
		super();
		this.name = name;
		this.className = className;
		this.score = score;
	}
	String name;
	String className;
	double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}

class Summary{
	public Summary(String className, double totalScore, int count) {
		super();
		this.className = className;
		this.totalScore = totalScore;
		this.count = count;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	String className;
	double totalScore;
	int count;
	
}

public class Test02 {
//������һ���ı��ļ���ͳ��������ֲ�ͬ�ĵ���
	public static Set<String> countWords(String file){
		//����һ�������洢��ͬ�ĵ���
		Set<String> set=new HashSet<String>();
		try {
			//ʹ�û����ַ���������ȡ�ļ�����
			BufferedReader br=new BufferedReader
					(new FileReader(file));
			String s="";
			//һ�ζ�ȡһ������
			while((s=br.readLine())!=null){
				//�Ѹ��а���Ӣ���е�һЩ�������ʷָ��������з�
				String[] arr=s.split("[ |,|.|!]");
				for(String ss:arr){
					if(ss.trim().length()>0){
						set.add(ss.trim());//�ѵõ���ÿ�����ʷŵ�set��
					}
					
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return set;
	}
	
//����һ���ı��ļ���ͳ�Ƹ������и���	
	public static Map<String,Integer> countWordsNum(String file){
		//����һ�������洢��ͬ�ĵ���
		Map<String,Integer> map=new HashMap<String,Integer>();
		try {
			//ʹ�û����ַ���������ȡ�ļ�����
			BufferedReader br=new BufferedReader
					(new FileReader(file));
			String s="";
			//һ�ζ�ȡһ������
			while((s=br.readLine())!=null){
				//�Ѹ��а���Ӣ���е�һЩ�������ʷָ��������з�
				String[] arr=s.split("[ |,|.|!]");
				for(String ss:arr){
					//�жϵ����Ƿ��Ѿ��洢��map��
					if(map.containsKey(ss)){
						map.put(ss, map.get(ss)+1);
					}else{
						map.put(ss, 1);
					}
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}
	
//��һ���ı��ļ������汣����һЩˮ�����ƣ�����һ�����֣�
	//Ҫ�������Ӧ������ˮ�����������ֲ��ظ�	
	public static Set<String> getFruites(String file,int count){
		Set<String> set=countWords(file);
		Set<String> set2=new HashSet<String>();
		for(String s:set){
			if(set2.size()!=count){
				set2.add(s);
			}else{
				break;
			}
		}
		return set2;
	}
	
//	ĳѧУ������ѧ��(ѧ���������һ��List��)��ÿ��ѧ����һ��
	//��������(String)���༶��������(String)�Ϳ��Գɼ�����(double)
	//ĳ�ο��Խ�����ÿ��ѧ���������һ�����Գɼ�������list���ϣ�
	//�Ѹ��༶ѧ������������ƽ���ּ������	
	public static Map<String,Summary> countScore(List<Stu> list){
		Map<String,Summary> map=new HashMap<String,Summary>();
		for(Stu s:list){
			String className=s.getClassName();
			if(map.containsKey(className)){
				Summary sum=map.get(className);
				map.put(className,new Summary
				(className,sum.getTotalScore()+s.getScore(),
						sum.getCount()+1));
			}else{
				map.put(className, new Summary
				(className,s.getScore(),1));
			}
		}
		return map;
	}
	
	//Ҫ�����10��������ַ���,ÿһ���ַ������಻�ظ�,
	//ÿһ���ַ�������ɵ��ַ�(a-zA-Z0-9)Ҳ����ͬ,ÿ���ַ�������Ϊ10��
	public static Set<String> randString(){
		
		Set<String> set=new HashSet<String>();
		while(set.size()!=10){
			set.add(rString());
		}
		return set;
	}
	
	private static String rString(){
		String ret="";
		char[] ch={'a','b','c','d','e'};
		Set<Character> set=new HashSet<Character>();
		Random rand=new Random();
		while(set.size()!=10){
			int i=rand.nextInt(ch.length);
			set.add(ch[i]);
		}
		for(Character s:set){
			ret+=s;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		//
		/*String s="one two three, four.six seven eight!nine";
		String[] arr=s.split("[ |,|.|!]");
		System.out.println(Arrays.toString(arr));
		*/
		Set<String> set=countWords("d:/201810/d.txt");
		System.out.println(set);
	}

}
