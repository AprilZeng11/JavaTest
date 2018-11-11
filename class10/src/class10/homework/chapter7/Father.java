package class10.homework.chapter7;


public class Father {
	public int age = 100;
	protected String name = "father";

	public void publicMethod() {
		System.out.println("public权限类");
	}
	
	protected void protectedMethod() {
		System.out.println("protected权限类");
	}
	
	void defaultMethod() {
		System.out.println("default权限类");
	}
	
	private void privateMethod() {
		System.out.println("private权限类");
	}
}
