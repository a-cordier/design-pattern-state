package com.acordier.patterns;

public class StateApp {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurrentState(StateNumberOne.getInstance());
		context.getCurrentState().goNext(context);
		context.getCurrentState().goNext(context);
		context.getCurrentState().goNext(context);
		context.getCurrentState().goPrev(context);
		context.getCurrentState().goPrev(context);
		context.getCurrentState().goPrev(context);
	}
}
