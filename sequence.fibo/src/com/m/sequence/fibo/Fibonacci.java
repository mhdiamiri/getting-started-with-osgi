package com.m.sequence.fibo;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Timer;

import com.m.sequence.api.Sequence;

public class Fibonacci implements Sequence
{
	private static ArrayList<Integer> calculated;

	
	public Fibonacci() {
		calculated = new ArrayList<>();
		calculated.add(0, 0);
		calculated.add(1, 1);
		calculated.add(2, 1);
	}
	@Override
	public double get(int i) 
	{	
		
		if (i > 20) {
			return get(i - 1) + get(i - 2);
		}
		else if (calculated.size() > i)
			return calculated.get(i).doubleValue();
		else {
			calculated.add(i, (int) (get(i-1) + get(i - 2)) );
			return calculated.get(i).doubleValue();
		}
	}
	
	
	public static void main(String[] args) {
		long start, end;
		Fibonacci fibo = new Fibonacci();
		start = System.currentTimeMillis();
		double tenth = fibo.get(65);
		end = System.currentTimeMillis();
		System.out.println((int) tenth);
		System.out.println("calculation time: "+ (end - start)+"ms");
	}
}
