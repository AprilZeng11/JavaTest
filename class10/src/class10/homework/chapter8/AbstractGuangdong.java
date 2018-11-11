package class10.homework.chapter8;

//抽象类的子类不是抽象类
public class AbstractGuangdong extends AbstractChinese{

	@Override
	public void eat() {
		// 必须实现父类的抽象方法
		System.out.println("广东人喝早茶");		
	}
	
	@Override
	public void say() {
		//必须实现父类的所有抽象方法		
		System.out.println("广东人说粤语");
	}
	
	public void fangYan() {
		System.out.println("广东方言有潮汕话");		
	}
	
	public static void main(String[ ] args) {
//		AbstractChinese AC = new AbstractChinese() ;  //错误。抽象类无法实例化
		//抽象类多态
		AbstractChinese AC =new AbstractGuangdong();
		AC.eat();
		AbstractGuangdong AD = (AbstractGuangdong)AC;
		AD.fangYan();		
	}
}
