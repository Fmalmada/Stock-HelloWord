package ejercicioStock.stock;

import static org.junit.Assert.*;

import EjercicioaAlmacen.Almacen.Stock;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminstracionStockTest{
	
	Stock unStock = new Stock();

	@Given("Que hay {int} unidades del {string}")
	public void que_hay_unidades_del(Integer int1, String string) {
	    unStock.agregarProducto(string, int1);
	}
	
	@When("Se compran {int} unidades del {string}")
	public void se_compran_unidades_del(Integer int1, String string) {
	    unStock.comprar(string, int1);
	}

	@Then("Quedan {int} unidades del {string}")
	public void quedan_unidades_del(Integer int1, String string) {
	   assertEquals(unStock.conseguirUnidades(string),int1);
	}
	
	@When("Se agregan {int} unidades del {string}")
	public void se_agregan_unidades_del(Integer int1, String string) {
	    unStock.agregarUnidades(string, int1);
	}
	
	@Given("Que no hay {string}")
	public void que_no_hay(String string) {
		unStock.agregarProducto(string, 0);
	}


}
