package com.freetsinghua.simplejavaapp.common;

import com.freetsinghua.simplejavaapp.stock.model.Fish;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author octopus
 */
public final class FakeDatas {

    private static final HashMap<String, List<Fish>> FISH_POOL = new HashMap<>();

    private static final String FISH_SHARK = "SHARK";
    private static final String FISH_SWORDFISH = "SWORDFISH";

    static {
        FISH_POOL.put(FISH_SHARK, new LinkedList<>());
        FISH_POOL.get(FISH_SHARK).add(new Fish(getId(), FISH_SHARK, 1.0f, "baby shake"));
        FISH_POOL.get(FISH_SHARK).add(new Fish(getId(), FISH_SHARK, 4.0f, "middle shake"));
        FISH_POOL.get(FISH_SHARK).add(new Fish(getId(), FISH_SHARK, 10.0f, "big shake"));
        FISH_POOL.get(FISH_SHARK).add(new Fish(getId(), FISH_SHARK, 20.0f, "huge shake"));

        FISH_POOL.put(FISH_SWORDFISH, new LinkedList<>());
        FISH_POOL
                .get(FISH_SWORDFISH)
                .add(new Fish(getId(), FISH_SWORDFISH, 0.1f, "litter swordfish"));
        FISH_POOL
                .get(FISH_SWORDFISH)
                .add(new Fish(getId(), FISH_SWORDFISH, 0.2f, "middle swordfish"));
        FISH_POOL.get(FISH_SWORDFISH).add(new Fish(getId(), FISH_SWORDFISH, 0.5f, "big swordfish"));
        FISH_POOL
                .get(FISH_SWORDFISH)
                .add(new Fish(getId(), FISH_SWORDFISH, 1.0f, "huge swordfish"));
    }

    @NotNull
    private static String getId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static List<Fish> getSomeFish(final String name) {
        return FISH_POOL.getOrDefault(name, new ArrayList<>());
    }
}
