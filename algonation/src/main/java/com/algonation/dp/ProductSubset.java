package com.algonation.dp;

public class ProductSubset {

	public int countWithLesserProduct(int[] arr, int k) {
		int currentProduct = 1;
		return countWithLesserProduct(arr, currentProduct, k, arr.length-1);
	}
	
	private int countWithLesserProduct(int[] arr, int currentProduct, int k, int n) {
		if (n < 0 || currentProduct > k) {
			return 0;
		}
		
		return 1+countWithLesserProduct(arr, currentProduct * arr[n], k, n - 1)
				+ countWithLesserProduct(arr, currentProduct, k, n - 1);
	}
	
	public static void main(String[] args) {
		ProductSubset ps = new ProductSubset();
		int[] arr = {4, 8, 7, 2};
		int k = 50;
		System.out.println(ps.countWithLesserProduct(arr, k));
	}
}
