package beardefense;

import miscellaneous.Virologist;

public interface BearDefense {

	public abstract void bearAttack(Virologist bear, Virologist target) throws CloneNotSupportedException;

	public abstract int getPriority();
}
