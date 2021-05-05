package test06_Adapter;

public class CollectExcelImpl implements CollectExcel {

    public String collect(String s) {
        return "这是Excel文件收集方式";
    }
}