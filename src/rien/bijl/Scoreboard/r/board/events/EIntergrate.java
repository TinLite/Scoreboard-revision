package rien.bijl.Scoreboard.r.board.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import rien.bijl.Scoreboard.r.Session;
import rien.bijl.Scoreboard.r.board.App;
import rien.bijl.Scoreboard.r.board.ScoreboardHolder;
import rien.bijl.Scoreboard.r.util.Func;

/**
 * Created by Rien on 22-10-2018.
 */
public class EIntergrate implements Listener {

    private App app;

    public EIntergrate(App app)
    {
        this.app = app;
    }

    @EventHandler
    public void Intergrate(PlayerJoinEvent e)
    {

        if(app == null || !app.isdefault) return;
        new ScoreboardHolder(app, e.getPlayer());
    }

}
