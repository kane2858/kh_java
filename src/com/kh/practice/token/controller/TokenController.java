package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String total = "";
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			total = total + t;
		}

		return total;
	}

	public String firstCap(String input) {
		char[] in = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			in[i] = input.charAt(i);
		}
		in[0] = Character.toUpperCase(in[0]);

		return new String(in);
	}

	public int findChar(String input, char one) {
		int result = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == one) {
				result++;
			}
		}

		return result;
	}

}
