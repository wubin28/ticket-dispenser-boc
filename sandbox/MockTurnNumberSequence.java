public class MockTurnNumberSequence extends TurnNumberSequence {

    private int nextTurnNumber;
    private int count;
    
    public MockTurnNumberSequence() {
        count = 0;
    }

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    @Override
    public int getNextTurnNumber() {
        //count++;
        return this.nextTurnNumber;
    }

    public void verifyMethodGetNextTurnNumberCalled() {
        if (count != 1) {
            throw new IllegalStateException("the method MockTurnNumberSequence.getNextTurnNumber() should be called once.");
        }
    }
}