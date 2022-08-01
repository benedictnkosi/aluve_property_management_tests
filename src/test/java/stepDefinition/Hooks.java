package stepDefinition;

import cucumber.TestContext;
import org.junit.Before;

public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void BeforeSteps() {

    }

//    @After
//    public void AfterSteps() {
//        testContext.getWebDriverManager().closeDriver();
//    }

}
