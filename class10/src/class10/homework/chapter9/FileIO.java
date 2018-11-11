package class10.homework.chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	int line;
	
	//2. 编写java代码：采用缓冲文件输入流、缓冲输出流复制文件，每次读取一行，
	//再把该行写入到输出流中，直到文件复制完毕
	public void copyFileByLine(String source, String target) {
		try {
			FileReader read = new FileReader(source);
			BufferedReader bfR = new BufferedReader(read);
			BufferedWriter bfW = new BufferedWriter(new FileWriter(target, true));
//			int rd = read.read();  //读取单个字符
//			String readline = bf.readLine();   //整行读取
			String readline =null;
			while ((readline= bfR.readLine()) != null) {
				System.out.println(readline);
				bfW.write(readline);
				bfW.write("\n");
			}
			bfW.flush();
			bfW.close();
			bfR.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//3. 编写java代码：要求把1000---2000之间所有的闰年输出到文本文件中
	public void leapYearToFile(int start, int end,String target) {
		try {
			FileWriter write = new FileWriter(target,true);
			write.write("闰年的年份有：\n");
			int leapYear = start;
			while(leapYear<=end) {
				if ((leapYear%4==0&&leapYear%100!=0) ||leapYear%400==0) {
//					write.write(Integer.toString(leapYear)); //强转int to string
					write.write(leapYear + "");  //简单转 int  to string
					write.write("\n");
//					System.out.println(leapYear + "是闰年");
				}
				leapYear ++;
			}
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//4. 编写java代码：把多个文本文件的内容合并到一个文本文件中
	// 实际:把一个路径下的所有文件合并到一个文件夹
	public void multiFileToOne(String sourceDir,String targetFile) {		
		File file = new File(sourceDir);
//		System.out.println(file.isDirectory());
		File[] f = file.listFiles();
		for (int i=0;i<f.length;i++) {
			System.out.println(f[i].getName());
			String fileName = f[i].getName();
		try {
			BufferedReader read= new BufferedReader(new FileReader(f[i]));
			BufferedWriter write = new BufferedWriter(new FileWriter(targetFile,true));
			String tempStr = null;
			write.write(fileName + "\n");
			while((tempStr=read.readLine())!=null) {
//				tempStr +=tempStr;
//					System.out.println(tempStr);	
				write.write(tempStr +"\n" );
			}
			read.close();
			write.flush();
			write.close();				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
		
	public static void main(String[] args) {
		FileIO file = new FileIO();
//		file.copyFileByLine("./data/test.txt", "./data/target.txt");
		file.leapYearToFile(1000,2000,"./data/file.txt");
//		file.multiFileToOne("./data/" , "./data/ONE.txt");
	}
}
