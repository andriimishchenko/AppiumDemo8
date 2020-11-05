import org.openqa.selenium.Dimension;

public class ScreenResolutionTesting extends DriverInit{
    public void getResolution(){
    Dimension dimensions = ad.manage().window().getSize();
    int screenWidth = dimensions.getWidth();
    int screenHeight = dimensions.getHeight();
        System.out.println("Width = "+screenWidth);
        System.out.println("Height = "+screenHeight);
    }
    public void setResolution() {
        Dimension dimensions = ad.manage().window().getSize();
        ad.manage().window().setSize(new Dimension(10, 10)); //установить новый размер экрана
    }
}
