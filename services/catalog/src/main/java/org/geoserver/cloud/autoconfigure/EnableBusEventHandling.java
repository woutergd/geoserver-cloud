package org.geoserver.cloud.autoconfigure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.geoserver.cloud.catalog.bus.BusDisabledLogger;
import org.geoserver.cloud.catalog.bus.CatalogBusAutoConfiguration;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({CatalogBusAutoConfiguration.class, BusDisabledLogger.class})
public @interface EnableBusEventHandling {}
