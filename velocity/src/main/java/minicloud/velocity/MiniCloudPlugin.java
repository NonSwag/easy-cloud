package minicloud.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Getter;
import org.slf4j.Logger;

@Getter
@Plugin(
        id = "mini-cloud",
        name = "Mini Cloud",
        version = "1.0.0",
        url = "https://thenextlvl.net",
        authors = {"NonSwag"}
)
public class MiniCloudPlugin {
    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public MiniCloudPlugin(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        // server.getEventManager().register(this, new PluginListener());
    }
}
