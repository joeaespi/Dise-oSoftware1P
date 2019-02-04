use proyectods;

select * from Producto order by porcentajeBusqueda desc limit 5;

create view todasLasVentas as
select count(idVenta) from venta; 


DELIMITER |
CREATE TRIGGER actualizaPorcentaje AFTER INSERT ON venta
FOR EACH ROW BEGIN
UPDATE venta set porcentajeVenta =  (select count(idVenta) from Venta inner join pedido on idPedido=idPedido inner join  productoxPedido on idPedido =idPedido inner join Producto on idProducto = idProducto where idProducto = idProducto.new ) /todasLasVentas ;
END;
|
DELIMITER ;