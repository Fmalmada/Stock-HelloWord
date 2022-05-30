Feature: Adminstracion Stock
  I want to use this template for my feature file
  
   Scenario: Añadir productos
  	Given Que no hay "Producto A"
  	When Se agregan 4 unidades del "Producto A"
  	Then Quedan 4 unidades del "Producto A"

  Scenario: Se compran 3 unidades de un producto
  	Given Que hay 7 unidades del "Producto A"
  	When Se compran 3 unidades del "Producto A"
  	Then Quedan 4 unidades del "Producto A"
  	
  Scenario: Agrego 5 unidades de un producto
  	Given Que hay 7 unidades del "Producto A"
  	When Se agregan 4 unidades del "Producto A"
  	Then Quedan 11 unidades del "Producto A"
  	
	