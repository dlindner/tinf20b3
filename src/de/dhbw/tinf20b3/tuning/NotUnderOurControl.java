package de.dhbw.tinf20b3.tuning;

import java.util.Arrays;
import java.util.Random;

public class NotUnderOurControl {

	private static final int dataSize = 40_000;
	
    public static void main(final String[] arguments) {
    	final int[] data = fillDataRandomly(dataSize);

    	System.out.println("Starting...");
        final long start = System.nanoTime();
        
        long sum = 0;
        
        // This works like magic
        Arrays.sort(data);
        
        for (int j = 0; j < data.length; ++j) {
        	for (int i = 0; i < 200_000; ++i) {
                if (data[j] >= 128) {
                    sum += data[j];
                }
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("duration (sec): " + (System.nanoTime() - start) / 1E9);
    }

	private static int[] fillDataRandomly(int size) {
		final int[] data = new int[size];
        final Random random = new Random(132);
        for (int i = 0; i < data.length; ++i) {
            data[i] = random.nextInt() % 256;
        }
		return data;
	}
}
