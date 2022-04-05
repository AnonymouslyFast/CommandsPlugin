package me.fast.commandsplugin;

import me.fast.commandsplugin.Commands.GmaCommand;
import me.fast.commandsplugin.Commands.GmcCommand;
import me.fast.commandsplugin.Commands.Gmscommand;
import me.fast.commandsplugin.Commands.GmspCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("gms").setExecutor(new Gmscommand());
        getCommand("gmc").setExecutor(new GmcCommand());
        getCommand("gmsp").setExecutor(new GmspCommand());
        getCommand("gma").setExecutor(new GmaCommand());
    }


}
