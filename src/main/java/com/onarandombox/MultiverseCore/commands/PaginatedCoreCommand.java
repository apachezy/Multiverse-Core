/******************************************************************************
 * Multiverse 2 Copyright (c) the Multiverse Team 2011.                       *
 * Multiverse 2 is licensed under the BSD License.                            *
 * For more information please check the README.md file included              *
 * with this project.                                                         *
 ******************************************************************************/

package com.onarandombox.MultiverseCore.commands;

import com.onarandombox.MultiverseCore.MultiverseCore;

public abstract class PaginatedCoreCommand<T> extends PaginatedCommand<T> {
    protected MultiverseCore plugin;

    public PaginatedCoreCommand(MultiverseCore plugin) {
        super(plugin);
        this.plugin = plugin;
    }
}
