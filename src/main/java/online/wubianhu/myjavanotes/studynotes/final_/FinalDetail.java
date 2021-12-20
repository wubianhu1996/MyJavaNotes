package online.wubianhu.myjavanotes.studynotes.final_;


//inal和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理。
public class FinalDetail {

    public static void main(String[] args) {
        System.out.println(AA.aa);
    }
}

class AA{
    public static final int aa = 10;
    static {
        System.out.println("调用到了AA的静态代码块");
    }
}
