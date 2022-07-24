import java.util.HashMap;

public class IDandPasswords {

	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Aakamsh", "aaku");
		logininfo.put("Cat", "meow");
		logininfo.put("Brocode","Bro123");
		

	
	}
	
	
	 protected HashMap getLoginInfo(){
		return logininfo;
	}
	
	
	
	
	
}
