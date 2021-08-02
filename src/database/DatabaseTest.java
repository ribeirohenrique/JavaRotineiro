package database;

public class DatabaseTest {
    public static void main(String[] args) {
        TestConnection m1 = new TestConnection();
        CreateTable c1 = new CreateTable();

        c1.createNewDatabase();
        //c1.createNewTable("Testando");
        m1.testConnection(c1.getDatabasename());

    }
}
