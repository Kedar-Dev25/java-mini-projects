# 📘 Day 05 Notes — Simple Interest Calculator

---

## 1️⃣ What is Simple Interest?

Simple Interest is the extra money earned or paid on the principal amount over time.

It is calculated using the formula:

SI = (P × R × T) / 100

---

## 2️⃣ Why We Use double Data Type?

We use `double` instead of `int` because:

- Interest can be decimal
- Rate can be fractional
- More precision is needed

Example:
5.5% interest rate

---

## 3️⃣ Step-by-Step Program Logic

1. Take principal input
2. Take rate input
3. Take time input
4. Apply formula
5. Calculate total amount
6. Print results

---

## 4️⃣ Understanding the Code

### 🔹 Taking Input

```java
Scanner sc = new Scanner(System.in);
```

Scanner allows us to take user input.

---

### 🔹 Applying Formula

```java
double si = (principal * rate * time) / 100;
```

This directly follows the mathematical formula.

---

### 🔹 Calculating Total Amount

```java
double totalAmount = principal + si;
```

---

## 5️⃣ Important Beginner Tips

✔ Always close Scanner  
✔ Use meaningful variable names  
✔ Keep formatting clean  
✔ Use proper indentation

---

## 6️⃣ Common Mistakes

❌ Using int instead of double  
❌ Forgetting to divide by 100  
❌ Not printing total amount  
❌ Forgetting to close scanner

---

## 🎯 Key Takeaway

This project connects:
Mathematics + Programming + Logic

This is how real-world finance applications start.

---
