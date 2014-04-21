package com.wandrell.tabletop.rpg.pendragon.character.module;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonTrait;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface TraitsBonusSwitchsData {

    public ValueHandler<Integer> getBonusSwitch(final String name);

    public Collection<ValueHandler<Integer>> getBonusSwitchs();

    public Boolean hasBonusSwitch(final String name);

    public void setChivaldryTraits(final Collection<PendragonTrait> traits);

    public void setGentlewomanTraits(final Collection<PendragonTrait> traits);

    public void setReligiousTraits(final Collection<PendragonTrait> traits);

}
