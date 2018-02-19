package com.belous.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag = false;
			while (!flag) {
				System.out.println("Введите количество элементов в наборе:");
				int size = Integer.parseInt(reader.readLine());
				int[] source = new int[size];
				System.out.println("Введите " + size + " числа(-ел) через Enter:");

				for (int i = 0; i < size; i++) {
					source[i] = Integer.parseInt(reader.readLine());
				}

				System.out.println("\n2-й по величине элемент: " + getMax(source));
				System.out.println("\nВведите exit для выхода или нажмите Enter для продолжения.");
				if (reader.readLine().equals("exit"))
					flag = true;
			}
		} catch (IOException e) {
			System.err.println("Ошибка ввода/вывода!");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.err.println("Ошибка! Вводите целые числа.");
			System.exit(1);
		}
	}

	public static int getMax(int[] src) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int num : src) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			}
			else if (num > max2) {
				max2 = num;
			}
		}
		return max2;
	}
}
