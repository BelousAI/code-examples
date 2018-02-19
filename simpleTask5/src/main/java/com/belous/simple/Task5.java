package com.belous.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите строку: ");
				String str = reader.readLine();
				System.out.println("Введите подстроку: ");
				String subStr = reader.readLine();

				if (isFound(str, subStr)) {
					System.out.println("Совпадения найдены.");
				} else {
					System.out.println("Совпадений не найдено.");
				}
				System.out.println("\nВведите exit для выхода или нажмите Enter для продолжения.");
				if (reader.readLine().equals("exit"))
					flag = true;
			}
		} catch (IOException e) {
			System.err.println("Ошибка ввода/вывода!");
			System.exit(1);
		}
	}

	public static boolean isFound(String str, String subStr) {
		char[] text = str.toCharArray();
		char[] pattern = subStr.toCharArray();
		boolean found = false;
		boolean endReached = (pattern.length > text.length);
		int textIndex = 0;

		while (!(found || endReached)) {
			int patternIndex = 0;

			//сравнивает символы строки и подстроки
			while (!found && pattern[patternIndex] == text[textIndex + patternIndex]) {
				patternIndex++;
				found = (patternIndex == pattern.length);
			}
			textIndex++;
			endReached = (textIndex == (text.length - pattern.length + 1));
		}
		return found;
	}
}
