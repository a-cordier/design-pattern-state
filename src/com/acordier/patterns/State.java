package com.acordier.patterns;

public abstract class State {
	public abstract void goNext(Context context);
	public abstract void goPrev(Context context);
	
	public void showTransition(Context context){
		System.out.printf("Transition: %s -> %s\n", this.getClass().getSimpleName(), context.getCurrentState().getClass().getSimpleName());
	}
}
