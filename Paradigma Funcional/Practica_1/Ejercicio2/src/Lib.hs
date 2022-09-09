module Main (main) where

-- Ejercicio 2 - Samantha Acunna Montero

{- Construya una función que se llame sub_conjunto. Esta función recibe dos listas y debe retornar 
True cuando el primer argumento es subconjunto completo del segundo y #f en caso contrario. 
Por ejemplo:
    sub_conjunto [] [1,2,3,4,5]
    True
    sub_conjunto [1,2,3] [1,2,3,4,5]
    True
    sub_conjunto [1,2,6] [1,2,3,4,5]
    False -}

subConjunto :: (Eq a) => [a] -> [a] -> Bool 
subConjunto (x:xs) (y:ys) -- Primera lista, x= cabeza  xs = cola y segunda lista, y = cabeza ys = cola
    | x == y = subConjunto xs ys -- Compara las cabezas de las listas 
    | otherwise = subConjunto (x:xs) ys -- 
subConjunto [] [] = True
subConjunto [] _ = True
subConjunto _ [] = False


main :: IO ()
main = do 
    
    print(subConjunto [1,2,3] [1,2,3,4,5])
    print(subConjunto [1,2,6] [1,2,3,4,5])
    print(subConjunto [3,2,6] [1,2,3,4,5])
    print(subConjunto [] [1,2,3,4,5])
