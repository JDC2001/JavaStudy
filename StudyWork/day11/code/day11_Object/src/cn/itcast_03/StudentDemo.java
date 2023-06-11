package cn.itcast_03;

/*
 * protected Object clone()
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("林青霞", 28);

		Object obj = s1.clone();
		Student s2 = (Student) obj;

		System.out.println(s1.getName() + "---" + s1.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		Student s3 = s1;
		System.out.println(s3.getName() + "---" + s3.getAge());
		System.out.println("--------------------------------");

		s1.setName("张曼玉");

		System.out.println(s1.getName() + "---" + s1.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println(s3.getName() + "---" + s3.getAge());
	}
}
class Test {
	public static void main(String[] args) {
		System.out.println("这还是");
	}
}