package fr.aimcvent.player.api;

import java.util.UUID;

public interface Rank {
    UUID id();

    String name();

    boolean isDefault();

    int power();

    String bukkitColor();

    String bukkitPrefix();

    String bukkitSuffix();
}
