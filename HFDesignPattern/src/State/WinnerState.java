package State;

public class WinnerState implements State {
	GumballMachine gumballMachine;
	 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("알맹이를 내보내고 있습니다.");
	}
 
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}
 
	public void turnCrank() {
		System.out.println("손잡이는 한번만 돌려주세요.");
	}
	
	public void refill() { }
	 
	public String toString() {
		return "dispensing a gumball";
	}
	
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("더이상 알맹이가 없습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}
