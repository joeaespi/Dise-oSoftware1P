-- inseertando datos en la BD
use proyectoDS;

insert into comprador (nombre,apellido,cedula,matricula,idComprador) values ("Steve", "Rogers","0978687832","201709922",1);
insert into telefono values (1,0999108666);
insert into correo values(1, "correoSteve@gmail.com");
insert into direccion values(1,"Calle Steve,123");
insert into compradorxcorreo values (1,1);
insert into compradorxtelefono values (1,1);
insert into compradorxdireccion values (1,1);

insert into comprador (nombre,apellido,cedula,matricula,idComprador) values ("Antonio", "Stark","0938284532","201623128",2);
insert into telefono values (2,0839148656);
insert into correo values(2, "correoAntonio@gmail.com");
insert into direccion values(2,"Calle Antonio,123");
insert into compradorxcorreo values (2,2);
insert into compradorxtelefono values (2,2);
insert into compradorxdireccion values (2,2);

insert into comprador (nombre,apellido,cedula,matricula,idComprador) values ("Natasha", "Romanof","0875627211","201734772",3);
insert into telefono values (3,0596108687);
insert into correo values(3, "correoNathasha@gmail.com");
insert into direccion values(3,"Calle Nathasha,123");
insert into compradorxcorreo values (3,3);
insert into compradorxtelefono values (3,3);
insert into compradorxdireccion values (3,3);


insert into vendedor (nombre,apellido,cedula,matricula,idVendedor,calificacionPromedio) values ("Baron", "Simons","0912887573","2016271456",1,0);
insert into telefono values (4,0561446487);
insert into correo values(4, "correoBaron@gmail.com");
insert into direccion values(4,"Calle Baron,123");
insert into vendedorxcorreo values (4,1);
insert into vendedorxtelefono values (4,1);
insert into vendedorxdireccion values (4,1);

insert into vendedor(nombre,apellido,cedula,matricula,idVendedor,calificacionPromedio) values ("Erick", "Lengue","0922387576","201672281",2,0);
insert into telefono values (5,0597548665);
insert into correo values(5, "correoErick@gmail.com");
insert into direccion values(5,"Calle Erick,123");
insert into vendedorxcorreo values (5,2);
insert into vendedorxtelefono values (5,2);
insert into vendedorxdireccion values (5,2);

insert into vendedor (nombre,apellido,cedula,matricula,idVendedor,calificacionPromedio) values ("Pietro", "Maximo","0819384756","201621232",3,0);
insert into telefono values (6,0626358687);
insert into correo values(6, "correoPietro@gmail.com");
insert into direccion values(6,"Calle Pietro,123");
insert into vendedorxcorreo values (6,3);
insert into vendedorxtelefono values (6,3);
insert into vendedorxdireccion values (6,3);


insert into administrador (nombre,apellido,cedula,matricula,idAdministrador) values ("Nick", "Fury","0942887472","201523727",1);
insert into telefono values (7,078310863);
insert into correo values(7, "correoNick@gmail.com");
insert into direccion values(7,"Calle Nick,123");
insert into vendedorxcorreo values (7,1);
insert into vendedorxtelefono values (7,1);
insert into vendedorxdireccion values (7,1);

insert into administrador (nombre,apellido,cedula,matricula,idAdministrador) values ("Carol", "Damber","0942887579","201627892",2);
insert into telefono values (8,036143659);
insert into correo values(8, "correoCarol@gmail.com");
insert into direccion values(8,"Calle Carol,123");
insert into vendedorxcorreo values (8,2);
insert into vendedorxtelefono values (8,2);
insert into vendedorxdireccion values (8,2);

insert into producto (nombre,descripcion,categoria,precio,tiempoMaximoEntrega,calificacionPromedio,porcentajeBusqueda,idProducto) values ("SuperPack Fisica 1","Cuaderno de ejercicios de la materia fisica 1 1 parcial","Folletos",5.00,24,0,100,1);
insert into producto (nombre,descripcion,categoria,precio,tiempoMaximoEntrega,calificacionPromedio,porcentajeBusqueda,idProducto) values ("Pluma Azul","boligrafo azul punta gruesa","Utilitarios",0.25,24,0,100,2);
insert into producto (nombre,descripcion,categoria,precio,tiempoMaximoEntrega,calificacionPromedio,porcentajeBusqueda,idProducto) values ("Pendrive 4 gigas","Dispositivo usb","Utilitarios",3.25,24,0,100,3);

insert into formapago (idFormaPago,formaPago) values (1,"efectivo");
insert into formapago (idFormaPago,formaPago) values (2,"tajeta");

insert into productoxvendedor values (1,1);
insert into productoxvendedor values (2,2);
insert into productoxvendedor values (3,3);

insert into pedido (estado,costoTotal,FechaPedido,idComprador,idVendedor,idPedido) values ("pendiente",5.50,now(),1,1,1);
insert into pedido (estado,costoTotal,FechaPedido,idComprador,idVendedor,idPedido) values ("enviado",0.30,now(),2,2,2);

insert into productoxpedido values (1,1);
insert into productoxpedido values (2,3);

insert into venta (idVenta,idFormaPago,idPedido,calificacionVenta,fechaRecibido) values (1,1,2,5,now());
