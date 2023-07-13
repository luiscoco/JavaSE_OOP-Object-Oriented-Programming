package com.luxoft.jva007.enums;

public class Main {

	private static Suit suit = Suit.CLUB;

	public static void main(String[] args) {
		for (Suit suit : Suit.values()) {
			System.out.println(suit);
		}

		switch (suit) {
			case CLUB:
				System.out.println(suit);
			break;
			case DIAMOND:
				System.out.println("DIAMOND");
			break;
			default:
				System.out.println("Other");
			break;	
		}
	}

}
