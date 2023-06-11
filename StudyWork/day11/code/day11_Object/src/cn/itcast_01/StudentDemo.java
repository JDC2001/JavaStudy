package cn.itcast_01;

/*
 * Object:�����νṹ�ĸ��࣬�����඼ֱ�ӻ��߼�ӵļ̳��Ը��ࡣ
 * 
 * Object��ķ�����
 * public int hashCode():���ظö���Ĺ�ϣ��ֵ��
 * 		��ϣֵ����ʵ�ʵĵ�ֵַ��һ�����ǰ������Ϊ��ֵַ����Ϊ���Ǹ��ݵ�ֵַ���������һ��ֵ��
 * 		������401��401
 * public final Class<?> getClass():���ش� Object ������ʱ�ࡣ
 * 		public String getName():���ظö����Ӧ����/������/�ӿڵ����ơ�
 * public String toString():���ظö�����ַ�����ʾ��
 * 		getClass().getName() + '@' + Integer.toHexString(hashCode())
 * 
 * 		Integer
 * 			public static String toHexString(int i):����һ��������ʮ�����Ƶ��ַ�����ʾ��ʽ
 * 
 * 		���������û���κ�����ģ�������д�˷�����
 * 			A:�Լ��ֶ�д������Ч�����ÿ������Բ��Լ�д��
 * 			B:�Զ����ɣ�Ч�����У��Ƽ���ʽ��
 * 呵呵如果发v 我 我乙 uiji
 * public boolean equals(Object obj)
 * protected void finalize()
 * protected Object clone()
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode()); // 2100664515
		Student s2 = new Student();
		System.out.println(s2.hashCode()); // 1237346925
		System.out.println("------------");

		Student s3 = new Student();
		Class c = s3.getClass();
		String name = c.getName();
		System.out.println(name); // cn.itcast_01.Student
		System.out.println("------------");

		Student s4 = new Student();
		// �����ֱ�����һ����������ƣ���ʵ������Ǹö�����õ�toString()��������ַ���
		System.out.println(s4); // cn.itcast_01.Student@79f1d448
		// System.out.println(s4.toString()); // cn.itcast_01.Student@79f1d448

		// cn.itcast_01.Student@79f1d448
		// String s = s4.getClass().getName() +"@"+
		// Integer.toHexString(s4.hashCode());
		// System.out.println(s);
		
		Student s5 = new Student("但还是v",28);
		System.out.println(s5);
	}
}
