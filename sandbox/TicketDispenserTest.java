import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TicketDispenserTest {
    
    @Test
    public void the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one() {

        TicketDispenser dispenser = new TicketDispenser();

        TurnTicket newTicket = dispenser.getTurnTicket();

        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }



    //todo the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one_from_another_dispensor
}