import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TicketDispenserTest {
    
    @Test
    public void the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one() {
        // Given
        TicketDispenser dispenser = new TicketDispenser();

        // When
        TurnTicket previousTicket = dispenser.getTurnTicket();
        TurnTicket newTicket = dispenser.getTurnTicket();

        // Then
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one_from_another_dispensor() {
    
        TicketDispenser anotherDispenser = new TicketDispenser();
        TicketDispenser dispenser = new TicketDispenser();

        int turnNumberOfPreviousTicketFromAnotherDispenser = 
                anotherDispenser.getTurnTicket().getTurnNumber();
        int turnNumberOfNewTicket = 
                dispenser.getTurnTicket().getTurnNumber();

        assertEquals(1, 
            turnNumberOfNewTicket - 
                turnNumberOfPreviousTicketFromAnotherDispenser);
    }

    @Test @Ignore
    public void the_dispenser_should_print_a_ticket_with_a_given_turn_number_using_mockito(){
       
        //Given
        TurnNumberSequence sequence = mock(TurnNumberSequence.class);
        when(TurnNumberSequence.getNextTurnNumber()).thenReturn(1);
        //When
        TicketDispenser dispenser = new TicketDispenser();
        int ticketNumber = dispenser.getTurnTicket().getTurnNumber();
        
    }

    @Test
    public void the_dispenser_should_print_a_ticket_with_a_given_turn_number(){
        // Given
        TicketDispenser dispenser = new TicketDispenser();

        // When
        TurnTicket ticket = dispenser.getTurnTicket();

        // Then
        assertEquals(11, ticket.getTurnNumber());
    }
}