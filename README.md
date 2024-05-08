### The Lunch Club

**Branch name:** linkedlist-prework

**RDE workflows:**
* `linked-lists-prework`

Expected time required: 15 min

Implement a class called `LunchClub` that uses a `LinkedList` of `String`s representing Amazon Lunch Club members
ordering food in a virtual cafe. The code will simulate a single day in the cafe where members enter the line
at the back, and get lunch when they reach the head of the line.

The class should include the following attribute:

-  The `LinkedList` called `membersInLine` that holds the names of all the members currently waiting to be served.

You'll need to implement the following methods:

-  constructor `LunchClub() ` -- Initializes the `LinkedList` called `membersInLine` to make it ready for members
   to line up for lunch.

-  `addMemberToLine(...)` -- Simulates someone entering the back of the line for lunch.

-  `addGroupToLine(...)` -- Simulates a group of people entering and adding to the back of the line.

-  `serveMember(...)` -- Removes a person from the front of the lunch line to serve them food.

-  `List<String> getMembersInLine()` -- Returns the List of members representing the current state of the lunch line.

**You have completed this pre-work when:**

* You have implemented the methods in the `LunchClub` class.
* The `linked-lists-prework` workflow is passing.
* You have committed and pushed your code.
* You have answered the Canvas quiz with a link to your commit on code browser.
