package herokuapp.config;

import com.codeborne.selenide.Configuration;

import java.util.HashMap;
import java.util.Map;

public interface Configurations {

    default void selenoidConfig() {
        Configuration.remote = "http://158.160.157.254:4444/wd/hub";
        Map<String, Object> selenoidOptions = new HashMap<>();
        selenoidOptions.put("enableVNC", true);
        selenoidOptions.put("browserName", "chrome");
        selenoidOptions.put("version", "120.0");
        Configuration.browserCapabilities.setCapability("selenoid:options", selenoidOptions);

    }

}