package tnr.junitmetalink;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;
import java.util.concurrent.TimeUnit;

public class AnimatedMenuTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp(){
    }

    @TFMetadata(key = "linked-TC", value = "afcee4b8-d990-4644-9cbc-99b92dee4e12")
    @DisplayName("MenuTestimonials")
    @Test
    public void testMenuTestimonials(){
        System.out.println("SUCCESS");
        int a = 1;
        int b = 2;
        Assertions.assertTrue(true, "Le calcul est faux");
    }

    @TFMetadata(key = "linked-TC", value = "141714ad-e3cc-463b-bddb-df7231958630")
    @DisplayName("MenuBlog")
    @Test
    public void testMenuBlog(){
        System.out.println("FAILURE");
        int a = 1;
        int b = 2;
        Assertions.assertTrue((a+b)==2, "Le calcul est faux");
    }
	
    @AfterEach
    public void tearDown(){
        
    }
}
