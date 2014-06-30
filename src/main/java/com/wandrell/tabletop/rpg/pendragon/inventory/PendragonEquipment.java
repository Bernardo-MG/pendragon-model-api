package com.wandrell.tabletop.rpg.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonEquipment extends PendragonItem {

    @Override
    public PendragonEquipment createNewInstance();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public ValueHandler<Integer> getMiscelanyValue(final String name);

    public Collection<ValueHandler<Integer>> getMiscelanyValues();

    public Boolean hasFlag(final String name);

    public Boolean hasValue(final String name);

}
