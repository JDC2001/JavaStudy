/*
	��ϰ2�����è��������Ϊ�̳еİ汾���Լ��������Լ����ԡ��Ȼὲ

	è��
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��catchMouse()
	����
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��lookDoor()

	���
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()

	è�����췽�����޲Σ�����
		catchMouse()
	�������췽�����޲Σ�����
		lookDoor()

	�����ࣺ
		main(String[] args):
*/
class Animal {
	private String name = "è";
	private int age;

	public Animal() {}

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name+"---"+age);
	}
}

class Cat01 extends Animal {
	public Cat01() {}

	public Cat01(String name,int age) {
		super(name,age);//�̳и����name��age
	}

	public void catchMouse() {
		System.out.println("è׽����");
	}
}

class Dog01 extends Animal {
	public Dog01() {}

	public Dog01(String name,int age) {
		super(name,age);
	}

	public void lookDoor() {
		System.out.println("�����Կ���");
	}
}

class AnimalDemo {
	public static void main(String[] args) {
		//è�����
		Cat01 c = new Cat01();
		c.setName("�ӷ�è");
		c.setAge(3);
		c.show();
		c.catchMouse();
		System.out.println("------------");
		Cat01 cc = new Cat01("tomè",6);
		cc.show();
		cc.catchMouse();
		System.out.println("------------");

		Dog01 d = new Dog01();
		d.setName("Х��");
		d.setAge(5);
		d.show();
		d.lookDoor();
		System.out.println("------------");

		Dog01 dd = new Dog01("����",8);
		dd.show();
		dd.lookDoor();
	}
}