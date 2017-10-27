package solution.inheritance.implementinginterfaces;

public interface Reservable {
	public boolean isReserved();
	public boolean canBeReservedFor(Member member);
	public boolean reserveItemFor(Member member);
}
