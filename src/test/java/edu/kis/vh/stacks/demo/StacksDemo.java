package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

class StacksDemo {

	public static void main(String[] args) {
		testStack(new DefaultStacksFactory());
		testStackArray(new StackArrayFactory());
		testStackList(new StackListFactory());
	}

	private static void testStack(DefaultStacksFactory defaultStacksFactory) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void testStackArray(StackArrayFactory stackArrayFactory) {
		StackArrayFactory factory = new StackArrayFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void testStackList(StackListFactory stackListFactory) {
		StackListFactory factory = new StackListFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}
}
/*
Linia 15: dodanie klamer otwierających i zamykających dla zwiekszenia czytelnosci co dokladnie
           nalezy do ktorej petli for
Linia 19-27: przesuniecie tabulacji o jeden w lewo
Linia 22: dodanie klamer dla petli for
Linia 27: dodanie klamer dla petli while
Linia 33: przeniesienie calego wypisania do jednej linii
*/

/*
kombinacja ta (w środowisku IntelliJ alt + ->) przechodzi pomiedzy otwartymi oknami w edytorze

Fabryki łamią zasadęizolacji
*/
