package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import properties.Application;


public class BudgetPage {
    WebDriver driver;

    By nextMonthButton = By.id("select_categories");
    By previousMonthButton = By.id("select_categories");

    //add BudgetPage item
    By plusButton = By.id("plusButton");
    By minusButton = By.id("minusButton");
    By selectCategories = By.id("select_categories");
    By selectTransactions = By.id("select_transactions");
    By budgetForm = By.id("budget_form");
    By messageLabel = By.id("lbl_message");


    //BudgetPage filters
    By filter_personalExpenses = By.linkText("Personal Expenses");
    By filter_loanPayDown = By.linkText("Loan Pay Down");
    By filter_investment = By.linkText("Investment");
    By filter_income = By.linkText("Income");
    By filter_businessExpenses = By.linkText("Business Expense");


    public BudgetPage(WebDriver driver) {
        this.driver = driver;
    }

    private void selectCategory(String strCategoryName) {
        try {
            Select drpCategory = new Select(driver.findElement(selectCategories));
            drpCategory.selectByVisibleText(strCategoryName);
        } catch (Exception ex) {
            Assert.fail(ex.getStackTrace()[0].getMethodName(), ex);
        }
    }

    private void selectTransaction(String strTransactionName) {
        try {
            Select drpCategory = new Select(driver.findElement(selectTransactions));
            drpCategory.selectByVisibleText(strTransactionName);
        } catch (Exception ex) {
            Assert.fail(ex.getStackTrace()[0].getMethodName(), ex);
        }
    }

    private void showBudgetForm() {
        try {
            driver.findElement(plusButton).click();
        } catch (Exception ex) {
            Assert.fail(ex.getStackTrace()[0].getMethodName(), ex);
        }
    }

    private void submitBudgetForm() {
        try {
            driver.findElement(budgetForm).submit();
        } catch (Exception ex) {
            Assert.fail(ex.getStackTrace()[0].getMethodName(), ex);
        }
    }


    public void addNewBudgetItem(String category, String transactionName) {
        try {
            this.showBudgetForm();
            this.selectCategory(category);
            this.selectTransaction(transactionName);
            this.submitBudgetForm();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(messageLabel), Application.msg_success_add_new_budget_item));
        } catch (Exception ex) {
            Assert.fail(ex.getStackTrace()[0].getMethodName(), ex);
        }

    }


}
