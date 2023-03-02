import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Homework4 {
    @Test
    public void Homework4(){
        open("https://alta.ge/");
        $("#quick_search").shouldBe(Condition.visible).click();
        ElementsCollection collection = $$(byClassName("grid-list"));
        int count = collection.size();
        for(int i=0; i<count; i++);
        System.out.println(count);
    }
}
