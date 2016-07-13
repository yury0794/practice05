package prob6;

public class Money {
	int value;

	public Money(int value) {
		this.value = value;
	}

	public Money add(Money m) {
		return new Money(value + m.value);
	}

	public Money minus(Money m) {
		return new Money(value - m.value);
	}

	public Money multiply(Money m) {
		return new Money(value * m.value);
	}

	public Money devide(Money m) {
		return new Money(value / m.value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (value != other.value)
			return false;
		return true;
	}
}