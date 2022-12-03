package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.InterFace.InterFaceTest;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/3 15:26
 *
 */


public class InterFaceTest {
    //  简单实现接口，测试学习程度

    public static void main(String[] args) {
        MysqlConnector mysqlConnector = new MysqlConnector();
        OracleConnector oracleConnector = new OracleConnector();
        InterFaceTest interFaceTest = new InterFaceTest();
        interFaceTest.test(mysqlConnector);
        interFaceTest.test(oracleConnector);
    }
    public void test(DatabaseInterFace databaseInterFace)
    {
        databaseInterFace.connect();
        databaseInterFace.close();
    }
}

class MysqlConnector implements DatabaseInterFace {

    @Override
    public void connect() {
        System.out.println("Mysql连接成功...");
    }

    @Override
    public void close() {
        System.out.println("Mysql连接断开...");
    }
}

class OracleConnector implements DatabaseInterFace {

    @Override
    public void connect() {
        System.out.println("Oracle连接成功...");
    }

    @Override
    public void close() {
        System.out.println("Oracle连接断开...");
    }
}