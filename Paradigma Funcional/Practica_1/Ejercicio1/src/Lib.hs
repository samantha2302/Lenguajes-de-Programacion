module Main (main) where

contiene prefijo frase=
    if length frase < length prefijo 
        then
            False
    else if (prefijo == take (length prefijo) frase) 
        then
            True
    else
        contiene prefijo (tail frase)


sub_Cadenas elem frase =
    filter (contiene elem) frase


main :: IO ()
main = do
    print(sub_Cadenas "la" ["la casa", "el perro", "pintando la cerca"])