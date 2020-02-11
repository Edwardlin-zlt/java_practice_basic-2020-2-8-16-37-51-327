import javafx.beans.binding.When;

public class Application {
    public static void main(String[] args) {

        Software intellijIdea = new IntellijIdea();
        Software chrome = new Chrome();
        Software wechat = new Wechat();

        intellijIdea.pressF5();
        chrome.pressF5();
        wechat.pressF5();
    }
}
