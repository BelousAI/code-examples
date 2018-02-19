package com.belous.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите закодированную строку:");
				String source = reader.readLine();
				System.out.println("Результат декодирования:\n" + getDecoded(source));
				System.out.println("\nВведите exit для выхода или нажмите Enter для продолжения.");
				if (reader.readLine().equals("exit"))
					flag = true;
			}
		} catch (IOException e) {
			System.err.println("Ошибка ввода/вывода!");
			System.exit(1);
		}
	}

	public static String getDecoded(String src) {
		//Лучше использовать StringBuilder
		String decodedString = "";

		for (int i = 0; i < src.length(); i += 2) {
			int count = Character.getNumericValue(src.charAt(i));

			for (int j = 0; j < count; j++) {
				decodedString = String.format("%s%s", decodedString, src.charAt(i + 1));
			}
		}
		return decodedString;
	}
}
