package practice;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class Practice02 {
/**
 * 编写程序，遍历D盘下的所有非隐藏的文件夹和文件,将文件夹和文件的信息记录到output.txt文本文件中。
 */
	//记录递归调用的次数
	static int count = 0;
	
	public static void main(String[] args) {
		File f = new File("D:\\");
		
		long l1 = System.currentTimeMillis();//方法调用前的时间（毫秒数）
		getFilesName(f);
		long l2 = System.currentTimeMillis();//方法调用后的时间
		System.out.println("递归查询D盘所有文件和空目录："+((l2-l1)/1000.0)+"秒");
		System.out.println("方法递归调用了："+count+"次");
	}
	
	//递归遍历
	public static void getFilesName(File fe){
		count++;
		BufferedWriter bw = null;
		OutputStreamWriter osw = null;
			try {
				osw = new OutputStreamWriter((new FileOutputStream("output.txt",true)));//,"UTF-8"
				bw = new BufferedWriter(osw);
				
				
				File[] fname = fe.listFiles();//将一个目录下的直接子目录(不包含子目录的子目录...)和文件全部取出放进File数组中
			
				for(int i=0;i<fname.length;i++){
					if(!fname[i].isHidden()){//非隐藏文件
						if(fname[i].isDirectory()){//判断是否为目录
							String [] list = fname[i].list();
							if(list.length==0){//判断该目录是否为空目录
								bw.write(fname[i].getAbsolutePath()+"\r\n");
							}
							else{
								//是目录且不为空，就递归遍历
								getFilesName(fname[i]);
							}
						}
						else if(fname[i].isFile()){//判断是否为文件
							bw.write(fname[i].getAbsolutePath() + "\r\n");
						}
					}
				}
				bw.flush();	
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					//先打开的后关闭，后打开的先关闭
					bw.close();
					osw.close();	
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
	}	



}
