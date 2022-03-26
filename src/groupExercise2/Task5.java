package groupExercise2;

interface WebDriver{
    void open();
    void close();
    String getTitle();

}

interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Chrome open");
    }

    @Override
    public void close() {
        System.out.println("Chrome close");
    }

    @Override
    public String getTitle() {
       String title="google.com";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to amazon.com");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the webpage");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        String title="google.com";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Facebook");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the webpage");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        String title="yandex.ru";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Yahoo.com");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot of the main webpage");
    }
}
public  class Task5 {
    public static void main(String[] args){
        WebDriver Chrome=new ChromeDriver();
        WebDriver Firefox=new FirefoxDriver();
        WebDriver Safari=new SafariDriver();
        RemoteWebDriver[] array={new ChromeDriver(),new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver browsers : array){
            browsers.open();
            browsers.close();
            browsers.navigate();
            browsers.getScreenshot();

            System.out.println(browsers.getTitle());


        }
    }
}