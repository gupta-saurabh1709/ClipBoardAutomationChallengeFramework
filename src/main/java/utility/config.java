package utility;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/main/resources/config.properties")
public interface config extends Config {
    @Key("BROWSER")
    String browser();

    @Key("URL")
    String url();
}
