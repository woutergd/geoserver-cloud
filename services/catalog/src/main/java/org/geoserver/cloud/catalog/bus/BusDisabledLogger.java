package org.geoserver.cloud.catalog.bus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.bus.ConditionalOnBusEnabled;

@Slf4j
@ConditionalOnProperty(
    value = ConditionalOnBusEnabled.SPRING_CLOUD_BUS_ENABLED,
    matchIfMissing = false,
    havingValue = "false"
)
public class BusDisabledLogger {

    public BusDisabledLogger() {
        log.warn("GeoServer Catalog and configuration event-bus is disabled");
    }
}
