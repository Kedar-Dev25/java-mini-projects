# 📘 Day 07 Notes — Student Grade Calculator

---

## 1️⃣ What is an Array?

An array is a collection of elements of the same data type.

Example:
int[] marks = new int[5];

This stores 5 subject marks inside one variable.

---

## 2️⃣ Why Use Arrays Here?

Without arrays:
We would need separate variables like:

int m1, m2, m3, m4, m5;

With arrays:
We can store multiple marks dynamically and process them using loops.

This makes the program scalable.

---

## 3️⃣ Program Flow Explained (Step-by-Step)

Step 1 → Ask number of subjects  
Step 2 → Create array of that size  
Step 3 → Take marks input using loop  
Step 4 → Calculate total using loop  
Step 5 → Calculate average  
Step 6 → Assign grade using conditions  
Step 7 → Display results

---

## 4️⃣ Understanding Important Code Sections

### 🔹 Array Declaration

int[] marks = new int[numberOfSubjects];

This creates space to store marks.

---

### 🔹 Taking Input Using Loop

for (int i = 0; i < numberOfSubjects; i++) {
marks[i] = sc.nextInt();
}

Loop allows repeated input without writing multiple statements.

---

### 🔹 Calculating Total

int total = 0;

for (int i = 0; i < numberOfSubjects; i++) {
total += marks[i];
}

This adds all marks together.

---

### 🔹 Calculating Average

double average = (double) total / numberOfSubjects;

Type casting ensures correct decimal division.

---

### 🔹 Assigning Grade

if (average >= 90) {
grade = "A";
} else if (average >= 75) {
grade = "B";
} else if (average >= 50) {
grade = "C";
} else {
grade = "Fail";
}

Conditions define grading rules.

---

## 5️⃣ Beginner Mistakes to Avoid

❌ Forgetting to initialize total = 0  
❌ Dividing integers without casting  
❌ Wrong loop condition  
❌ Array index out of bounds  
❌ Not closing Scanner

---

## 6️⃣ Key Learning from This Project

✔ Arrays store grouped data  
✔ Loops process arrays efficiently  
✔ Average calculation requires type awareness  
✔ Conditions implement real-world rules

This project improves structured data handling.

---
