import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LunchClubTest {

    @Test
    public void moo() {
        assertEquals(1, 1);
    }

    @Test
    public void getMembersInLine_called_lineContainsOriginalMembers() {
        // GIVEN
        LunchClub lunch = new LunchClub();
        List<String> expectedPeople = Arrays.asList("Jane", "John", "Li");
        lunch.addGroupToLine(expectedPeople);

        // WHEN
        List<String> result = lunch.getMembersInLine();

        // THEN
        assertEquals(expectedPeople, result, "Didn't get the expected lunch club people");
    }

    @Test
    public void addMemberToLine_addOneMember_fourMembers() {
        // GIVEN
        LunchClub lunch = new LunchClub();
        lunch.addGroupToLine(Arrays.asList("Jane", "John", "Li"));
        List<String> expectedPeople = Arrays.asList("Jane", "John", "Li", "Mateo");

        // WHEN
        lunch.addMemberToLine("Mateo");

        // THEN
        List<String> result = lunch.getMembersInLine();
        assertEquals(expectedPeople, result, "Didn't get the expected lunch club people");
    }

    @Test
    public void serveMember_removeFirstMember_twoMembers() {
        // GIVEN
        LunchClub lunch = new LunchClub();
        lunch.addGroupToLine(Arrays.asList("Jane", "John", "Li"));
        List<String> expectedPeople = Arrays.asList("John", "Li");

        // WHEN
        lunch.serveMember();

        // THEN
        List<String> result = lunch.getMembersInLine();
        assertEquals(expectedPeople, result, "Didn't get the expected lunch club people");
    }

    @Test
    public void addGroupToLine_addTwoPeople_fiveMembers() {
        // GIVEN
        LunchClub lunch = new LunchClub();
        lunch.addGroupToLine(Arrays.asList("Jane", "John", "Li"));
        List<String> expectedPeople = Arrays.asList("Jane", "John", "Li", "Mateo", "Richard");

        // WHEN
        lunch.addGroupToLine(Arrays.asList("Mateo", "Richard"));

        // THEN
        List<String> result = lunch.getMembersInLine();
        assertEquals(expectedPeople, result, "Didn't get the expected lunch club people");
    }

}