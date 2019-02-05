package net.cserny.games.thequest;

import net.cserny.games.thequest.item.AbstractWeapon;
import net.cserny.games.thequest.item.Potion;
import net.cserny.games.thequest.location.AbstractMover;
import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.location.Point;
import net.cserny.games.thequest.location.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends AbstractMover {

    private AbstractWeapon equippedWeapon;
    private int hitPoints = 10;
    private List<AbstractWeapon> inventory = new ArrayList<>();
    private List<String> weapons = new ArrayList<>();

    public Player(Point location, Game game) {
        super(location, game);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public List<String> getWeapons() {
        List<String> names = new ArrayList<>();
        for (AbstractWeapon weapon : inventory) {
            names.add(weapon.getName());
        }
        return names;
    }

    public AbstractWeapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void hit(int maxDamage, Random random) {
        hitPoints -= random.nextInt(maxDamage);
    }

    public void increaseHealth(int health, Random random) {
        hitPoints += random.nextInt(health);
    }

    public void equip(String weaponName) {
        for (AbstractWeapon weapon : inventory) {
            if (weapon.getName().equals(weaponName)) {
                equippedWeapon = weapon;
            }
        }
    }

    @Override
    public Point move(Direction direction, Rectangle boundaries) {
        location = super.move(direction, game.getBoundaries());
        if (!game.getWeaponInRoom().isPickedUp()) {
            if (nearby(game.getWeaponInRoom().getLocation(), 10)) {
                game.getWeaponInRoom().pickUpWeapon();
            }
            if (inventory.size() == 1) {
                equip(inventory.get(0).getName());
            }
        }
        return location;
    }

    public void attack(Direction direction, Random random) {
        if (equippedWeapon != null) {
            equippedWeapon.attack(direction, random);
        }
        if (equippedWeapon instanceof Potion) {
            inventory.remove(equippedWeapon);
        }
    }
}
