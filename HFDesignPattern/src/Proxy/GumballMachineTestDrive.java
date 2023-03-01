package Proxy;

import java.rmi.*;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		String[] location = {"rmi//santafe.mightygumball.com/gumballmachine",
							 "rmi://boulder.mightgumball.com/gumballmachine",
							 "rmi://austin.mightgumball.com/gumballmachine"};
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for(int i = 0; i < location.length; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
