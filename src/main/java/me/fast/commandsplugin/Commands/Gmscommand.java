package me.fast.commandsplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gmscommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("gms")){
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Just changed your gamemode to Survival!");
            }else{
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Hey! You cannot change your gamemode to survival!");
            }
        }else{
            System.out.println("Hey! this is only for player's!");
        }

        return false;
    }

}
