package com.cglx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculator {

	public Calculator() {
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}

	public int square(int a) {
		int result = a * a;
		return result;
	}

	public int remainder(int a, int b) {
		int result = a % b;
		return result;
	}

	public int sqroot(int a) {

		return (int) Math.sqrt(a);
	}

	private void readFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"));
		StringBuilder stringBuilder = new StringBuilder();
		char[] buffer = new char[10];
		while (reader.read(buffer) != -1) {
			stringBuilder.append(new String(buffer));
			buffer = new char[10];
		}
		reader.close();

		String content = stringBuilder.toString();
		System.out.println(content);
	}
}
