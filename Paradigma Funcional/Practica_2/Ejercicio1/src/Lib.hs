module Main where

import Text.Printf

data Producto = Producto { nombre :: String, descripcion :: String, montoVenta :: Int} deriving Show
                     
reducirLista listaProductos =
    sum listaProductos 

calcularMontoImpuesto impuesto listaProductos =
    map articulos listaProductos 
    where
        articulos prod = (impuesto * fromIntegral (montoVenta prod))

revisarMontosImpuesto rangoPagoImpuestos listaProductos =
    filter articulos listaProductos 
    where
        articulos prod = ((montoVenta prod) >= rangoPagoImpuestos)

calcularMontoVenta listaProductos =
    map articulos listaProductos 
    where
        articulos prod= ((montoVenta prod))

main :: IO ()
main = do
    
    let listaProductos=[
            (Producto "tarjeta madre" "Asus" 54200),
            (Producto "mouse" "alámbrico" 15000),
            (Producto "teclado" "gamer con luces" 30000),
            (Producto "memoria ssd" "2 gb" 65000),
            (Producto "cable video" "display port 1m" 18000),
            (Producto "audifonos" "redrangon" 95000)] -- Articulo agregado
    
    -- 0.13 es el impuesto, y 20000 rango
    let buscarImpuestos = calcularMontoImpuesto 0.13 (revisarMontosImpuesto 20000 listaProductos)
    let reducir1 = reducirLista buscarImpuestos

    let buscarPreciosProducto = calcularMontoVenta listaProductos
    let reducir2 = reducirLista buscarPreciosProducto

    let montoTotal = reducir1 + fromIntegral reducir2
    
    print("")
    putStrLn $ show "Impuestos:" ++ " " ++ show reducir1
    putStrLn $ show "Total sin impuestos:" ++ " " ++ show reducir2
    putStrLn $ show "Total con impuestos:" ++ " " ++ show montoTotal
