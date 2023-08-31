import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Rohit","Yadav");
		logininfo.put("ram","seeta");
		logininfo.put("rohit","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
//for checking the git 
