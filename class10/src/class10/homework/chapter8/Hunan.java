package class10.homework.chapter8;

//继承关系
public class Hunan extends Chinese{
	String name = "湖南人";
	int number = 1;
	
	public void eat() {
		//子类方法重写
		System.out.println(name + "爱吃辣");		
	}
	
	public void fangYan() {
		System.out.println("长沙话 ");
	}
	
	public static void main(String [] args) {
		//多态：父类引用指向子类对象
		Chinese ch = new Hunan();
		ch.eat();    //调用子类方法
		System.out.println(ch.number);   //父类的成员变量

		//向下转型：强制将父类引用转为子类引用
		Hunan hn = (Hunan) ch;
		hn.fangYan();		
	}
	
}
