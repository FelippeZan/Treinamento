package test;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import main.BasePage;
import utils.Utils;

public class Teste {
	BasePage bp = new BasePage();
	Utils screenshot = new Utils();

	@Given("^testeBancoRipley - Acessar a tela inicial$")
	public void acessarPagina() {
		bp.abrirPage("http://www.bancoripley.com.pe/bancoripley/home/index.html");
		System.out.println("Acessou o site");
	}

	@When("^testeBancoRipley - Abrir primeira opcao$")
	public void realizarBusca1() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_0");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir primeira opcao");
	}
	
	@When("^testeBancoRipley - Abrir segunda opcao$")
	public void realizarBusca2() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_1");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir segunda opcao");
	}
	
	@When("^testeBancoRipley - Abrir terceira opcao$")
	public void realizarBusca3() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_2");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir terceira opcao");
	}
	
	@When("^testeBancoRipley - Abrir quarta opcao$")
	public void realizarBusca4() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_3");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir quarta opcao");
	}
	
	@When("^testeBancoRipley - Abrir quinta opcao$")
	public void realizarBusca5() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_4");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir quinta opcao");
	}
	
	@When("^testeBancoRipley - Abrir sexta opcao$")
	public void realizarBusca() throws IOException,InterruptedException{
		Thread.sleep(2000);
		bp.hover("m_creditos", "MMMenu0805194703_0_Item_5");
		Thread.sleep(1000);
		screenshot.finaliza();
		System.out.println("Conseguiu abrir sexta opcao");
	}

}
