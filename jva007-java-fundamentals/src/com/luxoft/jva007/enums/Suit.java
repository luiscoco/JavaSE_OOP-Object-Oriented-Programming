package com.luxoft.jva007.enums;

public enum Suit {
	DIAMOND(true), HEART(true), CLUB(false), SPADE(false);

	private boolean red;

	Suit(boolean b) {
		red = b;
	}

	public boolean isRed() {
		return red;
	}

	public String toString() {
		String s = name();
		s += red ? ":red" : ":black";
		return s;
	}
}
