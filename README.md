# SWE-442-java

## Project Title

Version Control and Release Management for a Java Utility Tool

## Overview

StringUtility is a simple Java utility tool that provides string manipulation functions. This project demonstrates essential configuration management skills using Git and GitHub, including version control, branching, merging, and release management.

## Tool Description

The StringUtility tool currently provides the following functionality:

- **String Reversal**: Reverses any given string
- **Vowel Counter**: Counts the number of vowels in a string
- **Palindrome Checker**: Checks if a string is a palindrome (ignores spaces and case)
- **Title Case Converter**: Converts strings to title case format

## How to Use

### Compilation

```bash
javac StringUtility.java
```

### Execution

```bash
java StringUtility
```

### Example Usage

```java
// Reverse a string
String reversed = StringUtility.reverse("Hello World");
// Output: "dlroW olleH"

// Count vowels
int vowelCount = StringUtility.countVowels("Hello World");
// Output: 3

// Check palindrome
boolean isPalin = StringUtility.isPalindrome("racecar");
// Output: true

// Convert to title case
String title = StringUtility.toTitleCase("hello world");
// Output: "Hello World"
```

## Project Information

- **Course**: SWE-442
- **Topic**: Version Control and Release Management
- **Language**: Java
- **Version Control**: Git & GitHub

## Development

This project follows a structured Git workflow with feature branching, pull requests, merge conflict resolution, and semantic versioning for releases.
