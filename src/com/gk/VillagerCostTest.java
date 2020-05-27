package com.gk;

import java.util.Arrays;
import java.util.Scanner;

public class VillagerCostTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter test case");
			int t = sc.nextInt();
			while (t-- > 0) {
				System.out.println("Enter number of person:");
				int n = sc.nextInt();
				int a[] = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
				}
				Arrays.sort(a);
				long ans = 0;
				while (n > 3) {
					long op1 = a[0] + 2 * a[1] + a[n - 1];
					long op2 = 2 * a[0] + a[n - 2] + a[n - 1];
					ans += Math.min(op1, op2);
					n -= 2;
				}
				if (n == 1) {
					ans += a[0];
				} else if (n == 2) {
					ans += a[1];
				} else if (n == 3) {
					ans += (a[0] + a[1] + a[2]);
				}
				System.out.println(ans);
			}
		} catch (Exception e) {
		}

	}
}
