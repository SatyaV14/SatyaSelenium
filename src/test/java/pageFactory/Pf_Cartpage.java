package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibraries.CommonActions;

public class Pf_Cartpage extends CommonActions{

	@FindBy(xpath="//cite[@class='mid']/span[2]")
	public WebElement lbl_book;
	
	@FindBy(id="frmCart")
	public WebElement frm_cart;
	
	@FindBy(xpath="//cite[@class='first']/input")
	public WebElement txt_qty;
	
	@FindBy(xpath="//*[@id='currentcartdiv']/div[3]/form/div/ul[1]/li[2]/cite[6]")
	public WebElement lbl_unitprice;
	////*[@id='currentcartdiv']/div[3]/form/div/ul[1]/li[2]/cite[6]
	//cite[@class='first']/../cite[6]
	
	@FindBy(xpath="//div[@class='netamttxt']/span")
	public WebElement lbl_netamt;
	
	@FindBy(xpath="//cite[@class='first']/div")
	public WebElement btn_remove;
	
	
	public Pf_Cartpage(WebDriver driver){		
		PageFactory.initElements(driver, this);		
	}
	
	public String Pf_CalAmt(String qty){
		txt_qty.clear();
		caEnterValue(txt_qty, qty);
//		double Amt=Integer.parseInt(qty)*Integer.parseInt(price);
		String up=caGetOuptut(lbl_unitprice).trim().replace("Rs. ", "");
		double Amt=Double.parseDouble(qty)*Double.parseDouble(up); 
		return String.valueOf(Amt).replace(".0", "");
		
	}
	
}
