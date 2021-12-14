package online.wubianhu.myjavanotes.studynotes.interface_;

public class OracleDB implements DBinterface{
    @Override
    public void connect() {
        System.out.println("链接oracle数据库");
    }

    @Override
    public void close() {
        System.out.println("断开oracle数据库");
    }
}
