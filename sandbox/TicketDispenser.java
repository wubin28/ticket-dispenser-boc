public class TicketDispenser {

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
    }

    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
