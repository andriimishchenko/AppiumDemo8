import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class TestingSwipe extends DriverInit{



    public void testingHorizontalSwipe() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElementById("android:id/list");
        Dimension dimension=activeScreen.getSize();

        int vertical=activeScreen.getSize().getHeight()/2;

        Double startSwipe=dimension.getWidth()*0.9;
        int HorizontalStart=startSwipe.intValue();

        Double endSwipe=dimension.getWidth()*0.1;
        int HorizontalEnd=endSwipe.intValue();

        new TouchAction(ad)
                .press(PointOption.point(HorizontalStart, vertical))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(HorizontalEnd, vertical))
                .release().perform();

        Thread.sleep(3000);
    }

    public void testingVerticalSwipe() throws InterruptedException {
        MobileElement activeScreen = (MobileElement) ad.findElementById("android:id/list");
        Dimension dimension=activeScreen.getSize();

        int vertical=activeScreen.getSize().getWidth()/2;

        Double startSwipe=dimension.getHeight()*0.5;
        int HorizontalStart=startSwipe.intValue();

        Double endSwipe=dimension.getHeight()*0.2;
        int HorizontalEnd=endSwipe.intValue();

        new TouchAction(ad)
                .press(PointOption.point(vertical, HorizontalStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(vertical, HorizontalEnd))
                .release().perform();

        Thread.sleep(3000);
    }

    public void testingSwipeToElement() throws InterruptedException {
        Dimension dimension=ad.manage().window().getSize();
        while (ad.findElements(By.xpath("//*[@text='Back In Black']")).size()==0){

            Double startSwipe=dimension.getHeight()*0.5;
            int HorizontalStart=startSwipe.intValue();

            Double endSwipe=dimension.getHeight()*0.2;
            int HorizontalEnd=endSwipe.intValue();

            new TouchAction(ad)
                    .press(PointOption.point(0, HorizontalStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(0, HorizontalEnd))
                    .release().perform();

        }
        Thread.sleep(3000);
    }

    public void scrollToElement() throws InterruptedException {
        MobileElement element = (MobileElement) ad.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Back In Black\"))"));
        element.click();
        Thread.sleep(3000);
    }
}
