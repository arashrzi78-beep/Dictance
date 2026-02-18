# Dictance
📍 Point Distance Calculator (Java)

A clean, object-oriented Java implementation for modeling 2D points and calculating the Euclidean distance between them.

This project demonstrates foundational OOP design principles, class separation, and mathematical computation using Java’s standard library.

🚀 Overview

The application:

Models a 2D point using a dedicated Point class

Encapsulates coordinate data using private fields

Provides controlled access via getters and setters

Calculates the Euclidean distance between two points

Demonstrates proper separation of responsibilities between classes

This project is intentionally minimal and structured to highlight clarity and correctness.

🏗 Architecture
.
├── Main.java
└── Point.java

🔹 Point Class

Responsible for:

Storing x and y coordinates

Providing controlled access to data

Representing a point in 2D space

🔹 Main Class

Responsible for:

Application entry point

Distance calculation logic

Testing object behavior

This separation follows basic object-oriented design principles.

📐 Distance Formula

The program calculates distance using the Euclidean formula:

𝑑
=
(
𝑥
2
−
𝑥
1
)
2
+
(
𝑦
2
−
𝑦
1
)
2
d=
(x
2
	​

−x
1
	​

)
2
+(y
2
	​

−y
1
	​

)
2
	​


Implemented in Java using:

Math.pow()

Math.sqrt()

▶ Example Execution

Input:

Point p1 = new Point(2, 1);
Point p2 = new Point(6, 4);

p2.setX(8);
p2.setY(5);


Output:

point 1 =  x = 2     y = 1
point 2 =  x = 8     y = 5

distance = 7.211102550927978

🧠 Technical Concepts Demonstrated

Object-Oriented Programming (OOP)

Encapsulation

Constructor usage

Getter and setter methods

Static utility method design

Mathematical computation

Multi-class project structure

🛠 How to Run
Compile:
javac Main.java Point.java

Execute:
java Main

🔍 Design Considerations

Coordinates use int for simplicity

Distance calculation returns double

Clear separation between data model (Point) and application logic (Main)

Minimal but extendable structure

📈 Possible Extensions

For further improvement:

Replace display() with overridden toString()

Use double coordinates for higher precision

Add input from user (Scanner)

Implement additional geometric methods:

Midpoint

Slope

Distance from origin

Add unit tests (JUnit)

📚 Educational Value

This project is suitable for:

Introductory Java courses

OOP fundamentals practice

Academic assignments

Technical portfolio demonstrations

It reflects understanding of core Java syntax and clean class design.
