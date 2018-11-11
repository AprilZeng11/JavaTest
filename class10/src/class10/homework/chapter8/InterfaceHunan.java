package class10.homework.chapter8;

//实现类不是抽象类
public class InterfaceHunan implements InterfaceChinese,InterfaceSay{

	@Override
	public void eat() {
		// 单个类实现多个接口，需实现所有接口中抽象方法
		System.out.println("爱吃辣");
	}

	@Override
	public void fangYan() {
		// 单个类实现多个接口，需实现所有接口中抽象方法
		System.out.println("说长沙话");		
	}
}
