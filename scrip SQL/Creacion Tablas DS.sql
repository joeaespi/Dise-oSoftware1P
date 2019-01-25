create database proyectoDS;
use proyectoDS;

drop table if exists telefono;
create table telefono(
idTelefono int(5),
numeroTelefono varchar(10),
primary key(idTelefono)
);

drop table if exists correo;
create table correo(
idCorreo int(5),
correoElectronico varchar(30),
primary key(idCorreo)
);

drop table if exists direccion;
create table direccion(
idDireccion int(5),
direccionPersona varchar(100),
primary key(idDireccion)
);

drop table if exists comprador;
create table comprador(
nombre varchar(50),
apellido varchar(50),
cedula varchar(15),
matricula int(9),
idComprador int(5),
primary key (idComprador)
);

drop table if exists vendedor;
create table vendedor(
nombre varchar(50),
apellido varchar(50),
cedula varchar(15),
matricula int(9),
idVendedor int(5),
calificacionPromedio float(4),
primary key (idVendedor)
);

drop table if exists administrador;
create table administrador(
nombre varchar(50),
apellido varchar(50),
cedula varchar(15),
matricula int(9),
idAdministrador int(5),
primary key (idAdministrador)
);

drop table if exists producto;
create table producto(
nombre varchar(50),
categoria varchar(50),
precio float(5),
tiempoMaximoEntrega float(2),
calificacionPromedio float(4),
porcentajeBusqueda float(3),
idProducto int(4),
primary key (idProducto)
);

drop table if exists pedido;
create table pedido(
estado varchar(10),
costoTotal float(5),
FechaPedido date,
idComprador int(5),
idVendedor int(5),
idPedido int(4),
primary key (idPedido),
FOREIGN KEY(idVendedor) references vendedor(idVendedor),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists formaPago;
create table formaPago(
idFormaPago int(5),
formaPago varchar(50),
primary key(idFormaPago)
);

drop table if exists venta;
create table venta(
idVenta int(5),
idFormaPago int(5),
idPedido int(4),
calificacionVenta int(4),
fechaRecibido date,
primary key (idVenta),
FOREIGN KEY(idFormaPago) references formaPago(idFormaPago),
FOREIGN KEY(idPedido) references pedido(idPedido)
);

drop table if exists compradorXtelefono;
create table compradorXtelefono(
idTelefono int(5),
idComprador int(5),
FOREIGN KEY(idTelefono) references telefono(idTelefono),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists vendedorXtelefono;
create table vendedorXtelefono(
idTelefono int(5),
idVendedor int(5),
FOREIGN KEY(idTelefono) references telefono(idTelefono),
FOREIGN KEY(idVendedor) references vendedor(idVendedor)
);

drop table if exists administradorXtelefono;
create table administradorXtelefono(
idTelefono int(5),
idAdministrador int(5),
FOREIGN KEY(idTelefono) references telefono(idTelefono),
FOREIGN KEY(idAdministrador) references administrador(idAdministrador)
);

drop table if exists compradorXcorreo;
create table compradorXcorreo(
idCorreo int(5),
idComprador int(5),
FOREIGN KEY(idCorreo) references correo(idCorreo),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists vendedorXcorreo;
create table vendedorXcorreo(
idCorreo int(5),
idVendedor int(5),
FOREIGN KEY(idCorreo) references correo(idCorreo),
FOREIGN KEY(idVendedor) references vendedor(idVendedor)
);


drop table if exists administradorXcorreo;
create table administradorXcorreo(
idCorreo int(5),
idAdministrador int(5),
FOREIGN KEY(idCorreo) references correo(idCorreo),
FOREIGN KEY(idAdministrador) references administrador(idAdministrador)
);

drop table if exists compradorXdireccion;
create table compradorXdireccion(
idDireccion int(5),
idComprador int(5),
FOREIGN KEY(idDireccion) references direccion(idDireccion),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists vendedorXdireccion;
create table vendedorXdireccion(
idDireccion int(5),
idVendedor int(5),
FOREIGN KEY(idDireccion) references direccion(idDireccion),
FOREIGN KEY(idVendedor) references vendedor(idVendedor)
);

drop table if exists administradorXdireccion;
create table administradorXdireccion(
idDireccion int(5),
idAdministrador int(5),
FOREIGN KEY(idDireccion) references direccion(idDireccion),
FOREIGN KEY(idAdministrador) references administrador(idAdministrador)
);

drop table if exists compradorXformaPago;
create table compradorXformaPago(
idFormaPago int(5),
montoDisponible int(5),
idComprador int(5),
FOREIGN KEY(idFormaPago) references formaPago(idFormaPago),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists productoXcomprador;
create table productoXcomprador(
idComprador int(5),
idProducto int(5),
FOREIGN KEY(idProducto) references producto(idProducto),
FOREIGN KEY(idComprador) references comprador(idComprador)
);

drop table if exists productoXvendedor;
create table productoXvendedor(
idVendedor int(5),
idProducto int(5),
FOREIGN KEY(idProducto) references producto(idProducto),
FOREIGN KEY(idVendedor) references vendedor(idVendedor)
);

drop table if exists productoXpedido;
create table productoXpedido(
idPedido int(5),
idProducto int(5),
FOREIGN KEY(idProducto) references producto(idProducto),
FOREIGN KEY(idPedido) references pedido(idPedido)
);
