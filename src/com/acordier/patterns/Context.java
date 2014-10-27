package com.acordier.patterns;

public class Context {

	private State current;

	public State getCurrentState() {
		return current;
	}

	public void setCurrentState(State state) {
		this.current = state;
	}

	public void goNext() {
		current.goNext(this);
	}

	public void goPrev() {
		current.goPrev(this);
	}

}
