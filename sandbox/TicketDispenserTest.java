import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TicketDispenserTest {
    
    @Test
    public void the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one() {

   TurnTicket  turnTicket1=new TurnTicket(); 
 
   number1=turnTicket1.getTurnNumber();
   TurnTicket  turnTicket2=new TurnTicket(); 
   number2=turnTicket1.getTurnNumber();


  assertEquals(number1, number2-1);
    }



    //todo the_turn_number_of_the_new_ticket_should_be_subsequent_to_the_previous_one_from_another_dispensor
}
