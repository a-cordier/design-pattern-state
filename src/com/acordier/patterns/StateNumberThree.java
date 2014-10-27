package com.acordier.patterns;

public final class StateNumberThree extends State {

	private static StateNumberThree INSTANCE;

	private StateNumberThree() {
	}

	@Override
	public void goNext(Context context) {
		context.setCurrentState(StateNumberOne.getInstance());
		showTransition(context);
	}

	@Override
	public void goPrev(Context context) {
		context.setCurrentState(StateNumberTwo.getInstance());
		showTransition(context);
	}

	public static StateNumberThree getInstance() {
		if(INSTANCE == null){
			synchronized (StateNumberThree.class) {
				INSTANCE = new StateNumberThree();
			}
		}
		return INSTANCE;
	}

}
