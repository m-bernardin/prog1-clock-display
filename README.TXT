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

31. aside from its own method calls no, none of its methods call on any of its other methods
32. 2
33. the results sign is based on the sign of the number being divided
34. 0, 1, 2, 3, 4
35. all integers 0 and m-1

37. i found the masked one easier to write, but its not where my head understood it, neither option is particularly better, because were at avery small scale, but the masked one would be better because it requires less code, and is therefore faster
 
51. it gets my time but advances it by 4 hours? i dont understand how its aquiring the time though so i cant fix it
52. it returns the same value, but without the the 0 it returns the valye with a space instead of a zero