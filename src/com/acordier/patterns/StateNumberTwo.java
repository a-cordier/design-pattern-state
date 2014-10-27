package com.acordier.patterns;

public final class StateNumberTwo extends State {

	private static StateNumberTwo INSTANCE = new StateNumberTwo();

	private StateNumberTwo() {
	}

	@Override
	public void goNext(Context context) {
		context.setCurrentState(StateNumberThree.getInstance());
		showTransition(context);
	}

	@Override
	public void goPrev(Context context) {
		context.setCurrentState(StateNumberOne.getInstance());
		showTransition(context);
	}
	
	public static StateNumberTwo getInstance() {
		if(INSTANCE == null){
			synchronized (StateNumberTwo.class) {
				INSTANCE = new StateNumberTwo();
			}
		}
		return INSTANCE;
	}

}
