/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantryRifleFederatedBarrettM42BInfernoWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryRifleFederatedBarrettM42BInfernoWeapon() {
		super();

		name = "Rifle (Federated-Barrett M42B) (Inferno Grenades)";
		setInternalName(name);
		addLookupName("InfantryFederatedBarrettM42BInferno");
		addLookupName("Federated Barrett M42B Inferno");
		ammoType = AmmoType.T_INFANTRY;
		cost = 1385;
		bv = 2.3;
		tonnage = .006;
		flags = flags.or(F_INFERNO).or(F_DIRECT_FIRE).or(F_BALLISTIC);
		infantryDamage = 0.82;
		infantryRange = 1;
		ammoWeight = 0.00024;
		ammoCost = 12;
		shots = 50;
		bursts = 5;
		rulesRefs = "273,TM";
		techAdvancement.setTechBase(TECH_BASE_IS).setISAdvancement(3060, 3064, 3095, DATE_NONE, DATE_NONE)
		        .setISApproximate(true, false, false, false, false)
		        .setPrototypeFactions(F_FS)
		        .setProductionFactions(F_FS).setTechRating(RATING_C)
		        .setAvailability(RATING_X, RATING_X, RATING_D, RATING_C);

	}
}
