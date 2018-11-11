package class10.homework.chapter9;

//1. 自定义异常类，调用异常类的无参构造方法、带参构造方法//
//自定义的异常，需继承Exception
public class ExceptionClass extends Exception {
	//自定义类的UID
	private static final long serialVersionUID = 1L;

	public ExceptionClass() {}  //无参构造方法，
	public ExceptionClass(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//调用无参构造方法
		ExceptionClass ec1 = new ExceptionClass();
		System.out.println(ec1);
		ec1.printStackTrace();
		//调用带参构造方法
		ExceptionClass ec2 = new ExceptionClass("打印异常信息");
		ec2.printStackTrace();		
	}
}
