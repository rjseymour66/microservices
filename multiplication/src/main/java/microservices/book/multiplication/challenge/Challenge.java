package microservices.book.multiplication.challenge;

/**
 * This class represents a Challenge to solve a Multiplication (a * b).
 */

public class Challenge {

    private int factorA;
    private int factorB;

    public Challenge(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Challenge)) return false;
        final Challenge other = (Challenge) o;
        if (this.getFactorA() != other.getFactorA()) return false;
        if (this.getFactorB() != other.getFactorB()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getFactorA();
        result = result * PRIME + this.getFactorB();
        return result;
    }

    public String toString() {
        return "Challenge(factorA=" + this.getFactorA() + ", factorB=" + this.getFactorB() + ")";
    }
}
