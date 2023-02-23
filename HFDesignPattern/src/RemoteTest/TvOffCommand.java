package RemoteTest;

public class TvOffCommand implements Command {
	Tv tv;

	public TvOffCommand(Tv tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
