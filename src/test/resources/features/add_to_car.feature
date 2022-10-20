# language: es
Característica: Add to car
  Como usuario web
  Quiero agregar productos al carro de compras
  Para comprar

  Escenario: Ingresar login mediante el correo
    Cuando "Rodolfo" quiere ingresar al login
    Entonces debe abrir sesion

  Escenario: Agregar un producto y modificar la cantidad
    Cuando "Rodolfo" quiere agregar un producto de la categoria "TV" y modificar el carrito para tener 2 de cantidad de un mismo producto
    Entonces debe ver la alerta "La cantidad del producto ha sido actualizada."

  Escenario: Ir al apartado para registrar un seguro de accidente personal
    Cuando "Rodolfo" quiere registrar un "Seguro accidentes personales"
    Entonces debe ver la pagina con el boton de "Registra tu seguro"