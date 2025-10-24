//Program to define generic functional interface Palindrome

package com.tnsif.lambdaexpression.copy;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
