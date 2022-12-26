import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;




public class DragNDrop{
    @Test
    void dragAndDropTest(){
        open("https://the-internet.herokuapp.com");
        $("#content").$$("a").findBy(text("Drag and Drop")).click();
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));

    }
    @Test
    void gitHubInterprais(){
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("Build like the best")).shouldHave(visible);


    }
}