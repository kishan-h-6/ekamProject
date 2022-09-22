package ekam.example.web;

import com.testvagrant.ekam.atoms.web.WebPage;
import com.testvagrant.ekam.reports.annotations.WebStep;
import org.openqa.selenium.By;

public class GoogleHomePage extends WebPage {
    private By searchBox = queryByName("q");
    private By searchButton = query("input[value='Google Search']");

    @WebStep(keyword = "When", description = "I do google search")
    public GoogleHomePage search(String text) {

        textbox(searchBox).setText(text);
        element(searchButton).click();
        return this;
    }
}
