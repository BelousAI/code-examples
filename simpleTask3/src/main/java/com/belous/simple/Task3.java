package com.belous.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите строку: ");
				String source = reader.readLine();

				if (isPalindrome(source)) {
					System.out.println("Строка палиндром.");
				} else {
					System.out.println("Строка не палиндром.");
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

	public static boolean isPalindrome(String src) {
		//Убирает пробелы в строке
		String str = src.replace(" ", "");

		//Переводит к одному регистру
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		int len = str.length();

		for (int i = 0; i < (len / 2); i++) {
			if (arr[i] != arr[len - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
