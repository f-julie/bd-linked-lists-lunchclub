import java.util.LinkedList;
import java.util.List;

/**
 * Comment this class appropriately.
 */
public class LunchClub {
    private List<String> line;

    /**
     * Initializes the `LinkedList` called `membersInLine` to make it ready for members
     * to line up for lunch.
     */
    public LunchClub() {
        line = new LinkedList<>();
    }

    /**
     * Simulates someone entering the back of the line for lunch.
     * @param newMember - member to add.
     */
    public void addMemberToLine(String newMember) {
        line.add(newMember);
    }

    /**
     * Removes a person from the front of the lunch line to serve them food.
     */
    public void serveMember() {
        line.remove(0);
    }

    /**
     * Simulates a group of people entering and adding to the back of the line.
     * @param newMembers - List of members to add.
     */
    public void addGroupToLine(List<String> newMembers) {
        line.addAll(newMembers);
    }

    /**
     * Returns the List of members representing the current state of the lunch line.
     * @return lunch line members LinkedList.
     */
    public List<String> getMembersInLine() {
        return new LinkedList<>(line);
    }

}