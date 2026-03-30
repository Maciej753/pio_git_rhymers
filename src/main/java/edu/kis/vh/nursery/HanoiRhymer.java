package edu.kis.vh.nursery;

/**
 * Implementacja wyliczanki, która odrzuca niektóre elementy i zlicza ich liczbę.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Liczba odrzuconych elementów
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów.
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element, jeśli spełnia warunek.
     * W przeciwnym razie zwiększa licznik odrzuceń.
     * @param in element do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
