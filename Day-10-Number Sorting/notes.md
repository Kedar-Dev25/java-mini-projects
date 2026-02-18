# 🧠 Day 10 – Number Sorting (Arrays)

---

## 📌 What is an Array?

An array is a collection of elements of the same data type stored in
continuous memory locations.

It allows us to:

✔ Store multiple values  
✔ Access them using index  
✔ Process data efficiently

---

## 📌 Why Sorting is Important?

Sorting is used to:

- Arrange data in order
- Make searching faster
- Improve readability of output
- Prepare data for algorithms

Real-world examples:

Marks ranking  
Price low → high  
Name A → Z

---

## 📌 Bubble Sort – Core Idea

Compare adjacent elements and swap if they are in the wrong order.

After every pass:

Largest element moves to the end.

---

## 🔄 Bubble Sort Flow

Example:

Input → 5 3 8 2

Pass 1 → 3 5 2 8  
Pass 2 → 3 2 5 8  
Pass 3 → 2 3 5 8

Sorted ✅

---

## 📌 Time Complexity

Worst Case → O(n²)  
Best Case → O(n) (when already sorted – optimized version)

---

## 📌 Key Concepts Used

### 🔹 Array Input

We take multiple values using a loop.

### 🔹 Traversing an Array

Accessing elements one by one.

### 🔹 Nested Loop

Used for comparison and positioning.

### 🔹 Swapping

Used to exchange values:

int temp = arr[j];  
arr[j] = arr[j+1];  
arr[j+1] = temp;

---

## 📌 Optimization Used

If no swapping happens in a pass → array is already sorted.

This reduces unnecessary iterations.

---

## 📌 Dry Run

Array → 4 1 3

Pass 1:

4 > 1 → swap → 1 4 3  
4 > 3 → swap → 1 3 4

Pass 2:

1 < 3 → no swap

Sorted ✅

---

## 📌 Interview Points

Why do we use nested loops in sorting?

To compare each element with the next elements.

What is swapping?

Interchanging positions of two elements.

Why is Bubble Sort called “Bubble”?

Because the largest elements “bubble up” to the end.

Can we sort without extra space?

Yes — Bubble Sort is an in-place algorithm.

---

## 📌 Real Learning Outcome

Arrays = Data handling foundation  
Sorting = Data organization skill  
Swapping = Core logic building

This is the base for:

Merge Sort  
Quick Sort  
Binary Search  
DSA

---

## 🚀 Summary

Arrays store multiple values efficiently.

Sorting arranges data in meaningful order.

Bubble Sort works using comparison and swapping.

Optimization improves performance.

This is your first step into DSA-level thinking.
