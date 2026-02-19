# 🧠 Day 11 – Password Validator (String Conditions)

---

## 📌 Why Password Validation?

Password validation is used in:

- Login systems
- Signup forms
- Banking apps
- Social media platforms

It ensures:

✔ Security  
✔ Strong user credentials  
✔ Data protection

---

## 📌 Conditions Used

A strong password must contain:

Minimum 8 characters

At least one uppercase letter → A-Z

At least one lowercase letter → a-z

At least one digit → 0-9

At least one special character → @ # $ % & \*

---

## 📌 String Methods Used

### length()

Returns total number of characters in a string.

### charAt(index)

Used to access characters one by one.

---

## 📌 Character Checking Techniques

### Uppercase Check

Character between 'A' and 'Z'

### Lowercase Check

Character between 'a' and 'z'

### Digit Check

Character between '0' and '9'

### Special Character Check

Anything that is not a letter or digit

---

## 📌 Why Use Boolean Flags?

Boolean variables help to:

Track each condition separately

Example:

hasUppercase  
hasLowercase  
hasDigit  
hasSpecialCharacter

This makes logic clean and readable.

---

## 📌 Validation Flow

Take password input

Check length

Loop through each character

Update flags based on character type

Check all conditions

Print result

---

## 📌 Dry Run Example

Password → Java@123

Uppercase → J ✅  
Lowercase → ava ✅  
Digit → 123 ✅  
Special Character → @ ✅

Strong Password ✔

---

## 📌 Time Complexity

O(n)

Because we traverse the string once.

---

## 📌 Interview Points

Why is string traversal required?

To check each character individually.

Can we use ASCII values?

Yes, characters can be validated using ASCII ranges.

What is the real-world use of this program?

Authentication systems.

---

## 📌 Real Learning Outcome

String handling becomes stronger

Multi-condition logic improves

You learn real-world validation flow

Foundation for:

Form validation  
Regex  
Authentication systems

---

## 🚀 Summary

Password validation is a real-world problem.

String traversal helps implement custom checks.

Boolean flags make logic clean.

This project improves problem-solving and input validation skills.
