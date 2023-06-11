package ChongZai;

public class ChongZai {
    //以下为方法的重载，同是max()函数，但是返回类型不一样的max()的函数实现的功能也不一样
    int max(int a, int b) {
        if (a>b) {
            return a;
        }
        else
        {
            return b;
        }
    }

    double max(double a, double b) {
        if (a>b) {
            return a;
        }
        else
        {
            return b;
        }
    }

}
