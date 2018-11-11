package class10.homework.chapter8;

public class InterfaceGuangdong implements InterfaceChinese{
	int num= 1;

	@Override
	public void eat() {
		// 实现接口中的抽象方法
		System.out.println("喝早茶");	
	}
		
	public static void main(String[] agrs) {
		//接口多态
		InterfaceChinese GD = new InterfaceGuangdong();
		InterfaceChinese HNE = new InterfaceHunan();
		InterfaceSay HNS = new InterfaceHunan();
		GD.eat();
		System.out.println(InterfaceChinese.num);  //接口常量
		HNE.eat();
		HNS.fangYan();
		
		
		InterfaceGuangdong  gd1=(InterfaceGuangdong)GD;
		System.out.println(gd1.num);   //实现类变量
		
//		InterfaceHunan hn= new InterfaceHunan();
		
	}

}
