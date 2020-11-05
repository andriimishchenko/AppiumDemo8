import io.appium.java_client.android.AndroidDriver;

public class DriverInit extends BaseSetup{
    protected AndroidDriver ad;

    protected DriverInit(){
        this.ad=super.getDriver();
    }
}