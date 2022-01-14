package me.kyren223.announcementplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class AnnouncementPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        AnnouncementsManager.repeatAnnouncement();
    }
}
