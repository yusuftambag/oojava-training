package yte.summerp.oopjava.observer;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
	private Map<String,SiteUser> userMap=new HashMap<String, SiteUser>();

	public SiteUser getUserByName(String userName) {
		SiteUser siteUser=userMap.get(userName);
		if(siteUser==null) {
			siteUser=new SiteUser(userName);
			userMap.put(userName,siteUser);
		}
		return siteUser;
	}
}
