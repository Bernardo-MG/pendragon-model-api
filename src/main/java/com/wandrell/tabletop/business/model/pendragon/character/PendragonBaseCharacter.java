package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.util.tag.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    @Override
    public PendragonBaseCharacter createNewInstance();

    public Integer getConstitution();

    public Integer getDamage();

    public Integer getDexterity();

    public Integer getDexterityRoll();

    public Integer getHealingRate();

    public Integer getHitPoints();

    public Integer getMajorWoundTreshold();

    public Integer getMovementRate();

    public String getName();

    public Integer getSize();

    public Integer getStrength();

    public Integer getUnconsciousTreshold();

    public Integer getWeight();

    public void setConstitution(final Integer constitution);

    public void setDexterity(final Integer dexterity);

    public void setSize(final Integer size);

    public void setStrength(final Integer strength);

}
