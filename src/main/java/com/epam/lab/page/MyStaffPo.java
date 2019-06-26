package com.epam.lab.page;

import com.epam.lab.core.pageElement.PageElement;
import com.epam.lab.core.util.LogMessage;
import org.openqa.selenium.support.FindBy;

public class MyStaffPo extends AbstractPage {

    @LogMessage("projectDrums2")
    @FindBy(xpath = "//a[contains(text(),'Drums2')]")
    private PageElement drums2Button;
//    @LogMessage("logout")
//    @FindBy(css = "ul.dropdown.production.open>li:nth-child(4)>a>span")
//    private PageElement logout;
//    @LogMessage("myStuff")
//    @FindBy(css = "ul.dropdown.production.open>li:nth-child(2)>a>span")
//    private PageElement myStuff;
//    @LogMessage("profileButton")
//    @FindBy(css = "span.profile-name")
//    private PageElement profileButton;

    public PageElement getDrums2() {
        return drums2Button;
    }

//    public PageElement getLogout() {
//        return logout;
//    }
//    
//    public PageElement getMyStuff() {
//        return myStuff;
//    }
//    
//    public PageElement getProfileButton() {
//        return profileButton;
//    }

}
