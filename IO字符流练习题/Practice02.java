package practice;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class Practice02 {
/**
 * ��д���򣬱���D���µ����з����ص��ļ��к��ļ�,���ļ��к��ļ�����Ϣ��¼��output.txt�ı��ļ��С�
 */
	//��¼�ݹ���õĴ���
	static int count = 0;
	
	public static void main(String[] args) {
		File f = new File("D:\\");
		
		long l1 = System.currentTimeMillis();//��������ǰ��ʱ�䣨��������
		getFilesName(f);
		long l2 = System.currentTimeMillis();//�������ú��ʱ��
		System.out.println("�ݹ��ѯD�������ļ��Ϳ�Ŀ¼��"+((l2-l1)/1000.0)+"��");
		System.out.println("�����ݹ�����ˣ�"+count+"��");
	}
	
	//�ݹ����
	public static void getFilesName(File fe){
		count++;
		BufferedWriter bw = null;
		OutputStreamWriter osw = null;
			try {
				osw = new OutputStreamWriter((new FileOutputStream("output.txt",true)));//,"UTF-8"
				bw = new BufferedWriter(osw);
				
				
				File[] fname = fe.listFiles();//��һ��Ŀ¼�µ�ֱ����Ŀ¼(��������Ŀ¼����Ŀ¼...)���ļ�ȫ��ȡ���Ž�File������
			
				for(int i=0;i<fname.length;i++){
					if(!fname[i].isHidden()){//�������ļ�
						if(fname[i].isDirectory()){//�ж��Ƿ�ΪĿ¼
							String [] list = fname[i].list();
							if(list.length==0){//�жϸ�Ŀ¼�Ƿ�Ϊ��Ŀ¼
								bw.write(fname[i].getAbsolutePath()+"\r\n");
							}
							else{
								//��Ŀ¼�Ҳ�Ϊ�գ��͵ݹ����
								getFilesName(fname[i]);
							}
						}
						else if(fname[i].isFile()){//�ж��Ƿ�Ϊ�ļ�
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
					//�ȴ򿪵ĺ�رգ���򿪵��ȹر�
					bw.close();
					osw.close();	
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
	}	



}
