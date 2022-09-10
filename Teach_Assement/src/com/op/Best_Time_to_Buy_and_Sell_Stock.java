package com.op;

public class Best_Time_to_Buy_and_Sell_Stock {

	static int mProfit(int prices[], int len) {
		int buy = prices[0], mProfit = 0;
		for (int i = 1; i < len; i++) {
			if (buy > prices[i])
				buy = prices[i];
			else if (prices[i] - buy > mProfit)
				mProfit = prices[i] - buy;

		}
		return mProfit;
	}

	public static void main(String[] args) {
		int prices[] = { 7, 6, 4, 3, 1 };
		int n = prices.length;
		int mProfit = mProfit(prices, n);
		System.out.println(mProfit);
	}
}
