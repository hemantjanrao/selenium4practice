package com.hjanrao.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:general.properties",
})
public interface Configuration extends Config {

    @Key("target")
    String target();

    @Key("url.base")
    String url();

    @Key("browser")
    String browser();
}
