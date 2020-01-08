package br.ce.wcaquino.test;
import static br.ce.wcaquino.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.page.CampoTreinamentoPage;

public class TesteCadastro extends BaseTest {
	
	private CampoTreinamentoPage page;

	@Before
	public void inicializa(){
		getDriver("chrome").get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinamentoPage();
	}

	@Test
	public void deveRealizarCadastroComSucesso(){
		page.setNome("Jeferson");
		page.setSobrenome("Lopes");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();
		
		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Jeferson", page.obterNomeCadastro());
		Assert.assertEquals("Lopes", page.obterSobrenomeCadastro());
		Assert.assertEquals("Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Pizza", page.obterComidaCadastro());
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
		Assert.assertEquals("Natacao", page.obterEsportesCadastro());
	}
}
