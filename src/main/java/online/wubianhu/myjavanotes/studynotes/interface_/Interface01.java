package online.wubianhu.myjavanotes.studynotes.interface_;

public class Interface01 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);

    }

    public static void t(DBinterface dBinterface) {
        dBinterface.connect();
        dBinterface.close();
    }
}



