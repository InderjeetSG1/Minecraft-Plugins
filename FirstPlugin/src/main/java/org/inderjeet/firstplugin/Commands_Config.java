//package org.inderjeet.firstplugin;
//
//import org.bukkit.plugin.java.JavaPlugin;
//
//public final class TestPlugin extends JavaPlugin {
//
//    @Override
//    public void onEnable() {
//        // Plugin startup logic
//        getConfig().options().copyDefaults();
//        saveDefaultConfig();
//
//
//        getCommand("heal").setExecutor(new HealCommand());
//        getCommand("test").setExecutor(new TestCommand());
//        getCommand("config").setExecutor(new ConfigCommand(this));
//
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
//}
