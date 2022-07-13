package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;
import utils.ConfigFileReader;

public class TestContext {
    private final WebDriverManager webDriverManager;
    private final PageObjectManager pageObjectManager;
    private final ConfigFileReader configFileReader;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        configFileReader = new ConfigFileReader();
    }

    public ConfigFileReader getConfigFileReader() {
        return configFileReader;
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
