package in.twizmwaz.cardinal.module.modules.bossBar;

import in.twizmwaz.cardinal.match.Match;
import in.twizmwaz.cardinal.module.ModuleBuilder;
import in.twizmwaz.cardinal.module.ModuleCollection;

public class BossBarBuilder implements ModuleBuilder {
    @Override
    public ModuleCollection<BossBar> load(Match match) {
        return new ModuleCollection<>(new BossBar());
    }
}
