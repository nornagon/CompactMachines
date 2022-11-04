package dev.compactmods.machines;

import dev.compactmods.machines.core.LoggingUtil;
import org.apache.logging.log4j.Logger;

public interface ICompactMachinesMod {
    /**
     * @deprecated Use {@link LoggingUtil#modLog} instead
     */
    @Deprecated(forRemoval = true)
    Logger LOGGER = LoggingUtil.modLog();
}
