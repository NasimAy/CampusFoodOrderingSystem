# Campus Food Delivery System - Design Patterns Refactoring

## 📌 Project Overview
This project is a Java-based simulation of a university campus food ordering service. The primary goal of this assignment is to demonstrate how software design patterns can transform a rigid, if-else heavy codebase into a maintainable and scalable system.

The system allows students to order food and receive notifications via different channels (Email, SMS, and Push). Initially, this logic was hardcoded within a single class; it has now been refactored using the Factory and Singleton patterns.

---

## 🛠 Design Patterns Used

### 1. Factory Pattern
The **Factory Pattern** is implemented through the `NotificationFactory` class. 
* **Purpose**: It decouples the object creation logic from the `CampusFoodOrderService`. 
* **Benefit**: Adding a new notification type (e.g., WhatsApp) now only requires adding a new class and updating the factory, rather than modifying the core business logic.

### 2. Singleton Pattern
The **Singleton Pattern** is implemented in the `AppConfig` class.
* **Purpose**: It ensures that only one instance of the application configuration exists.
* **Benefit**: It provides a centralized, consistent place to manage shared data like the **University Name** and **Delivery Fee** across the entire application.

---

## 🚀 How to Run the Project

### Prerequisites
* **Java Development Kit (JDK)**: Version 17 or higher is recommended.
* **IDE**: IntelliJ IDEA, VS Code, or any Java-compatible editor.

### Steps to Run
1. **Clone the Repository**:
   ```bash
   git clone [https://github.com/yourusername/CampusFoodOrderingSystem.git](https://github.com/yourusername/CampusFoodOrderingSystem.git)
