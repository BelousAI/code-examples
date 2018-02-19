package com.belous.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите строку для кодирования:");
				String source = reader.readLine();
				System.out.println("Результат кодирования:\n" + getEncoded(source));
				System.out.println("\nВведите exit для выхода или нажмите Enter для продолжения.");
				if (reader.readLine().equals("exit"))
					flag = true;
			}
		} catch (IOException e) {
			System.err.println("Ошибка ввода/вывода!");
			System.exit(1);
		}
	}

	public static String getEncoded(String src) {
		//Лучше использовать StringBuilder
		String encodedString = "";
		int count = 1;
		int len = src.length();

		for (int i = 0; i < len; i++) {
			if (i + 1 < len && src.charAt(i) == src.charAt(i + 1)) {
				count++;
			} else {
				encodedString = String.format("%s%d%s", encodedString, count, src.charAt(i));
				count = 1;
			}
		}
		return encodedString;
	}
}
