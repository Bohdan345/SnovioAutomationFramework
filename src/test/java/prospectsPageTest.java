import Pages.LoginPage;
import Pages.Prospects;
import org.testng.annotations.Test;
import Сore.Driver.InitDriver;

public class prospectsPageTest {

    InitDriver driver = InitDriver.getInstance();
    Prospects prospectsPage = new Prospects(driver.getDriver());

    /**
     * FOLDER TESTS
     * -createFolder - создаёт папку
     * -deleteFolder -  удаляет папку
     * -deleteFolderWithCampaign - удаляет папаку  на которой идёт рассылка. Отображать нужное сообщение
     * -editFolder -  переименование папки
     * -moveListToFolder -  добавление листов в папку
     * -moveListToRootFolder - возвращение листов в корневую папку
     * -deleteFolderWithLastList - удалять папку , вернуть  последний созданый лист в папку , отобразить правильное сообщение
     */


    @Test
    public void createFolder() {


    }

    @Test

    public void deleteFolder() {

    }

    @Test
    public void deleteFolderWithCampaign() {

    }


    @Test
    public void editFolder() {

    }

    @Test
    public void moveListToFolder() {

    }

    @Test
    public void moveListToRootFolder() {

    }

    @Test
    public void deleteFolderWithLastList() {

    }


    /**
     *            TRASH TESTS
     *
     *
     */

    @Test
    public void checkTrashTip(){

    }



}
