package net.cserny.games.thequest;

import net.cserny.games.thequest.enemy.AbstractEnemy;
import net.cserny.games.thequest.enemy.Bat;
import net.cserny.games.thequest.enemy.Ghost;
import net.cserny.games.thequest.enemy.Ghoul;
import net.cserny.games.thequest.item.*;
import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.location.Point;
import net.cserny.games.thequest.location.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<AbstractEnemy> enemies;
    private AbstractWeapon weaponInRoom;
    private Player player;
    private int level = 0;
    private Rectangle boundaries;

    public Game(Rectangle boundaries) {
        this.boundaries = boundaries;
        this.player = new Player(new Point(boundaries.getLeft() + 10, boundaries.getTop() + 70), this);
    }

    public int getLevel() {
        return level;
    }

    public Rectangle getBoundaries() {
        return boundaries;
    }

    public AbstractWeapon getWeaponInRoom() {
        return weaponInRoom;
    }

    public Point getPlayerLocation() {
        return player.getLocation();
    }

    public int getPlayerHitPoints() {
        return player.getHitPoints();
    }

    public List<String> getPlayerWeapons() {
        return player.getWeapons();
    }

    public List<AbstractEnemy> getEnemies() {
        return enemies;
    }

    public AbstractWeapon getEquippedWeapon() {
        return player.getEquippedWeapon();
    }

    public void equip(String weaponName) {
        player.equip(weaponName);
    }

    public boolean checkPlayerInventory(String weaponName) {
        return player.getWeapons().contains(weaponName);
    }

    public void move(Direction direction, Random random) {
        player.move(direction, boundaries);
        for (AbstractEnemy enemy : enemies) {
            enemy.move(random);
        }
    }

    public void hitPlayer(int amount, Random random) {
        player.hit(amount, random);
    }

    public void increasePlayerHealth(int amount, Random random) {
        player.increaseHealth(amount, random);
    }

    public void attack(Direction direction, Random random) {
        player.attack(direction, random);
        for (AbstractEnemy enemy : enemies) {
            enemy.move(random);
        }
    }

    public Point getRandomLocation(Random random) {
        int x = boundaries.getLeft() + (random.nextInt((boundaries.getRight() / 10) - boundaries.getLeft() / 10) * 10);
        int y = boundaries.getTop() + (random.nextInt((boundaries.getBottom() / 10) - boundaries.getTop() / 10) * 10);
        return new Point(x, y);
    }

    public void newLevel(Random random) {
        level++;
        switch (level) {
            case 1:
                enemies = new ArrayList<>();
                enemies.add(new Bat(getRandomLocation(random), this));
                weaponInRoom = new Sword(getRandomLocation(random), this);
                break;
            case 2:
                enemies = new ArrayList<>();
                enemies.add(new Ghost(getRandomLocation(random), this));
                weaponInRoom = new BluePotion(getRandomLocation(random), this);
                break;
            case 3:
                enemies = new ArrayList<>();
                enemies.add(new Ghoul(getRandomLocation(random), this));
                weaponInRoom = new Bow(getRandomLocation(random), this);
                break;
            case 4:
                enemies = new ArrayList<>();
                enemies.add(new Bat(getRandomLocation(random), this));
                enemies.add(new Ghoul(getRandomLocation(random), this));
                if (!player.getWeapons().contains("Bow")) {
                    weaponInRoom = new Bow(getRandomLocation(random), this);
                } else {
                    weaponInRoom = new BluePotion(getRandomLocation(random), this);
                }
                break;
            case 5:
                enemies = new ArrayList<>();
                enemies.add(new Bat(getRandomLocation(random), this));
                enemies.add(new Ghoul(getRandomLocation(random), this));
                weaponInRoom = new RedPotion(getRandomLocation(random), this);
                break;
            case 6:
                enemies = new ArrayList<>();
                enemies.add(new Ghost(getRandomLocation(random), this));
                enemies.add(new Ghoul(getRandomLocation(random), this));
                weaponInRoom = new Mace(getRandomLocation(random), this);
                break;
            case 7:
                enemies = new ArrayList<>();
                enemies.add(new Bat(getRandomLocation(random), this));
                enemies.add(new Ghost(getRandomLocation(random), this));
                enemies.add(new Ghoul(getRandomLocation(random), this));
                if (!player.getWeapons().contains("Mace")) {
                    weaponInRoom = new Mace(getRandomLocation(random), this);
                } else {
                    weaponInRoom = new RedPotion(getRandomLocation(random), this);
                }
                break;
            case 8:
            default:
                System.exit(0);
                break;
        }
    }
}
