import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {

    private static AndroidDriver ad=null;

    private String port="4723";
    private String server="127.0.0.1";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        initDriver();
    }

    public AndroidDriver getDriver(){
        return ad;
    }

    private void initDriver()throws MalformedURLException {
        DesiredCapabilities ds=new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        ds.setCapability("platformName","android");
        ds.setCapability("app","D:\\PROJECTS\\Android\\Painter\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
        //ds.setCapability("appPackage","com.songsterr");
        //ds.setCapability("appActivity","com.songsterr.main.MainActivity");
        ds.setCapability("noReset",true );
        String url="http://"+server+":"+port+"/wd/hub";

        try{
            System.out.println("Initialised driver with url: "+url);
            ad = new AndroidDriver(new URL(url), ds);
        }
        catch (NullPointerException|MalformedURLException ex){
            throw new RuntimeException("Appium driver could not initialised");
        }System.out.println("Could not init driver: "+ad);

    }
//    @AfterClass
//    public void tearDown(){
//        ad.quit();
//    }
}
