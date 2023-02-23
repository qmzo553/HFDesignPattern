package RemoteTest;

public class TvOnCommand implements Command {
	Tv tv;

	public TvOnCommand(Tv tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
