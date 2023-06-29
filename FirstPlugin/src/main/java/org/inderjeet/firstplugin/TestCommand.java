package org.inderjeet.firstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("testplugin.use")) {
                player.sendMessage(ChatColor.GREEN + "You have permission to use this!");
            } else {
                player.sendMessage(ChatColor.RED + "You dont have permission to use this!");
            }
        }
//        if (sender instanceof Player) {
//            ((Player) sender).sendMessage("No this is console only!");
//        } else {
//            System.out.println("Hello, you have messaged the console!");
//        }
//        if (sender instanceof Player) {
//            // if first argument is equal to hello then we will send hello back
//            if (args.length == 1) {
//                if (args[0].equalsIgnoreCase("hello")) {
//                    ((Player) sender).sendMessage("Hello My Friend!");
//                }
//            }
//        }

        return false;
    }
}
