package Tests;

import Interfaces.EVE1;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements EVE1 {
    private static final String baseUrl ="https://demoqa.com/";
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
}
