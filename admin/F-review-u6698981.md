Reviewer: Harriet Phillips (u6698981)
Component: isValidPlacementSequence and associated methods
Author: Bojie Jia (u6730978)

Review Comments:

1. I find the methods a bit confusing to read due to the lack of comments explaining what each part
of code is meant to do. Adding some more comments in each method would really improve the readability and the
documentation of the code. Adding in a bit of spacing between elements would also help make the code a bit neater.

2. I think the separate methods used for solving different problems that converge to solve the overall task is really
good! It makes the code a lot easier to understand than if they were all piled into the same method. In isNeighbour,
the use of the Tiles enum worked really well, however I had already made an enum for the tiles and a fixOrientation method, so it
wasn't entirely needed. I'd also already made a method that finds where two pieces are connected, so you probably could
have implemented it to reduce the amount of code you wrote. However, your application of your enum worked really well
and implementing mine may have added extra unnecessary code (in having to call the fixOrientation method
whenever you needed to rotate a tile).

3. I think that you've named all of your methods and variables well, with it being very easy to tell what each one
is for, and that the style you use is consistent throughout your code.

4. In isExit I think it might have reduced the amount of code you had to write if you made each exit's location
into a list of strings and reused the code for each north, south, etc, exit.

5. I think you tests are quite good but that you could add more - for example throwing an error if an invalid
string is passed and writing a test that checks for that.

6. I couldn't spot any errors in you code to comment on! Good job :)