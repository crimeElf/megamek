/*
 * MegaMek - Copyright (C) 2004, 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package megamek.common.weapons.autocannons;

public class CUSTOMAC2 extends ACWeapon {
    private static final long serialVersionUID = 5850000L;

    public CUSTOMAC2() {
        super();
        name = "Custom AC/2";
        setInternalName("Custom Autocannon/2");
        addLookupName("Custom IS Auto Cannon/2");
        addLookupName("Custom Auto Cannon/2");
        addLookupName("Custom AutoCannon/2");
        addLookupName("Custom AC/2");
        addLookupName("Custom ISAC2");
        addLookupName("Custom IS Autocannon/2");
        sortingName = "Custom AC/02";
        heat = 1;
        damage = 2;
        rackSize = 2;
        minimumRange = 0;
        shortRange = 8;
        mediumRange = 16;
        longRange = 24;
        extremeRange = 32;
        tonnage = 1.0;
        criticals = 4;
        bv = 37;
        cost = 75000;
        explosive = true; // when firing incendiary ammo
        shortAV = 2;
        medAV = 2;
        longAV = 2;
        maxRange = RANGE_LONG;
        explosionDamage = damage;
        rulesRefs = "208, TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
                .setIntroLevel(true)
                .setTechRating(RATING_C)
                .setAvailability(RATING_C, RATING_D, RATING_D, RATING_D)
                .setISAdvancement(2290, 2300, 2305, DATE_NONE, DATE_NONE)
                .setISApproximate(false, false, false, false, false)
                .setClanAdvancement(2290, 2300, 2305, 2850, DATE_NONE)
                .setClanApproximate(false, false, false, true, false)
                .setPrototypeFactions(F_TA)
                .setProductionFactions(F_TA);
    }
}
