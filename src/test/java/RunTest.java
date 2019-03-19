import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTest extends StartTest
{

    @Before
    public void start()
    {
        one();
    }

    @Test

    // Входим на сайт еbay
    public void FirstTest () throws InterruptedException
    {
        click("//*[@id=\"gh-ug\"]/a");
        send("//*[@id=\"userid\"]", "lookironic@gmail.com");
        send("//*[@id=\"pass\"]", "AutomationT3sts");
        click("//*[@id=\"sgnBt\"]");
        send( "//*[@id=\"gh-ac\"]", "samsung" );
        click("//*[@id=\"gh-btn\"]");
        compare( "//*[@id=\"srp-river-results\"]/ul/li", "//*[@id=\"srp-river-results-SEARCH_PAGINATION_MODEL_V2-w1\"]/button/div/span");
        doubleSearch("//*[@id=\"srp-river-results\"]/ul/li", "//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3", "Samsung");
        click("//*[@id=\"gh-ug\"]");
        click("//*[@id=\"gh-uo\"]/a");
        secondCompare("//*[@id=\"AreaTitle\"]/div/table/tbody/tr/td/div/div[2]/div/h1/span", "Выход успешно выполнен");
    }

    @After
    public void endl()
    {
        close();
    }
}