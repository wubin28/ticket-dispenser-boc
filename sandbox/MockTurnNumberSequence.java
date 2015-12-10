public class MockTurnNumberSequence extends TurnNumberSequence {

    private int nextTurnNumber;

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    @Override
    public int getNextTurnNumber() {
        return this.nextTurnNumber;
    }

    public void verifyMethodGetNextTurnNumberCalled() {
    }
}