package com.keyin.sprint;

import com.keyin.data.Database;
import com.keyin.sprint.Address;
import com.keyin.sprint.Person;
import com.keyin.sprint.Tourney;
import com.keyin.sprint.TourneyDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockingTesting {

    @Mock
    private Database mockDatabase;

    @Test
    public void testTestingMocking() {
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Tourney> tourneyList = new ArrayList<Tourney>();

        Person person1 = new Person("Jen", "1231231234", "jen@jen.com");
        personList.add(person1);

        Tourney tourney1 = new Tourney("some tournament championship",
                new Address("123 some street", "some city", "NL", "123253"),
                new TourneyDate(2022, 6, 12),
                new TourneyDate(2022, 6, 16), 100, 500);
        tourneyList.add(tourney1);

        // Mockito.when(mockDatabase.checkDbForMemberName("Jen")).thenReturn(person1.getName());
        // GOT LOST WITH MOCKITO !!

        // Standard J-Unit testing --> Compairing objects test
        Assertions.assertNotSame(person1, tourney1);
        Assertions.assertNotNull(person1);

        // Testing name in person1 object
        Assertions.assertEquals("jen", person1.getName());
        Assertions.assertNotEquals("jen1", person1.getName());
        person1.setName("jen1");
        Assertions.assertEquals("jen1", person1.getName());
        Assertions.assertNotEquals("jen", person1.getName());

        // Testing phoneNum in person1 object
        Assertions.assertEquals("1231231234", person1.getPhone());
        Assertions.assertNotEquals("000000000", person1.getPhone());
        person1.setPhone("0000000000");
        Assertions.assertEquals("0000000000", person1.getPhone());
        Assertions.assertNotEquals("1231231231", person1.getPhone());

        // Compairing email to person1 object
        Assertions.assertEquals("jen@jen.com", person1.getEmail());
        Assertions.assertNotEquals("jenColford@jen.com1", person1.getEmail());
        person1.setEmail("newadd@address.com");
        Assertions.assertEquals("newadd@address.com", person1.getEmail());
        Assertions.assertNotEquals("jenColford@jen.com1", person1.getEmail());

        // Testing tourneyName in tourney1 object
        Assertions.assertEquals("some tournament championship", tourney1.getTourneyName());
        Assertions.assertNotEquals("some tournament finals", tourney1.getTourneyName());
        tourney1.setTourneyName("anothertourney");
        Assertions.assertEquals("anothertourney", tourney1.getTourneyName());
        Assertions.assertNotEquals("some tournament finals", tourney1.getTourneyName());

        // Testing Address--> street in tourney1 object
        Assertions.assertEquals("123 some street", tourney1.getLoc().getStreet());
        Assertions.assertNotEquals("312 some street", tourney1.getLoc().getStreet());
        tourney1.getLoc().setStreet("123 new street");
        Assertions.assertEquals("123 new street", tourney1.getLoc().getStreet());
        Assertions.assertNotEquals("123 some street", tourney1.getLoc().getStreet());

        // Testing Address--> city in tourney1 object
        Assertions.assertEquals("some city", tourney1.getLoc().getCity());
        Assertions.assertNotEquals("other city", tourney1.getLoc().getCity());
        tourney1.getLoc().setCity("other city");
        Assertions.assertEquals("other city", tourney1.getLoc().getCity());
        Assertions.assertNotEquals("some city", tourney1.getLoc().getCity());

        // Testing Address--> prov in tourney1 object
        Assertions.assertEquals("NL", tourney1.getLoc().getProv());
        Assertions.assertNotEquals("ON", tourney1.getLoc().getProv());
        tourney1.getLoc().setProv("ON");
        Assertions.assertEquals("ON", tourney1.getLoc().getProv());
        Assertions.assertNotEquals("NL", tourney1.getLoc().getProv());

        // Testing Address--> postal in tourney1 object
        Assertions.assertEquals("123253", tourney1.getLoc().getPostal());
        Assertions.assertNotEquals("321321", tourney1.getLoc().getPostal());
        tourney1.getLoc().setPostal("321321");
        Assertions.assertEquals("321321", tourney1.getLoc().getPostal());
        Assertions.assertNotEquals("123123", tourney1.getLoc().getPostal());

        // Testing TourneyDate--> startDate--> year in tourney1 object
        Assertions.assertEquals(2022, tourney1.getStartDate().getYear());
        Assertions.assertNotEquals(2012, tourney1.getStartDate().getYear());
        tourney1.getStartDate().setYear(2012);
        Assertions.assertEquals(2012, tourney1.getStartDate().getYear());
        Assertions.assertNotEquals(2022, tourney1.getStartDate().getYear());

        // Testing TourneyDate--> startDate--> month in tourney1 object
        Assertions.assertEquals(6, tourney1.getStartDate().getMonth());
        Assertions.assertNotEquals(7, tourney1.getStartDate().getMonth());
        tourney1.getStartDate().setMonth(7);
        Assertions.assertEquals(7, tourney1.getStartDate().getMonth());
        Assertions.assertNotEquals(8, tourney1.getStartDate().getMonth());

        // Testing TourneyDate--> startDate--> day in tourney1 object
        Assertions.assertEquals(12, tourney1.getStartDate().getDay());
        Assertions.assertNotEquals(15, tourney1.getStartDate().getDay());
        tourney1.getStartDate().setDay(15);
        Assertions.assertEquals(15, tourney1.getStartDate().getDay());
        Assertions.assertNotEquals(12, tourney1.getStartDate().getDay());

        // Testing TourneyDate--> endDate--> year in tourney1 object
        Assertions.assertEquals(2022, tourney1.getEndDate().getYear());
        Assertions.assertNotEquals(2023, tourney1.getEndDate().getYear());
        tourney1.getEndDate().setYear(2023);
        Assertions.assertEquals(2023, tourney1.getEndDate().getYear());
        Assertions.assertNotEquals(2022, tourney1.getEndDate().getYear());

        // Testing TourneyDate--> endDate--> month in tourney1 object
        Assertions.assertEquals(6, tourney1.getEndDate().getMonth());
        Assertions.assertNotEquals(7, tourney1.getEndDate().getMonth());
        tourney1.getEndDate().setMonth(7);
        Assertions.assertEquals(7, tourney1.getEndDate().getMonth());
        Assertions.assertNotEquals(8, tourney1.getEndDate().getMonth());

        // Testing TourneyDate--> endDate--> day in tourney1 object
        Assertions.assertEquals(16, tourney1.getEndDate().getDay());
        Assertions.assertNotEquals(26, tourney1.getEndDate().getDay());
        tourney1.getEndDate().setDay(26);
        Assertions.assertEquals(26, tourney1.getEndDate().getDay());
        Assertions.assertNotEquals(16, tourney1.getEndDate().getDay());

        // Testing TourneyDate--> entryFee in tourney1 object
        Assertions.assertEquals(100, tourney1.getEntryFee());
        Assertions.assertNotEquals(1000, tourney1.getEntryFee());
        tourney1.setEntryFee(1);
        Assertions.assertEquals(1, tourney1.getEntryFee());
        Assertions.assertNotEquals(1000, tourney1.getEntryFee());

        // Testing TourneyDate--> cashPrize in tourney1 object
        Assertions.assertEquals(500, tourney1.getCashPrize());
        Assertions.assertNotEquals(5000, tourney1.getCashPrize());
        tourney1.setCashPrize(5000);
        Assertions.assertEquals(5000, tourney1.getCashPrize());
        Assertions.assertNotEquals(500, tourney1.getCashPrize());

    }
}
