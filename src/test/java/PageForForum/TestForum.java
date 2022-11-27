package PageForForum;

import PageForForum.ForumBasePage;
import PageForForum.ForumHomePage;
import org.junit.jupiter.api.Test;

public class TestForum {

    ForumBasePage forumBasePage = new ForumBasePage();
    ForumHomePage forumHomePage = new ForumHomePage();
    ForumLoginPage forumLoginPage = new ForumLoginPage();
    ForumProfilePage forumProfilePage = new ForumProfilePage();

    @Test
    public void forumTest1() {
        forumBasePage.openChrome("https://www.forumcinemas.lv/rus");
        forumHomePage.openLoginPage();
        forumLoginPage.enterLoginName("anjutaxxx@mail.ru");
        forumLoginPage.enterPassword("Svetozka1");
        forumLoginPage.loginSubmit();
        forumHomePage.openProfilePage();
        forumProfilePage.clickChangeMyData();
        forumProfilePage.inputNames("Anna", "Ostaptsuk");
        forumProfilePage.inputCity("Tartu");
        forumProfilePage.pressApstiprinatButton();
        forumBasePage.closeChrome();
    }
}

