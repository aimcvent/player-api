package fr.aimcvent.player.api.rank;

import java.util.List;

public interface Permissions {

    List<String> all();

    boolean has(String permission);
}
