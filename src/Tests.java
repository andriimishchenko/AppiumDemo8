import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestingTestNGListeners.class)
public class Tests extends DriverInit {
    @Test
    public void swipe() throws InterruptedException {
//        TestingSwipe ts = new TestingSwipe();
//        //ts.testingHorizontalSwipe();
//        //ts.testingVerticalSwipe();
//        //ts.testingSwipeToElement();
//        ts.scrollToElement();
        Gesty ts = new Gesty();
        ts.gesty();

//        RotationTesting rt=new RotationTesting();
//        rt.landscapeMode();
        //ScreenResolutionTesting sr=new ScreenResolutionTesting();
        //sr.getResolution();

    }
}
