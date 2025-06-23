package fr.aimcvent.player.api.rank;

import java.util.UUID;

public interface Rank {
    UUID id();

    String name();

    boolean isDefault();

    Permissions permissions();

    String bukkitColor();

    String bukkitPrefix();

    String bukkitSuffix();
}
