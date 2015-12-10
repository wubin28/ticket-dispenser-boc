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

    @Test
    public void the_dispenser_should_print_a_ticket_with_a_given_turn_number_using_mockito(){
       
        //Given
        TurnNumberSequence mockTurnNumberSequence = mock(TurnNumberSequence.class);
        when(mockTurnNumberSequence.getNextTurnNumber()).thenReturn(11);
        TicketDispenser dispenser = new TicketDispenser(mockTurnNumberSequence);

        //When
        TurnTicket ticket = dispenser.getTurnTicket();
        
        // Then
        assertEquals(11, ticket.getTurnNumber());
        verify(mockTurnNumberSequence).getNextTurnNumber();
    }

    @Test
    public void the_dispenser_should_print_a_ticket_with_a_given_turn_number(){
        // Given
        MockTurnNumberSequence mockTurnNumberSequence = new MockTurnNumberSequence();
        mockTurnNumberSequence.arrangeNextTurnNumber(11);
        TicketDispenser dispenser = new TicketDispenser(mockTurnNumberSequence);

        // When
        TurnTicket ticket = dispenser.getTurnTicket();

        // Then
        assertEquals(11, ticket.getTurnNumber());
        mockTurnNumberSequence.verifyMethodGetNextTurnNumberCalled();
    }

    @Test
        public void the_vip_turn_number_begin_from_1001() {
        // Given
        TicketDispenser dispenser = new TicketDispenser();

        // When
        TurnTicket newVipTicket = dispenser.getVipTurnTicket();

        // Then
        assertEquals(1001, newVipTicket.getTurnNumber());
    }

    @Test
        public void the_vip_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one() {
        // Given
        TicketDispenser dispenser = new TicketDispenser();

        // When
        TurnTicket previousVipTicket = dispenser.getVipTurnTicket();
        TurnTicket newVipTicket = dispenser.getVipTurnTicket();

        // Then
        assertEquals(1, newVipTicket.getTurnNumber() - previousVipTicket.getTurnNumber());
    }

    @Test
    public void the_vip_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one_from_another_dispensor() {
    
        TicketDispenser anotherDispenser = new TicketDispenser();
        TicketDispenser dispenser = new TicketDispenser();

        int turnNumberOfPreviousTicketFromAnotherDispenser = 
                anotherDispenser.getVipTurnTicket().getTurnNumber();
        int turnNumberOfNewTicket = 
                dispenser.getVipTurnTicket().getTurnNumber();

        assertEquals(1, 
            turnNumberOfNewTicket - 
                turnNumberOfPreviousTicketFromAnotherDispenser);
    }
}

