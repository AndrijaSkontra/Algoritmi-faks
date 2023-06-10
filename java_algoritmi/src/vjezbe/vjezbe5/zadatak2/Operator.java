package vjezbe.vjezbe5.zadatak2;

/**
 *This enum tells us which operator has priority in
 * computing tasks
 */
public enum Operator {

    ADD(1),
    SUBTRACT(2),
    MULTIPLY(3),
    DIVIDE(4),
    EXPON(5);

    private final int priority;

    private Operator (int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
