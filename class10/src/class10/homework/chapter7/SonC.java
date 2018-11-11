package class10.homework.chapter7;

public class SonC extends Father{
	//SonC添加新属性、方法重写
	private int weight = 50;
	protected int height = 180;
	
	public void publicMethod() {
		System.out.println("SonC public方法重写");
	}
	
	private void privateMethod() {
		System.out.println("Sonc private方法");
	}
}
