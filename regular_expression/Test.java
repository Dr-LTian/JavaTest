package regular_expression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
		
		
	}
	
	public static void method1(){
		/**
		 *   �����ظ����������ƣ�����ʹ����������Ԫ�ַ���
		 *  1�� * ��ʾǰ���Ԫ���ظ�0�λ���
		 *  2�� ? ��ʾǰ���Ԫ���ظ�0�λ�1�� 
		 *  3�� + ��ʾǰ���Ԫ���ظ�1�λ���
		 */
		//matches(regex)�Ǿ�̬����,����ֱ��ͨ����������,�����ڸ�һ��������ʽ
		System.out.println("asdfghh".matches("a.+h"));//���.��ʾ���ⵥ���ַ�
		System.out.println("test".matches("te[sxdg]t"));//[]��������ȡֵ���ϣ�ƥ������ĳһ���ַ���
		System.out.println("abc".matches("[a-z]*"));//��[]��ʹ��-��ʾ��Χ���� [0-9] [A-Za-z0-9]��
		System.out.println("sdfg".matches("(sdfg)"));// ()�����綨�ӱ��ʽ��ƥ�����е���������
		System.out.println("sdfg".matches("(sdefg|dfgh|sdf)g"));// Ԫ�ַ�|��ʾ��Ĺ�ϵ
		System.out.println("sdfggg".matches("sdfg{3}"));//Ԫ�ַ�{n}��ʾǰ���Ԫ�ص��ظ�n�Σ�
		System.out.println("sdfggg".matches("sdfg{1,5}"));//{2,5}��ʾǰ���Ԫ���ظ�2��5�Σ�
		System.out.println("sdfggg".matches("sdfg{3,}"));//{3,}��ʾ�����ظ�3�Ρ�
		System.out.println("ddsdfghjkkl".matches(".*(sdfg|hjkl){1,}.*"));
		System.out.println("asdf.cn".matches(".*\\.(com|cn|org)"));// ת���ַ�\
		System.out.println("123466".matches("^.{6}$"));//Ԫ�ַ�^��$�� ^�����ַ�����ʼ��$�����ַ�������
		System.out.println("asdBghj".matches(".*B[^hjg].*"));// ��[]��ʹ��^��ʾ��
		
		/**
		 * \d == [0-9] \D == [^0-9]
		 * \w == ��ĸ�����»��� \W == ����ĸ�����»���
		 * \s ==���еĿհ��ַ� \S==�ǿհ��ַ�
		 */
		System.out.println("22345678g".matches("\\d+\\D*"));
		System.out.println("fg152__,.,".matches("\\w+\\W+"));
		System.out.println("fg  kk   j   ".matches("((\\S*)\\s*)*"));
	}
	
	public static void method2(){
		/**
		 * String replaceAll(String regex,String replacement)
		 * ����ǰ�ַ��������кͲ���regexָ����������ʽƥ����Ӵ������滻�� �������ַ�����
		 * ע��replaceAll()�����������ַ�����������ı䵱ǰ�ַ�����
		 */
		System.out.println("abcd123456efg".replaceAll("\\d", "����"));
		System.out.println("abcd123456efg".replaceAll("\\d+", "����"));
		System.out.println("abcd123456efg".replaceAll("\\d*", "�˽�"));
		System.out.println("abcd123456efg".replaceAll("\\d?", "�˽�"));
		
		/**
		 *  String[] split(String regex)  ʹ�ò���regex�ָǰ�ַ����������ַ������顣
		 */
		
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d+")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d*")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d?")));
		/*���н����
		abcd������������������������efg
		abcd����efg
		�˽�a�˽�b�˽�c�˽�d�˽�˽�e�˽�f�˽�g�˽�
		�˽�a�˽�b�˽�c�˽�d�˽�˽�˽�˽�˽�˽�˽�e�˽�f�˽�g�˽�
		
		
		[asdff, , ggh, gfh, jhs, hg]
		[asdff, ggh, gfh, jhs, hg]
		[a, s, d, f, f, , g, g, h, , g, f, h, , j, h, s, , h, g]
		[a, s, d, f, f, , , g, g, h, , g, f, h, , j, h, s, , h, g]
		*/
	}
	
	public static void  method3(){
		/**
		 * ģʽƥ����Ǽ�����ָ��ģʽ��ƥ����ַ�����
		 * ��java.util.regex���У������������࣬Pattern(ģʽ)��Matcher(ƥ����)��
		 * Pattern�����ʾ�������������ʽ��
		 * Matcher�������һ��ƥ������
		 * ʹ��Pattern���еľ�̬����compile( String regex)�ɽ�������ʽ�ַ��������Pattern����
		 * ʹ��Patternʵ����matcher(CharSequence input)�����ɻ��һ��Matcherʵ����
		 */
		String str = "verybody��s business is nobody��s business"+
				"There are four people named everybody, somebody, anybody and nobody. "+
				"There was an important job to be done and everybody was asked to do it."+
				" Everybody was sure that somebody would do it. Anybody could have done it,"+
				" but nobody did it. Some body got angry about that because it was everybody��s job. "+
				"Everybody thought anybody could do it, but nobody realized that everybody wouldn��t do it. "+
				"It ended up that everybody blamed somebody when nobody did what anybody could have done. "+
				"���ĸ��˷ֱ��������ÿ���ˡ�����ĳ���ˡ������κ��ˡ��͡�û���ˡ��� "+
				"��һ�Σ�����ÿ���˶�Ҫ��Ҫ��ȥ���һ����Ҫ�Ĺ����� "+
				"��Ҷ�����ĳ���˻�ȥ������¡���ʵ���κ��˶��������������ģ�������û����ȥ���� "+
				"ĳ���˶Դ˸е��ǳ����ߣ���Ϊ���Ǵ�ҵ�����ÿ���˶���Ϊ�κ��˿����������£���û������ʶ����Ҷ�����ȥ������¡� "+
				"����أ���û����ȥ����ʵ�κ��˶����������������ʱ��ÿ���˶��ڱ�Թĳ���ˡ�";
		Pattern pat1 = Pattern.compile("(\\S+)");//Pattern(ģʽ)----static compile(String regex) ��������һ��Pattern(ģʽ)����
		System.out.println(pat1.pattern());//Pattern��ķ��� ---String pattern()��������ģʽ�����е�������ʽ�ַ�����
		System.out.println(Pattern.matches(".*", str));//Pattern��ķ��� ---static boolean matches(String regex, CharSequence  input)�����ж�input�Ƿ��ܱ�regexƥ��
		Pattern pat2 = Pattern.compile("(\\s+)");
		System.out.println(Arrays.toString(pat2.split(str)));//Pattern��ķ��� ---String[] split(CharSequence input)������input����������ʽ����ָ���ַ������顣
		
		Matcher mat1 = pat1.matcher(str);//Matcher(ƥ����)----Matcher matcher(CharSequence input)��������һ��Matcher(ƥ����)����
		System.out.println(mat1.matches());//Matcher��ķ���---boolean matches()�������ж�input�Ƿ���ȫ��regexƥ�䡣
		System.out.println(mat1.lookingAt());//Matcher��ķ���---Boolean lookingAt()���������ַ����Ƿ���regexģʽ��ͷ��
		
		
		String str3 =mat1.replaceFirst("123");
		System.out.println(str3);
		
		
		//��¼��������ʽ���ֵ��Ӵ�����
		int i = 0;	
		//Matcher�����find()�����ɶ�Ŀ���ַ�������ƥ�������
		//Matcherʵ�����Զ�����״̬��ÿ�ε���find()��������ϴ�ƥ����Ӵ�����һ��λ�ÿ�ʼ������
		while(mat1.find()){//boolean find()     boolean find(int start) //�Ӳ���startָ��λ�ÿ�ʼ����regexƥ�䡣
			i++;
			System.out.printf("��ǰ�Ӵ�:%s��ʼ���±�:%d,�������±�:%d\n",mat1.group(0),mat1.start(),mat1.end());
//			System.out.println(mat1.group(0));
			//String group()���������ص�ǰƥ����Ӵ�����ʹ��group()����������Ϊ������ʽ����(),eg:"(\\S+)"     �м���()�����м�����
			//group(0)ȡ����������������ʽ�����ݣ�group(1)ȡ�����ϵ�һ���ڵ�������ʽ����Ӧ���ݣ�ֻ��һ����������������ʽ��������ʱ��������ͬ
			System.out.println(mat1.group(1));	
		}
		System.out.println("�Ӵ�������"+i);
		
		String str2 =mat1.replaceAll("asd");
		System.out.println(str2);//Matcher��ķ���---String replaceAll(String replacement) //��input����regexƥ����Ӵ�ȫ���滻Ϊ����replacement�õ����ַ�����
		
		
		
		
	}
	
}
