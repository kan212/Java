package com.thinking.java.nine;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RoundomWords implements Readable {

	private static Random rand = new Random(47);
	private static final char[] captitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			.toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz"
			.toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;

	public RoundomWords() {

	}

	public RoundomWords(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1;
		}
		cb.append(captitals[rand.nextInt(captitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(lowers[rand.nextInt(lowers.length)]);
			cb.append(vowels[rand.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 10;
	}

	public double next() {
		return rand.nextDouble();
	}

	public interface RandValues {
		Random random = new Random(47);
		int RANDOM_INT = random.nextInt(7);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new RoundomWords(8));
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		for (int i = 0; i < 7; i++) {
			System.out.println(new RoundomWords().next());
		}
		System.out.println(RandValues.RANDOM_INT);
	}

}
