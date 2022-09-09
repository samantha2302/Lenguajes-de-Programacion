module Main (main) where

-- Ejercicio 3 - Samantha Acunna Montero

{-Implemente la función aplanar. Esta función recibe una lista con múltiples listas anidadas como elementos y devuelve 
una lista con los mismos elementos de manera lineal (sin listas). Ej: 
    aplanar ‘(1 2 (3 (4 5) (6 7))))
    (1 2 3 4 5 6 7)
Nota: En el caso de que una lista de listas a muchos niveles represente un reto complejo puede considerar al menos 
que haya listas de listas a un nivel y no más profundo. -}

aplanar :: [[x]] -> [x] 
aplanar [] = []
aplanar (x:xs) = x ++ concat xs


main :: IO ()
main = do
    print(aplanar [[1, 2], [3, 4, 5, 6]])