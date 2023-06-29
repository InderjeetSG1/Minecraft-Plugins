//package org.inderjeet.firstplugin;
//
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//
//import java.util.List;
//
//public class ConfigCommand implements CommandExecutor {
//
//    private TestPlugin testPlugin;
//
//    public ConfigCommand(TestPlugin testPlugin) {
//        this.testPlugin = testPlugin;
//    }
//
//    @Override
//    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
//
//        if (commandSender instanceof Player){
//            Player player = (Player) commandSender;
//
//            testPlugin.getConfig().set("Word", "Cake");
//
//            List<String> list = testPlugin.getConfig().getStringList("String-list");
//            list.add("New Value!");
//            testPlugin.getConfig().set("String-list", list);
//
//            testPlugin.saveConfig();
//
//
////            player.sendMessage(testPlugin.getConfig().getString("Word"));
////            player.sendMessage(testPlugin.getConfig().getInt("Number") + "");
////            if (testPlugin.getConfig().getBoolean("Boolean")) {
////                player.sendMessage("This feature is enabled");
////            }
////            for (String string: testPlugin.getConfig().getStringList("String-list")) {
////                player.sendMessage(string);
////            }
//
//
//        }
//
//        return false;
//    }
//}
