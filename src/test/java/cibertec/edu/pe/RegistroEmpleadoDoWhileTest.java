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
public class RegistroEmpleadoDoWhileTest {
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
  public void registroEmpleadoDoWhile() {
    // Test name: Registro_Empleado_Do_While
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
    // 6 | executeScript | return 0 | varContador
    vars.put("varContador", js.executeScript("return 0"));
    // 7 | open | http://localhost:8080/SistemaVentas/index.jsp | 
    driver.get("http://localhost:8080/SistemaVentas/index.jsp");
    // 8 | setWindowSize | 1296x696 | 
    driver.manage().window().setSize(new Dimension(1296, 696));
    // 9 | click | name=accion | 
    driver.findElement(By.name("accion")).click();
    // 10 | click | linkText=Empleado | 
    driver.findElement(By.linkText("Empleado")).click();
    // 11 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 12 | do |  | 
    do {
      // 13 | click | name=txtDni | 
      driver.findElement(By.name("txtDni")).click();
      // 14 | type | name=txtDni | ${varDni}
      driver.findElement(By.name("txtDni")).sendKeys(vars.get("varDni").toString());
      // 15 | click | name=txtNombres | 
      driver.findElement(By.name("txtNombres")).click();
      // 16 | type | name=txtNombres | ${varNom}
      driver.findElement(By.name("txtNombres")).sendKeys(vars.get("varNom").toString());
      // 17 | click | name=txtTel | 
      driver.findElement(By.name("txtTel")).click();
      // 18 | type | name=txtTel | ${varTelf}
      driver.findElement(By.name("txtTel")).sendKeys(vars.get("varTelf").toString());
      // 19 | click | name=txtEstado | 
      driver.findElement(By.name("txtEstado")).click();
      // 20 | type | name=txtEstado | ${varEstado}
      driver.findElement(By.name("txtEstado")).sendKeys(vars.get("varEstado").toString());
      // 21 | click | name=txtUser | 
      driver.findElement(By.name("txtUser")).click();
      // 22 | type | name=txtUser | ${varUser}
      driver.findElement(By.name("txtUser")).sendKeys(vars.get("varUser").toString());
      // 23 | click | name=accion | 
      driver.findElement(By.name("accion")).click();
      // 24 | executeScript | return ${varContador} + 1 | varContador
      vars.put("varContador", js.executeScript("return arguments[0] + 1", vars.get("varContador")));
      // 25 | echo | El contador es : ${varContador} | 
     // System.out.println("El contador es : vars.get("varContador").toString()");
      // 26 | repeatIf | ${varContador}<3 | 
    } while ((Boolean) js.executeScript("return (arguments[0]<3)", vars.get("varContador")));
    // 27 | echo | Registro Ok | 
    System.out.println("Registro Ok");
  }
}
