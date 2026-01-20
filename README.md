# Binary-Search-in-Java
This program demonstrates the Binary Search algorithm implemented in Java. Binary Search is an efficient searching technique that works on sorted arrays by repeatedly dividing the search space into halves.

# How Binary Search Works

Set two pointers: low and high

Find the middle index using a safe formula

Compare the middle element with the target value

Eliminate half of the array based on comparison

Repeat until the element is found or the range becomes invalid

# Program Features

Uses iterative approach

Returns the index of the element if found

Returns -1 if the element is not present

Prevents integer overflow while calculating mid

Follows clean and modular coding practices

# Code Logic

BinarySearch(int arr[], int x)
Performs binary search on a sorted array and returns the index of x.

main()
Initializes the array, calls the search method, and prints the result.

# Sample Input
int arr[] = { 2, 3, 4, 10, 40 };
int x = 10;

# Sample Output
Binary Search
The element is present at the index:3

# Time & Space Complexity

Time Complexity: O(log n)

Space Complexity: O(1)

# Important Note

The array must be sorted before applying Binary Search.

This algorithm does not work correctly on unsorted data.

# Concepts Practiced

Arrays

Loops

Conditional statements

Static methods

Algorithm optimization
