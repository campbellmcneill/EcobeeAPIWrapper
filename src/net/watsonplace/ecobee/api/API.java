package net.watsonplace.ecobee.api;

import java.util.Set;

public interface API {
	
	public Set<Thermostat> getThermostats() throws Exception;
	
	public void setHold(int desiredHeatTemp, int desiredColdTemp, int holdHours) throws Exception;
	
}
