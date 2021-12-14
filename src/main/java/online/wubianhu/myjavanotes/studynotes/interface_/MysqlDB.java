package online.wubianhu.myjavanotes.studynotes.interface_;

public class MysqlDB implements DBinterface{
    @Override
    public void connect() {
        System.out.println("链接mysql数据库");
    }

    @Override
    public void close() {
        System.out.println("断开mysql数据库");
    }
}
