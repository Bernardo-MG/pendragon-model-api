package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.follower.Follower;
import com.wandrell.tabletop.business.model.pendragon.character.follower.Wife;
import com.wandrell.tabletop.business.model.pendragon.glory.GloryManager;
import com.wandrell.tabletop.business.model.pendragon.inventory.Item;
import com.wandrell.tabletop.business.model.pendragon.inventory.Money;
import com.wandrell.tabletop.business.model.pendragon.manor.Pet;
import com.wandrell.tabletop.business.model.pendragon.stats.Skill;

public interface PendragonPlayerCharacter extends PendragonHumanCharacter {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addExclusiveSkill(final Skill skill);

    public void addFollower(final Follower follower);

    public void addHoldingAtHome(final Item item);

    public void addHoldingCarried(final Item item);

    public void addHorse(final Horse horse);

    public void addPet(final Pet pet);

    public void addWife(final Wife wife);

    public void clearDistinctiveFeatures();

    public void clearExclusiveSkills();

    public void clearFollowers();

    public void clearHoldingsAtHome();

    public void clearHoldingsCarried();

    public void clearHorses();

    public void clearPet();

    public void clearWives();

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public Integer getArmor();

    public String getCulture();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public Collection<Skill> getExclusiveSkills();

    public String getFatherClass();

    public Collection<Follower> getFollowers();

    public GloryManager getGlory();

    public Collection<Item> getHoldingsAtHome();

    public Collection<Item> getHoldingsCarried();

    public String getHomeland();

    public Collection<Horse> getHorses();

    public Money getMoney();

    public Collection<Pet> getPets();

    public String getPlayerName();

    public String getReligion();

    public Collection<Wife> getWives();

    public Boolean isKnight();

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removeExclusiveSkill(final Skill skill);

    public void removeFollower(final Follower follower);

    public void removeHoldingAtHome(final Item item);

    public void removeHoldingCarried(final Item item);

    public void removeHorse(final Horse horse);

    public void removePet(final Pet pet);

    public void removeWife(final Wife wife);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setExclusiveSkills(final Collection<Skill> skill);

    public void setFollowers(final Collection<Follower> followers);

    public void setHoldingsAtHome(final Collection<Item> items);

    public void setHoldingsCarried(final Collection<Item> items);

    public void setHorses(final Collection<Horse> horses);

    public void setPets(final Collection<Pet> pets);

    public void setWives(final Collection<Wife> wive);

}
