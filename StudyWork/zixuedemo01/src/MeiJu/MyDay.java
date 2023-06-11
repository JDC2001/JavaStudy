package MeiJu;

/**
 * @作者：金敦超
 * @时间：2023.4.24
 * @项目：枚举的实例
 */

//Java中的枚举（Enumeration）是一种特殊的类，用于定义一个固定的集合，其中每个元素都是有限且唯一的。
// 枚举常常用来代表一些固定的状态、选项或值。
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
        //选择了TUESDAY这个枚举值，下面用switch-case语句进行查找

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









