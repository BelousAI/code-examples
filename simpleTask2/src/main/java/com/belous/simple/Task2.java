package com.belous.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите целое число:");
				int num = Integer.parseInt(reader.readLine());
				System.out.println("Простые множители числа " + num + ": " + getMultipliers(num));
				System.out.println("\nВведите exit для выхода или нажмите Enter для продолжения.");
				if (reader.readLine().equals("exit"))
					flag = true;
			}
		} catch (IOException e) {
			System.err.println("Ошибка ввода/вывода!");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.err.println("Ошибка! Введите целое число.");
			System.exit(1);
		}
	}

	public static ArrayList<Integer> getMultipliers(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		int multiplier = 2;

		//любой делитель <= квадратному корню составного числа.
		while (num > 1 && (multiplier * multiplier <= num)) {
			if (num % multiplier == 0) {
				list.add(multiplier);
				num /= multiplier;
			}
			else if (multiplier == 2) {
				multiplier++;
			}
			else {
				multiplier += 2; //нет смысла пытаться делить на четные числа.
			}
		}
		list.add(num);
		return list;
	}
}
