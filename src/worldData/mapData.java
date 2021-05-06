package worldData;

import worldData.tileInfo.*;

public class mapData {

    public static final int OVERWORLD = 0;
    public static final int DUNGEON_ICE = 1;
    public static final int DUNGEON_FIRE = 2;
    public static final int DUNGEON_OCEAN = 3;
    public static final int DUNGEON_POISON = 4;
    public static final int DUNGEON_FINAL = 5;

    public tileOverworld[][] Overworld = {
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),         new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Forest"), new tileOverworld("Forest"), new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"), new tileOverworld("Mountains"), new tileOverworld("Mountains"), new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains"),     new tileOverworld("Mountains"),         new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),         new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Forest"), new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"), new tileOverworld("Mountains"), new tileOverworld("Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Mountains")},
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),         new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"), new tileOverworld("Mountains"), new tileOverworld("Mountains"),       new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Mountains")},
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),      new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"), new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Snowy Mountains"), new tileOverworld("Mountains")},
        {new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains"),     new tileOverworld("Mountains"),         new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Lake"),   new tileOverworld("Lake"),   new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains"),     new tileOverworld("Mountains"),         new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Mountains"),     new tileOverworld("Mountains"),         new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Poisoned Earth"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Mountains"),       new tileOverworld("Mountains"),       new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Mountains")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Forest"),    new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Ocean"),          new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Plains"),    new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("Forest"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("Forest")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("Forest"),        new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("Forest"),          new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"),      new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Wasteland"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("Plains"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("HellScape"),     new tileOverworld("Forest"),            new tileOverworld("Forest"),          new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Wasteland"),      new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Plains"), new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"),       new tileOverworld("Plains"),          new tileOverworld("Plains"),          new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Plains"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("HellScape"), new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("Lava"),            new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Wooden Bridge"), new tileOverworld("Lava"),              new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Wooden Bridge"), new tileOverworld("Lava"),              new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"),    new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Wooden Bridge"), new tileOverworld("Lava"),              new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava")},
        {new tileOverworld("Ocean"),          new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape"),     new tileOverworld("Lava"),              new tileOverworld("Lava"),            new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape"),       new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Plains"),         new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape"),       new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
        {new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),          new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),     new tileOverworld("Ocean"),  new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"), new tileOverworld("Desert"),    new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("HellScape"), new tileOverworld("Lava"),      new tileOverworld("Lava"),            new tileOverworld("Lava"),            new tileOverworld("HellScape"),       new tileOverworld("HellScape"),     new tileOverworld("HellScape"),         new tileOverworld("HellScape"),       new tileOverworld("HellScape"),       new tileOverworld("HellScape")},
    };


    public tileDungeonIce[][][] dungeonIce = {
        { //Floor 1
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")}
        },
        { //Floor 2
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")}
        },
        { //Floor 3
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")},
            {new tileDungeonIce("Default"), new tileDungeonIce("Default"), new tileDungeonIce("Default")}
        },
    };

    public tileDungeonFire[][][] dungeonFire = {
        { //Floor 1
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 2
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 3
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        }
    };

    public tileDungeonOcean[][][] dungeonOcean = {
        { //Floor 1
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 2
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 3
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        }
    };

    public tileDungeonPoison[][][] dungeonPoison = {
        { //Floor 1
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 2
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 3
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        }
    };

    public tileDungeonFinal[][][] dungeonFinal = {
        { //Floor 1
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 2
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        },
        { //Floor 3
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        }
    };
}