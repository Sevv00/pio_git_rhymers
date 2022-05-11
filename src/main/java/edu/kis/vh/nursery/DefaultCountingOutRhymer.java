package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	/**
	 * ERROR_RETURN_VALUE - wartość zwraca w razie gdy tablica nie zawiera rymów
	 */
	private static final int ERROR_RETURN_VALUE = -1;
	/**
	 * TOTAL_INIT_VALUE - wartość inicjalizująca tablice rymów
	 */
	private static final int TOTAL_INIT_VALUE = -1;
	/**
	 * MAX_ARRAY_SIZE - maksymalny rozmiar tablicy 
	 */
	private static final int MAX_ARRAY_SIZE = 12;
	/**
	 * MAX_ELEMENTS_COUNT - maksymalny index elementu tablicy, zależy od wartości MAX_ARRAY_SIZE
	 */
	private static final int MAX_ELEMENTS_COUNT = MAX_ARRAY_SIZE - 1;

	/**
	 * numbers - zmienna tablicowa przechowująca rymy
	 */
	private final int[] numbers = new int[MAX_ARRAY_SIZE];

	/**
	 * total - wartość przechowuję obecną liczbę rymów
	 */
	private int total = TOTAL_INIT_VALUE;

	/**
	 * @return metoda zwraca obecną liczbę rymów
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param in - liczba rymów
	 * Metoda metoda zapisuję liczbę rymów podanych w parametrze do tablicy numbers
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return metoda zwraca true jeżeli tablica rymów jest pusta lub false w przeciwnym razie 
	 */
	public boolean callCheck() {
		return total == TOTAL_INIT_VALUE;
	}

	/**
	 * @return metoda zwraca true jeżeli tablica rymów jest pełna lub false w przeciwnym razie
	 */
	public boolean isFull() {
		return total == MAX_ELEMENTS_COUNT;
	}

	/**
	 * @return metoda zwraca liczbę rymów ostatnio zapisaną do tablicy numbers
	 */
	protected int peekaboo() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total];
	}

	/**
	 * @return metoda zwraca ostatnią liczbę rymów zapisaną do tablicy jednocześnie usuwając te wartość z tablicy
	 * w razie gdy tablica jest pusta zwraca wartość ERROR_RETURN_VALUE
	 */
	public int countOut() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total--];
	}

}

//Kombinacja klawiszy alt + strzałka lewo/prawo przełącza między kolejnymi plikami ostatnio modyfikowanymi/zapisanymi
//Strzałka w lewo przełącza z dalszymi zmianami a w prawo z ostatnimi zmianami
