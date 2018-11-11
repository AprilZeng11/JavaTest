package class10.homework.chapter8;
//接口
public interface InterfaceSay {
	
	public abstract void fangYan();
	
	//接口中的方法可以为非抽象方法？
	public static void say() {
		System.out.println("说普通话");		
	}
}
