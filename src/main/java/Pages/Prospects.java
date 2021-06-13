package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prospects {
    private WebDriver driver;

    public Prospects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@data-test='aside-create-folder']")
    private WebElement createFolderButton;

    @FindBy(xpath = "//button[@data-test='aside-create-new-lists']")
    private WebElement createNewList;

    @FindBy(xpath = "//span[@class='name']")
    private WebElement myListsDropDown;
    //import
    @FindBy(xpath = "//div[@data-test='add-human']")
    private WebElement createOrImportButton;

    @FindBy(xpath = "//ul[@data-test='add-human-list']//li[1]")
    private WebElement importFromFileButton;

    @FindBy(xpath = "//ul[@data-test='add-human-list']//li[2]")
    private WebElement createManuallyButton;

    @FindBy(xpath = "//div[@data-test='add-custom-fields']")
    private WebElement customFieldButton;

    @FindBy(xpath = "//div[@data-test='export-prospects-button']")
    private WebElement exportButton;

    @FindBy(xpath = "//div[@data-test='filter-duplicates']")
    private WebElement dublicateButton;

    @FindBy(xpath = "//div[text()='Lists']")
    private WebElement listsText;


    public String checkProspectPage() {

        String prospectPageText = listsText.getText();
        return prospectPageText;
    }

    public void importFormFile( ) {
        createOrImportButton.click();
        importFromFileButton.click();

    }
}
