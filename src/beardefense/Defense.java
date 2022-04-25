package beardefense;

import miscellaneous.Virologist;
import equipment.*;

public class Defense implements BearDefense{
	
	private final int priority = 1;

	public void bearAttack(Virologist bear, Virologist target) {
		
		target.getEquipments();
		for(int i = 0; i < target.getEquipments().size(); i++) {
			if(target.getEquipments().get(i).equals(Axe.class))
				(Axe)target.getEquipments().get(i).usedLife();
		}
		bear.Die();
		
	}

	public int getPriority() {
		return priority;
	}
}
