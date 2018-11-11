package class10.homework.chapter7;

public class SonA extends Father {

	//SonA不添加任何新属性、方法
	//继承Father
	public static void main(String[] args) {
		//同包子类调用
		Father f = new Father();
		f.publicMethod();
		f.protectedMethod();
		f.defaultMethod();
//		f.privateMethod(); //
	
	}
	}