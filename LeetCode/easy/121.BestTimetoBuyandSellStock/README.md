# 121. Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

**Example 1:**

	Input: [7, 1, 5, 3, 6, 4]
	Output: 5
	
	max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

**Example 2:**

	Input: [7, 6, 4, 3, 1]
	Output: 0
	
	In this case, no transaction is done, i.e. max profit = 0.

# Solution

## Brute Force

>使用暴力方法解，怎么想怎么写，双层循环解决。
>LeetCode: Time Limit Exceeded 

## Clever Method

这道题，为什么会感觉很难做，因为逻辑没有搞清楚：

1. 什么时候买进？当前值小于上一次买进的值，就应该买进。
2. 什么时候卖出？只要当前利益比它最大收益大，就卖出（可惜不是预测。）

总结：买进和卖出没有联系，卖出是买进前的最大利益，所以当输入[7, 6, 8, 3, 1]，虽然买进是1，但是获利最大是8-6=2，利润是2。