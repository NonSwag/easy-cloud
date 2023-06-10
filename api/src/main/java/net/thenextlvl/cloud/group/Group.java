package net.thenextlvl.cloud.group;

import net.thenextlvl.cloud.object.IdentifiableObject;
import net.thenextlvl.cloud.server.Server;

import java.util.Collection;

public interface Group extends IdentifiableObject {
    /**
     * Get a lis of all servers associated with this group
     *
     * @return all servers associated with this group
     */
    Collection<? extends Server> getServers();

    /**
     * Get if the group contains any servers
     *
     * @return whether the group contains servers
     */
    boolean isEmpty();
}
