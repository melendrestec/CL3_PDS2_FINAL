package cibertec.edu.pe;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegistroEmpleado1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registroEmpleado1() {
    // Test name: Registro_Empleado_1
    // Step # | name | target | value
    // 1 | store | 98765432 | varDni
    vars.put("varDni", "98765432");
    // 2 | store | Sebastian Lizarzaburu | varNom
    vars.put("varNom", "Sebastian Lizarzaburu");
    // 3 | store | 987654321 | varTelf
    vars.put("varTelf", "987654321");
    // 4 | store | 1 | varEstado
    vars.put("varEstado", "1");
    // 5 | store | Emp2 | varUser
    vars.put("varUser", "Emp2");
    // 6 | open | http://localhost:8080/SistemaVentas/index.jsp | 
    driver.get("http://localhost:8080/SistemaVentas/index.jsp");
    // 7 | setWindowSize | 1296x696 | 
    driver.manage().window().setSize(new Dimension(1296, 696));
    // 8 | click | name=accion | 
    driver.findElement(By.name("accion")).click();
    // 9 | click | linkText=Empleado | 
    driver.findElement(By.linkText("Empleado")).click();
    // 10 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 11 | click | name=txtDni | 
    driver.findElement(By.name("txtDni")).click();
    // 12 | type | name=txtDni | ${varDni}
    driver.findElement(By.name("txtDni")).sendKeys(vars.get("varDni").toString());
    // 13 | click | name=txtNombres | 
    driver.findElement(By.name("txtNombres")).click();
    // 14 | type | name=txtNombres | ${varNom}
    driver.findElement(By.name("txtNombres")).sendKeys(vars.get("varNom").toString());
    // 15 | click | name=txtTel | 
    driver.findElement(By.name("txtTel")).click();
    // 16 | type | name=txtTel | ${varTelf}
    driver.findElement(By.name("txtTel")).sendKeys(vars.get("varTelf").toString());
    // 17 | click | name=txtEstado | 
    driver.findElement(By.name("txtEstado")).click();
    // 18 | type | name=txtEstado | ${varEstado}
    driver.findElement(By.name("txtEstado")).sendKeys(vars.get("varEstado").toString());
    // 19 | click | name=txtUser | 
    driver.findElement(By.name("txtUser")).click();
    // 20 | type | name=txtUser | ${varUser}
    driver.findElement(By.name("txtUser")).sendKeys(vars.get("varUser").toString());
    // 21 | click | name=accion | 
    driver.findElement(By.name("accion")).click();
    // 22 | echo | Registro Ok | 
    System.out.println("Registro Ok");
  }
}