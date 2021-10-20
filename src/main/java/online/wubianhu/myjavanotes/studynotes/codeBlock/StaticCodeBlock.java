package online.wubianhu.myjavanotes.studynotes.codeBlock;

public class StaticCodeBlock {
    public static void main(String[] args) {
//        new AA();
//
//        System.out.println(CC.n1);
        new DD();
        new DD();

    }
}


class AA extends BB{
    static {
        System.out.println("AA的静态代码块执行");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块执行");
    }
}

class CC{

    public static int n1 = 99;
    static {
        System.out.println("CC的静态代码块执行");
    }
}

class DD{

    {
        System.out.println("DD的普通代码块执行");
    }
    static {
        System.out.println("DD的静态代码块执行");
    }

}
