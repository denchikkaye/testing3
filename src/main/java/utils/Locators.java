package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//div[@class='flex items-center justify-center'][contains(text(),'Хостинг')])[1]");
        By BUTTON2 = By.xpath("(//span[@class='title text-brown transition-200 font-medium'])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//div[@class='font-bold text-2xl tablet:text-4xl mb-8 text-center leading-120 flex grid-flow-col items-center justify-center'])[1]");
    }

}
