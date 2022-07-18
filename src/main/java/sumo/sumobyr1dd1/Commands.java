package sumo.sumobyr1dd1;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor {

    private List<Player> onlinePlayers = new ArrayList<Player>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("start")){
            int firstPlayer = 0;
            int secondPlayer = 1;



            for(int i = 0; i <= onlinePlayers.size(); i++){
                sender.sendMessage("Пара " + firstPlayer + " и "+ secondPlayer);
                firstPlayer = firstPlayer +2;
                secondPlayer = secondPlayer + 2;
            }

        }
        return true;
    }

    public List<Player> getOnlinePlayers() {
        return onlinePlayers;
    }
    // 0 1 2 3 4 5 6 7
}
