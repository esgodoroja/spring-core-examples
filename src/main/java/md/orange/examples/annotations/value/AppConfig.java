package md.orange.examples.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import sun.misc.Contended;

@Contended
@ComponentScan("md.orange.examples.annotations.value")
public class AppConfig {


  @Bean
  public DefaultValues getDefaultValues() {
    return new DefaultValues();
  }

  public class DefaultValues {

    @Value("DB Connection")
    private String defaultString;

    @Value("true")
    private boolean defaultBoolean;

    @Value("10")
    private int defaultInt;

    @Value("${APP_NAME_NOT_FOUND}")
    private String defaultAppName;

    @Value("${java.home}")
    private String javaHome;

    @Value("${HOME}")
    private String homeDir;

    @Override
    public String toString() {
      return "DefaultValues{" +
          "defaultString=" + defaultString +
          ", defaultBoolean=" + defaultBoolean +
          ", defaultInt=" + defaultInt +
          ", defaultAppName='" + defaultAppName + '\'' +
          ", javaHome='" + javaHome + '\'' +
          ", homeDir='" + homeDir + '\'' +
          '}';
    }
  }

}
