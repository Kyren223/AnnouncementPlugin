package me.kyren223.announcementplugin;

public class AnnouncementsManager  {

    static AnnouncementPlugin plugin = AnnouncementPlugin.getPlugin(AnnouncementPlugin.class);

    public static void repeatAnnouncement() {
        int minutes = plugin.getConfig().getInt("minutesBetweenMessages");
        String s = Functions.col(plugin.getConfig().getString("announcement"));

        plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            plugin.getServer().getOnlinePlayers().forEach(player -> {player.sendMessage(s);});
        }, 0, (long) minutes * 60 * 20);


    }
}
