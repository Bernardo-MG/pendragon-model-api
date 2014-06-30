package com.wandrell.tabletop.rpg.pendragon.character.follower;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.character.PendragonBaseCharacter;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Wife extends NewInstantiable {

    @Override
    public Wife createNewInstance();

    public PendragonBaseCharacter getCharacter();

    public Collection<Child> getChildren();

    public String getFile();

    public ValueHandler<Integer> getYearWed();

}
