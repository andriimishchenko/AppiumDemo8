import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;

public class RotationTesting extends DriverInit{
    public void landscapeMode(){
        ad.rotate(ScreenOrientation.LANDSCAPE); 		// установить landscape мод
        ScreenOrientation orientation = ad.getOrientation(); 	// получить текущий мод
        Assert.assertEquals(orientation.value(),"landscape"); 	// проверить, что текущий мод landscape
    }

}
