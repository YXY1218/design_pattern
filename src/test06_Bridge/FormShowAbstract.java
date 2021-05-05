package test06_Bridge;

public abstract class FormShowAbstract {
    private FormShow formShow;

    public FormShowAbstract(FormShow formShow) {
        this.formShow = formShow;
    }

    public void showForm(String s) {
        formShow.show(s);
    }
}