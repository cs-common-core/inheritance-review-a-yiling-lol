# Java Inheritance Review - Day 1

This repository contains exercises and examples for reviewing Java inheritance concepts.

## Project Overview

This project serves as a practical review of inheritance concepts in Java, a core principle of object-oriented programming. It contains two main examples:

1. **Basic Inheritance Demo** (`DoNow.java`)  
   A simple demonstration of class inheritance showing how method overriding works in Java.

2. **Tech Company Simulation** (`TechCompany/` package)  
   A more complex example modeling employees in a tech company with inheritance relationships:
   - `Employee` - Base class with common employee attributes and methods
   - `Developer` - Specialized employee type (to be implemented)
   - `Manager` - Specialized employee type (to be implemented)

## Project Structure

```
.
├── bin/           # Compiled class files
├── lib/           # External libraries
├── src/           # Source code
│   ├── DoNow.java # Basic inheritance example
│   └── TechCompany/
│       ├── Employee.java    # Base class
│       ├── Developer.java   # Subclass (to be implemented)
│       ├── Manager.java     # Subclass (to be implemented)
│       └── CompanyDemo.java # Demo application
└── README.md      # Project documentation
```

## Learning Objectives

- Understanding inheritance in object-oriented programming
- Implementing class hierarchies
- Method overriding and polymorphism
- Dynamic binding in Java

## Next Steps

1. Complete the `Developer` class to extend `Employee` with developer-specific attributes and methods
2. Complete the `Manager` class to extend `Employee` with manager-specific attributes and methods
3. Uncomment the code in `CompanyDemo.java` to test your implementation
