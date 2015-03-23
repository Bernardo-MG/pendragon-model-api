package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface PendragonPlayerCharacter extends PendragonHumanCharacter {

    public void addPet(final Pet pet);

    public void clearPet();

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public String getFatherClass();

    public String getHomeland();

    public Collection<Pet> getPets();

    public String getPlayerName();

    public void removePet(final Pet pet);

    public void setPets(final Collection<Pet> pets);

}
