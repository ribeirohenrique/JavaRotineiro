package database;

public class DatabaseTest {
    public static void main(String[] args) {
        TestConnection m1 = new TestConnection();
        CreateTable c1 = new CreateTable();

        m1.testConnection("exampledb");
        c1.createNewTable("exampledb");

    }
}
