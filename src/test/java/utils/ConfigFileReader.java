//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package utils;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private final Properties properties;

    public ConfigFileReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("properties//Configuration.properties"));
            System.out.println(reader);
            this.properties = new Properties();

            try {
                this.properties.load(reader);
                reader.close();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at properties//Configuration.properties");
        }
    }

    public String getChromeDriverPath() {
        String driverPath = this.properties.getProperty("chromeDriverPath");
        if (driverPath != null) {
            return driverPath;
        } else {
            throw new RuntimeException("chromeDriverPath not specified in the Configuration.properties file.");
        }
    }

    public String getFirefoxDriverPath() {
        String driverPath = this.properties.getProperty("firefoxDriverPath");
        if (driverPath != null) {
            return driverPath;
        } else {
            throw new RuntimeException("firefoxDriverPath not specified in the Configuration.properties file.");
        }
    }


    public String getApplicationUrl() {
        String url = this.properties.getProperty("baseUrl");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if (browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if (browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if (browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
        else
            throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if (environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if (environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else
            throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

}
