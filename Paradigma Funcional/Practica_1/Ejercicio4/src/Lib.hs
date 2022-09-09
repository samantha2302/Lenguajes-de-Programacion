module Main(main) where


mapAplanar :: (k -> z -> z) -> z -> [k] -> z
mapAplanar k z = go 
                where 
                    go [] = z 
                    go (x:xs) = x `k` go xs

aplanar :: [[x]] -> [x] 
aplanar = mapAplanar ++ []

main :: IO ()
main = do 
    print(aplanar [[1, 2], [3, 4, 5, 6]])
