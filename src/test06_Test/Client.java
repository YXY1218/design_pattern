package test06_Test;

import test06_Bridge.*;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        //报表1显示内容
        FormShowTextData showText1 = new FormShowTextData(new FormShow1());
        showText1.showForm();

        FormShowDBData showDB1 = new FormShowDBData(new FormShow1());
        showDB1.showForm();

        FormShowExcelData showExcel1 = new FormShowExcelData(new FormShow1());
        showExcel1.showForm();

        //报表2显示内容
        FormShowTextData showText2 = new FormShowTextData(new FormShow2());
        showText2.showForm();

        FormShowDBData showDB2 = new FormShowDBData(new FormShow2());
        showDB2.showForm();

        FormShowExcelData showExcel2 = new FormShowExcelData(new FormShow2());
        showExcel2.showForm();
    }
}