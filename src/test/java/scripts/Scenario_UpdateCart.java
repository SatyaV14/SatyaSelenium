package scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageFactory.Pf_Cartpage;

public class Scenario_UpdateCart extends Scenario_Cart{
	
	@Test(dataProvider="Dpglobal",dataProviderClass=dataProvider.Dp_RediffProj.class)
	public void updateBook (Map<String,String> hm) throws Exception{
		
		Log = Logger.getLogger(Scenario_Cart.class);		
		startTest = eReports.startTest(hm.get("TC_ID") + "_" + hm.get("Order"));
//	create Page factor object for every class
		
		Pf_Cartpage cart = new Pf_Cartpage(ff); 
		
		ff.switchTo().frame(cart.frm_cart);
		cart.txt_qty.clear();
		String s=cart.Pf_CalAmt(hm.get("Qty").replace(".0", ""));
		cvEquals(cart.lbl_netamt.getText().replace(",", ""), s, "Validating Net Amount ", cart.lbl_netamt);
		
		
	}
	
	

}
