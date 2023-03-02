package Combining.Duck;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createRubberDuck();
		Quackable rubberDuck = duckFactory.createDuckCall();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");
		
		Flock flockOfDucks = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(mallardThree);
		flockOfDucks.add(mallardFour);
		
		Flock flockOfMallards = new Flock();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
		simulate(flockOfDucks);
		
		System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
		simulate(flockOfMallards);
		
		System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + "  번");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
