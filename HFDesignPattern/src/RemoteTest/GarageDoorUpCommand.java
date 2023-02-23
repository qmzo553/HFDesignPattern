package RemoteTest;

public class GarageDoorUpCommand {

	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
	
	public void undo() {
		garageDoor.stop();
	}
}
