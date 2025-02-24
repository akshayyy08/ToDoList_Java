# To-Do List Application

## Overview
The **To-Do List Application** is a simple command-line program built in **Java** that allows users to **add, view, and manage tasks efficiently**. It is designed for users who want to keep track of their daily activities with due dates and categories.

## Features
- **Add Tasks**: Users can add tasks with a description, category, and due date.
- **View Tasks**: Displays all tasks with their completion status.
- **Mark Tasks as Completed**: Allows users to mark tasks as done.
- **User-Friendly CLI**: Simple and interactive command-line interface.
- **Robust Input Handling**: Prevents invalid input and ensures smooth execution.

## Technologies Used
- **Java (JDK 8 or later)**
- **Java Collections (ArrayList)**
- **Scanner for User Input Handling**

## Installation & Setup
1. Ensure **Java JDK 8+** is installed on your system. Check with:
   ```sh
   java -version
   ```
2. Download or clone this repository:
   ```sh
   git clone https://github.com/yourusername/todo-list-java.git
   ```
3. Navigate to the project directory:
   ```sh
   cd todo-list-java
   ```
4. Compile the Java program:
   ```sh
   javac ToDoListApp.java
   ```
5. Run the application:
   ```sh
   java ToDoListApp
   ```

## Usage
Once the application starts, a menu appears with the following options:

```
========= TO-DO LIST APPLICATION =========
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Exit
Choose an option:
```

### Example Usage:
#### 1. Adding a Task
```
Enter task description: Complete Java Project
Enter category (Work/Personal/School/etc.): Work
Enter due date (YYYY-MM-DD): 2025-03-01
Task added successfully.
```
#### 2. Viewing Tasks
```
Your To-Do List:
1. [ ] Complete Java Project (Category: Work, Due: 2025-03-01)
```
#### 3. Marking a Task as Completed
```
Enter task number to mark as completed: 1
Task marked as completed.
```
#### 4. Exiting the Program
```
Exiting... Goodbye!
```

## Future Enhancements
- **Persistent Storage**: Save and retrieve tasks from a file.
- **Task Prioritization**: Add priority levels (High, Medium, Low).
- **GUI Implementation**: Develop a JavaFX/Swing-based interface.
- **Task Reminders**: Implement notification system for due dates.

## Contributing
Contributions are welcome! If you’d like to enhance this project:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Added a new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## License
This project is open-source and available under the **MIT License**.

---
**Author**: Your Name  
**GitHub**: https://github.com/akshayyy08/ToDoList_Java

