import io.appium.java_client.TouchAction;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Gesty extends DriverInit{
    public void gesty(){
        TouchAction t = new TouchAction (ad);
        TouchAction dragNDrop = new TouchAction(ad)
                .longPress(longPressOptions()
                        .withPosition(point(153, 388))
                        .withDuration(ofSeconds(1)))
                .moveTo(point(900, 1600))
                .release();
        dragNDrop.perform();

    }
}
