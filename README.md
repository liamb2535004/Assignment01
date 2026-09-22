# Assignment 01: Typing Tutor

A JavaFX-based application designed to help users learn to "touch type" correctly without looking at the keyboard. The application provides interactive text prompts 
and a virtual keyboard that responds in real-time to physical keystrokes.

Features
Interactive Virtual Keyboard: Physical key presses map directly to virtual JavaFX buttons, changing their appearance dynamically to show they are being pressed.
Typing Accuracy Tracker: Real-time tracking and display of correctly and incorrectly typed characters.
Multiple Lessons: Users advance through a sequence of 6 predefined text samples, with buttons to move to the next text or reset progress back to the beginning.
Error Handling: Unmapped or unhandled physical keystrokes trigger a visual "Not handled" warning in red text.

Technologies Used
Java: Core application logic, text validation, and event handling.
JavaFX: GUI development using `VBox` and `HBox` layout panes.
CSS: Custom stylesheet used for dynamic key sizing, coloring, and UI alignment.

Getting Started
Ensure you have the JavaFX SDK configured in your IDE or environment (NetBeans prefered). Compile and run `App.java` to launch the application.
