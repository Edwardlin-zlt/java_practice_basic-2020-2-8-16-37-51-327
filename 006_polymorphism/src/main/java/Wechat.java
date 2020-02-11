public class Wechat extends Software{
    public Wechat() {
    }

    @Override
    public void pressF5() {
        super.pressF5();
        System.out.println("弹出英文输入框");
    }
}
