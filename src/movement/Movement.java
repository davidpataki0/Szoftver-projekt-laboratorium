package movement;

import field.Field;
import miscellaneous.Virologist;

/**
 * A virológus mozgását jellemző interfész.
 */
public interface Movement {
	
    /**
     * A paraméterként kapott virológus szeretne átlépni egy szomszédos mezőre
     * @param v, a virológus, aki szeretne ellépni
     * @param target, a mező, ahova lépni szeretne
     */
	
	public abstract boolean move(Virologist v, Field target);

}
