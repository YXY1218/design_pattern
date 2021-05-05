package test06_Adapter;

public class CollectDBImpl implements CollectDB {

    public String collect(String s) {
        return "这是数据库文件收集方式";
    }
}