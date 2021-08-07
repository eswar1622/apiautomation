package resources;

import pojo.UpdateUser;

public class RequestPayload {
	
	public UpdateUser updateUser() {
		
		UpdateUser update = new UpdateUser();
		update.setName("Eswar");
		update.setJob("Quality Assurance Engineer");
		
		return update;
		
	}

}
