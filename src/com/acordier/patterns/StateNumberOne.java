package com.acordier.patterns;

public class StateNumberOne extends State {

	private static StateNumberOne INSTANCE = new StateNumberOne();

	private StateNumberOne() {
	}

	@Override
	public void goNext(Context context) {
		context.setCurrentState(StateNumberTwo.getInstance());
		showTransition(context);
	}

	@Override
	public void goPrev(Context context) {
		context.setCurrentState(StateNumberThree.getInstance());
		showTransition(context);
	}

	public static StateNumberOne getInstance() {
		if(INSTANCE == null){
			synchronized (StateNumberOne.class) {
				INSTANCE = new StateNumberOne();
			}
		}
		return INSTANCE;
	}

}
