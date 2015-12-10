public class TurnNumberSequence {
    private static int _turnNumber = 0;

    public int getNextTurnNumber()
    {
        return _turnNumber++;
    }

    private static int _vip_turnNumber = 1000;

    public int getVipNextTurnNumber()
    {
        return _vip_turnNumber++;
    }
}
