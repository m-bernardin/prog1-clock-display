Project: clock-display
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

To use this project, create an instance of class ClockDisplay. Then inspect this 
instance and leave the object inspector window open. With the inspector window open, 
call the object's methods, such as timeTick and setTime. Watch the 
"displayString" in the inspector.

The displayString field simulates the actual clock display device. Were this 
program running in a real clock, it would change the real, physical display 
hardware instead of this string. The timeTick method would be triggered once 
every minute by some timer hardware.

Everything else could be pretty much the same.


Note: This project does not implement adequate handling of errors.

part ii:
21. because when it creates the NumberDisplay objects it starts them at their limits, whihc makes them rollover right away
23. 60 times, by calling the method setTime(1,0);
24. 'private NumberDisplay digit;' 'digit = new NumberDisplay(10);'
25. 'private Rectangle window;' 'window = new Rectangle(int width, int length);'

26. it makes a clock at a preset time, it does this the same way as the default clock, but calls the setTime(int hours, int minutes); method at the end with the custom time set when the constructor method was called
27. setTime already calls on updateDisplay in its own code
28. 'p1.print("deck1.jpg", false);' 'p1.print("chem lab 2.pdf", true);' 'p1.getStatus(1);' 'p1.getStatus(3);'
29. class objects
30. 'new Triangle();' 'changeSize(60, 180);' 'moveHorizontal(20);' 'moveVertical(-40);' 'makeVisible();'

