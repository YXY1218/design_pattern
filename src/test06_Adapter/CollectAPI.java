package test06_Adapter;

public class CollectAPI implements CollectText {
    private CollectDB collectDB;
    private CollectText collectText;
    private CollectExcel collectExcel;

    //根据不同的类型创建不同的收集方式
    public CollectAPI(String type) {
        if (type.equalsIgnoreCase("db")) {
            this.collectDB = new CollectDBImpl();
        } else if (type.equalsIgnoreCase("text")) {
            this.collectText = new CollectTextImpl();
        } else {
            this.collectExcel = new CollectExcelImpl();
        }

    }

    //根据不同数据收集方式没获取不同数据源的数据
    public String collect(String type) {
        //判断是否是数据库方式收集数据
        if (type.equalsIgnoreCase("db")) {
            return collectDB.collect(type);
        } else if (type.equalsIgnoreCase("text")) {
            return collectText.collect(type);
        } else {
            return collectExcel.collect(type);
        }
    }
}