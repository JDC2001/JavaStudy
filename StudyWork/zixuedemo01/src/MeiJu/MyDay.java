package MeiJu;

/**
 * @���ߣ���س�
 * @ʱ�䣺2023.4.24
 * @��Ŀ��ö�ٵ�ʵ��
 */

//Java�е�ö�٣�Enumeration����һ��������࣬���ڶ���һ���̶��ļ��ϣ�����ÿ��Ԫ�ض���������Ψһ�ġ�
// ö�ٳ�����������һЩ�̶���״̬��ѡ���ֵ��
public class MyDay {
    enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
    public void DayEvent() {
        DayOfWeek today = DayOfWeek.TUESDAY;
        //ѡ����TUESDAY���ö��ֵ��������switch-case�����в���

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }
    }

}

class  Test {
    public static void main(String[] args) {
    MyDay day = new MyDay();
    day.DayEvent();
    }

}









