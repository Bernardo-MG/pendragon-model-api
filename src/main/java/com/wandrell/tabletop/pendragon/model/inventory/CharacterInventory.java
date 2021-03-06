
package com.wandrell.tabletop.pendragon.model.inventory;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.Character;
import com.wandrell.tabletop.pendragon.model.character.Horse;

public interface CharacterInventory {

    public void addHorse(final Horse horse);

    public void addStash(final Stash stash);

    public void clearHorses();

    public void clearStashes();

    public Character getCharacter();

    public Collection<Horse> getHorses();

    public Collection<Stash> getStashes();

    public void removeHorse(final Horse horse);

    public void removeStash(final Stash stash);

}
