package net.cserny.games.thequest;

import javafx.scene.image.ImageView;
import net.cserny.games.thequest.item.Potion;
import net.cserny.games.thequest.location.Rectangle;

import java.util.Random;

public class GameLauncher {

    private Game game;
    private Random random = new Random();
    private ImageView[] slots;

    public static void main(String[] args) {
        new GameLauncher().launch();
    }

    private void launch() {
        game = new Game(new Rectangle(78, 57, 420, 155));
        /*slots = new ImageView[]{inventorySword, inventoryBluePotion, inventoryBow, inventoryRedPotion,
                inventoryMace, inventoryBomb, inventoryBattleaxe, inventoryShield};*/
        game.newLevel(random);
        updateCharacters();
    }

    private void updateCharacters() {
        /*player.Location = game.PlayerLocation;
        labelPlayerHP.Text = game.PlayerHitPoints.ToString();
        bool showBat = false;
        bool showGhost = false;
        bool showGhoul = false;
        int enemiesShown = 0;

        foreach (Enemy enemy in game.Enemies)
        {
            if (enemy is Bat)
            {
                bat.Location = enemy.Location;
                labelBatHP.Text = enemy.HitPoints.ToString();
                if (enemy.HitPoints > 0)
                {
                    showBat = true;
                    enemiesShown++;
                }
            }
            if (enemy is Ghost)
            {
                ghost.Location = enemy.Location;
                labelGhostHP.Text = enemy.HitPoints.ToString();
                if (enemy.HitPoints > 0)
                {
                    showGhost = true;
                    enemiesShown++;
                }
            }
            if (enemy is Ghoul)
            {
                ghoul.Location = enemy.Location;
                labelGhoulHP.Text = enemy.HitPoints.ToString();
                if (enemy.HitPoints > 0)
                {
                    showGhoul = true;
                    enemiesShown++;
                }
            }
        }

        if (showBat == false)
        {
            bat.Visible = false;
            labelBatHP.Text = "";
        }
        else
            bat.Visible = true;
        if (showGhost == false)
        {
            ghost.Visible = false;
            labelGhostHP.Text = "";
        }
        else
            ghost.Visible = true;
        if (showGhoul == false)
        {
            ghoul.Visible = false;
            labelGhoulHP.Text = "";
        }
        else
            ghoul.Visible = true;

        sword.Visible = false;
        bow.Visible = false;
        redPotion.Visible = false;
        bluePotion.Visible = false;
        mace.Visible = false;
        bomb.Visible = false;
        shield.Visible = false;
        battleaxe.Visible = false;
        Control weaponControl = null;
        switch (game.WeaponInRoom.Name)
        {
            case "Sword":
                weaponControl = sword; break;
            case "Bow" :
                weaponControl = bow; break;
            case "Mace" :
                weaponControl = mace; break;
            case "Bomb" :
                weaponControl = bomb; break;
            case "Battleaxe" :
                weaponControl = battleaxe; break;
            case "Shield" :
                weaponControl = shield; break;
            case "Blue Potion":
                weaponControl = bluePotion; break;
            case "Red Potion":
                weaponControl = redPotion; break;
        }

        weaponControl.Location = game.WeaponInRoom.Location;
        if (game.WeaponInRoom.PickedUp)
            weaponControl.Visible = false;
        else
            weaponControl.Visible = true;
        IconVisibility();
        if (game.PlayerHitPoints <= 0)
        {
            MessageBox.Show("You died...", "Game Over");
            Application.Exit();
        }
        if (enemiesShown < 1)
        {
            MessageBox.Show("You have defeated the enemies on this level.", "Level Complete");
            game.NewLevel(random);
            UpdateCharacters();
        }*/
    }

    private void iconVisibility() {
        /*int iconsVisible = 0;

        if (game.CheckPlayerInventory("Sword"))
        {
            inventorySword.Visible = true;
            ChangeBorders(inventorySword, "Sword");
            MoveIconsInPlace(iconsVisible, inventorySword);
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerSword;
            iconsVisible++;
        }
        else
            inventorySword.Visible = false;
        if (game.CheckPlayerInventory("Bow"))
        {
            inventoryBow.Visible = true;
            ChangeBorders(inventoryBow, "Bow");
            MoveIconsInPlace(iconsVisible, inventoryBow);
            iconsVisible++;
        }
        else
            inventoryBow.Visible = false;
        if (game.CheckPlayerInventory("Blue Potion"))
        {
            inventoryBluePotion.Visible = true;
            ChangeBorders(inventoryBluePotion, "Blue Potion");
            MoveIconsInPlace(iconsVisible, inventoryBluePotion);
            iconsVisible++;
        }
        else
            inventoryBluePotion.Visible = false;
        if (game.CheckPlayerInventory("Red Potion"))
        {
            inventoryRedPotion.Visible = true;
            ChangeBorders(inventoryRedPotion, "Red Potion");
            MoveIconsInPlace(iconsVisible, inventoryRedPotion);
            iconsVisible++;
        }
        else
            inventoryRedPotion.Visible = false;
        if (game.CheckPlayerInventory("Mace"))
        {
            inventoryMace.Visible = true;
            ChangeBorders(inventoryMace, "Mace");
            MoveIconsInPlace(iconsVisible, inventoryMace);
            iconsVisible++;
        }
        else
            inventoryMace.Visible = false;
        if (game.CheckPlayerInventory("Bomb"))
        {
            inventoryBomb.Visible = true;
            ChangeBorders(inventoryBomb, "Bomb");
            MoveIconsInPlace(iconsVisible, inventoryBomb);
            iconsVisible++;
        }
        else
            inventoryBomb.Visible = false;
        if (game.CheckPlayerInventory("Battleaxe"))
        {
            inventoryBattleaxe.Visible = true;
            ChangeBorders(inventoryBattleaxe, "Battleaxe");
            MoveIconsInPlace(iconsVisible, inventoryBattleaxe);
            iconsVisible++;
        }
        else
            inventoryBattleaxe.Visible = false;
        if (game.CheckPlayerInventory("Shield"))
        {
            inventoryShield.Visible = true;
            ChangeBorders(inventoryShield, "Shield");
            MoveIconsInPlace(iconsVisible, inventoryShield);
            iconsVisible++;
        }
        else
            inventoryShield.Visible = false;*/
    }

    private void moveIconsInPlace(int iconsVisible, ImageView item) {
        switch (iconsVisible) {
            case 0:
//                item.Location = new Point(81, 318);
                break;
            case 1:
//                item.Location = new Point(137, 318);
                break;
            case 2:
//                item.Location = new Point(193, 318);
                break;
            case 3:
//                item.Location = new Point(249, 318);
                break;
            case 4:
//                item.Location = new Point(305, 318);
                break;
            case 5:
//                item.Location = new Point(361, 318);
                break;
            case 6:
//                item.Location = new Point(417, 318);
                break;
            case 7:
//                item.Location = new Point(473, 318);
                break;
        }
    }

    private void changeBorders(ImageView slot, String weaponName) {
        if (game.getEquippedWeapon().getName().equals(weaponName)) {
            for (ImageView imageView : slots) {
                if (imageView != slot) {
//                    item.BorderStyle = BorderStyle.None;
                } else {
//                    slot.BorderStyle = BorderStyle.FixedSingle;
                }
            }
        }
    }

    private void isPotion() {
        if (game.getEquippedWeapon() instanceof Potion) {
            /*attackLeft.Enabled = false;
            attackLeft.Text = "";
            attackRight.Enabled = false;
            attackRight.Text = "";
            attackDown.Enabled = false;
            attackDown.Text = "";
            attackUp.Text = "Drink";*/
        } else {
            /*attackLeft.Enabled = true;
            attackLeft.Text = "Left (A)";
            attackRight.Enabled = true;
            attackRight.Text = "Right (D)";
            attackDown.Enabled = true;
            attackDown.Text = "Down (S)";
            attackUp.Text = "Up (W)";*/
        }
    }

    // TODO: KeyUp methods, click methods and arrow buttons handler methods
    /*
    private void up_Click(object sender, EventArgs e)
        {
            game.Move(Direction.Up, random);
            UpdateCharacters();
        }

        private void left_Click(object sender, EventArgs e)
        {
            game.Move(Direction.Left, random);
            UpdateCharacters();
        }

        private void right_Click(object sender, EventArgs e)
        {
            game.Move(Direction.Right, random);
            UpdateCharacters();
        }

        private void down_Click(object sender, EventArgs e)
        {
            game.Move(Direction.Down, random);
            UpdateCharacters();
        }

        private void attackUp_Click(object sender, EventArgs e) //i dont like it wither like this...
        {
            game.Attack(Direction.Up, random);
            UpdateCharacters();
            attackLeft.Enabled = true;
            attackLeft.Text = "Left";
            attackRight.Enabled = true;
            attackRight.Text = "Right";
            attackDown.Enabled = true;
            attackDown.Text = "Down";
            attackUp.Text = "Up";
        }

        private void attackLeft_Click(object sender, EventArgs e)
        {
            game.Attack(Direction.Left, random);
            UpdateCharacters();
        }

        private void attackRight_Click(object sender, EventArgs e)
        {
            game.Attack(Direction.Right, random);
            UpdateCharacters();
        }

        private void attackDown_Click(object sender, EventArgs e)
        {
            game.Attack(Direction.Down, random);
            UpdateCharacters();
        }

        private void inventorySword_Click(object sender, EventArgs e)
        {
            game.Equip("Sword");
            ChangeBorders(inventorySword, "Sword");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerSword;
        }

        private void inventoryBluePotion_Click(object sender, EventArgs e)
        {
            game.Equip("Blue Potion");
            ChangeBorders(inventoryBluePotion, "Blue Potion");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.player2;
        }

        private void inventoryBow_Click(object sender, EventArgs e)
        {
            game.Equip("Bow");
            ChangeBorders(inventoryBow, "Bow");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerBow;
        }

        private void inventoryRedPotion_Click(object sender, EventArgs e)
        {
            game.Equip("Red Potion");
            ChangeBorders(inventoryRedPotion, "Red Potion");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.player2;
        }

        private void inventoryMace_Click(object sender, EventArgs e)
        {
            game.Equip("Mace");
            ChangeBorders(inventoryMace, "Mace");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerMace;
        }

        private void inventoryBomb_Click(object sender, EventArgs e)
        {
            game.Equip("Bomb");
            ChangeBorders(inventoryBomb, "Bomb");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.player2;
        }

        private void inventoryBattleaxe_Click(object sender, EventArgs e)
        {
            game.Equip("Battleaxe");
            ChangeBorders(inventoryBattleaxe, "Battleaxe");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerMace;
        }

        private void inventoryShield_Click(object sender, EventArgs e)
        {
            game.Equip("Shield");
            ChangeBorders(inventoryShield, "Shield");
            IsPotion();
            player.BackgroundImage = global::Lab2_TheQuest.Properties.Resources.playerShield;
        }

        private void Form1_KeyUp(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Up)
                up_Click(sender, e);
            if (e.KeyCode == Keys.Down)
                down_Click(sender, e);
            if (e.KeyCode == Keys.Left)
                left_Click(sender, e);
            if (e.KeyCode == Keys.Right)
                right_Click(sender, e);

            if (e.KeyCode == Keys.W)
                attackUp_Click(sender, e);
            if (e.KeyCode == Keys.S)
                attackDown_Click(sender, e);
            if (e.KeyCode == Keys.A)
                attackLeft_Click(sender, e);
            if (e.KeyCode == Keys.D)
                attackRight_Click(sender, e);
        }
    * */
}
