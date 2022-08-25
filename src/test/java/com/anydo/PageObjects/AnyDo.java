package com.anydo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnyDo {
	
	WebDriver ldriver;
	
	public AnyDo(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement btnSelect;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement txtPassword;


	@FindBy(id="loginbutton")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/button[1]/span[2]")
	
	@CacheLookup
	WebElement crttask1;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	WebElement crttask2;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	WebElement crtnote;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/button[4]")
	@CacheLookup
	WebElement crtrmndr;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/button[4]")
	@CacheLookup
	WebElement crttask3;
	
	@FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/article[1]/button[1]")
	@CacheLookup
	WebElement crtsubtask;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/button[2]/svg[1]/g[1]/g[1]/path[1]")
	@CacheLookup
	WebElement createList;
	
	@FindBy(id="app-sidebar-modal-19")
	@CacheLookup
	WebElement NameList;
	
	
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/footer[1]/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement CreateList;
	
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[3]/div[2]/ul[1]/li[5]/a[1]")
	@CacheLookup
	WebElement AddItem;
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[3]/div[1]/section[1]/article[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement ItemName;
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[3]/div[1]/section[1]/article[1]/form[1]/div[1]/button[1]")
	@CacheLookup
	WebElement EnterItem;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement clicksettings;
	
	@FindBy(xpath="//div[contains(text(),'Theme')]")
	@CacheLookup
	WebElement Theme;
	
	@FindBy(xpath="//body/div[7]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]")
	@CacheLookup
	WebElement Light;
	
	@FindBy(xpath="//header/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement notifications;
	
	@FindBy(xpath="//span[contains(text(),'Updates')]")
	@CacheLookup
	WebElement update;
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[3]")
	@CacheLookup
	WebElement AddSelection;
	
	@FindBy(xpath="//button[contains(text(),'Multiple selection (B)')]")
	@CacheLookup
	WebElement MultipleSelection;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[4]/div[1]/div[2]/button[2]/svg[1]/g[1]/g[1]/path[1]")
	@CacheLookup
    WebElement selecttag;
	
	@FindBy(xpath="//button[contains(text(),'No, thanks')]")
	@CacheLookup
	WebElement nothanks;
	
	@FindBy(xpath="//body/div[7]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement myprofile;
	
	@FindBy(xpath="//body/div[6]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/button[3]")
	@CacheLookup
	WebElement signout;
	
	
	public void clickSubmit1()
	{
		btnSelect.click();
	}
	public void setUserName(String uname)       //Action method
	{
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}


	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickcreatetask()
	{
		crttask1.click();
	}
	
	public void clickIwantTo(String tskname)
	{
		crttask2.sendKeys(tskname);
	}
	public void clicknotes(String ntname)
	{
		crtnote.sendKeys(ntname);
	}
	public void clickReminder()
	{
		crtrmndr.click();
	}
	public void clickaddtask()
	{
		crttask3.click();
	}
	
	public void clickaddsubtask(String subtskname)
	{
		crtsubtask.sendKeys(subtskname);
	}
	
	public void clickplusbutton()
	{
		createList.click();
	}
	
	public void NameList(String listname)
	{
		crtsubtask.sendKeys(listname);
	}
	
	public void ClickCreate()
	{
		CreateList.click();
	}
	
	public void clickonList()
	{
		AddItem.click();
	}
	
	public void NameItem(String item1)
	{
		ItemName.sendKeys(item1);
	}
	
	public void EnterItem()
	{
		EnterItem.click();
	}
	
	public void Settings()
	{
		clicksettings.click();
	}
	
	public void ClickTheme()
	{
		Theme.click();
	}
	
	public void ChoseTheme()
	{
		Light.click();;
	}
	
	public void ClickNotifications()
	{
		notifications.click();
	}
	
	public void ClickUpdate()
	{
		update.click();;
	}
	
	
	public void AddSelection()
	{
		AddSelection.click();
	}
	
	public void MultipleSelection()
	{
		MultipleSelection.click();;
	}
	
	
	public void ClickTag()
	{
		selecttag.click();;
	}
	public void ClickNoThanks()
	{
		nothanks.click();
	}
	
	public void ClickMyProfile()
	{
		myprofile.click();;
	}
	public void ClickSignOut()
	{
		signout.click();
	}
	
	

}
