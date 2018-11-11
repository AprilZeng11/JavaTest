package class10.homework.chapter9_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileIO1 {
	String target;
	//1.用字符流的方法实现把文件复制到指定路径
	public void copyFile(String src,String tgt) {
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tgt);
			int ch;
			while((ch=fr.read() )!=-1) {
				fw.write(ch);		
			}
			fr.close();
			fw.flush();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//2.比如在C盘下有个test.txt的文件，内容随意，先用JAVA实现新建一个目录，
	//C：/test然后把文件通过字符流的方式复制到其下面，命名为test_copy.txt
	public void copyFile() {
		File file = new File("c://test");
		file.mkdir();
		System.out.println(file.getAbsolutePath());
		this.target=file.getAbsolutePath() + "//test_copy.txt";
		try {
			BufferedReader bfr = new BufferedReader(new FileReader("c://test.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter(target,true));
			int ch;
			while((ch=bfr.read() )!=-1) {
				bfw.write(ch);	
			}
			//3.紧接第二题，用字符流追加的方法在文件最后添加一段“i'm study in dongnao!!!”
//			bfw.write("i'm study in dongnao!!!");
			bfr.close();
			bfw.flush();
			bfw.close();		
			System.out.println(target);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//3.紧接第二题，用字符流追加的方法在文件最后添加一段“i'm study in dongnao!!!”
	public void writeFile() {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter(target,true));
			bfw.write("i'm study in dongnao!!!");
			bfw.flush();
			bfw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//4.编写删除文件的代码，并判断文件是否存在，如果不存在则提示
	public  void deleteFile() {
		File file = new File("./data/deleteFile.txt");
		System.out.println(file.delete());
		if(file.exists()!=true) {
			System.out.println(file.getAbsolutePath() + "文件不存在");
		}
	}	
	
    //把前面写的9*9乘法表保存到文件中
	public void savaToFile(String fileName) {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter(fileName));
			String tempStr = null;
			for(int i=1;i<=9;i++) {
				for(int j=1;j<=i;j++) {
					tempStr = i+"x" + j + "=" + i*j + "   " ;
					bfw.write(tempStr);
				}bfw.write("\n");
			}
			bfw.flush();
			bfw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//自行实现使用流复制对象的代码
	@SuppressWarnings("rawtypes")
	public void objectStreamCopy(String str) {
		ArrayList<Object> obw = new ArrayList<Object>();
		obw.add(str);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./data\\objectCOPY.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./data\\objectCOPY.txt"));
			oos.writeObject(obw);
			Object obj = ois.readObject();
			ArrayList obr = (ArrayList) obj;
			for (Object i : obr) {			
				System.out.println(i);
			}
			oos.close();
			ois.close();			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
}
	

	public static void main(String[] args) {
		FileIO1 file = new FileIO1();
//		file.copyFile("./data/Test.txt" ,  "./data/copyTest.txt");
		file.copyFile();
//		file.writeFile();
//		file.deleteFile();
//		file.savaToFile("./data/1.txt");
//		file.objectStreamCopy("test");
//		file.objectStreamCopy("10");

	}
}
