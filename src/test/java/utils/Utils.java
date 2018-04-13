package utils;

import static main.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import main.Propriedades;
import main.DriverFactory;

public class Utils {

	@Rule
	public TestName testName = new TestName();

	public void finaliza() throws IOException {
		TakesScreenshot print = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = print.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + "Screenshot" + System.currentTimeMillis() + ".jpg"));
		
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
	
}