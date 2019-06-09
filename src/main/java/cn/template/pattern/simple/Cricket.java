package cn.template.pattern.simple;

public class Cricket extends Game {

	@Override
	void initialize() {

		System.out.println("Football Game Initialized! Start Playing");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished");
	}

}
