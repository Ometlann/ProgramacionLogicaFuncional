
main = do
    pregunta True

pregunta seguir = do
    if seguir
        then do
        putStrLn "1.- Suma"
        putStrLn "2.- Resta"
        putStrLn "3.- Multiplicacion"
        putStrLn "4.- Division"
        putStrLn "6.- Salir"

        case opcion of
            "1" -> suma
            "2" -> resta
            "3" -> multiplicacion
            "4" -> division
            "5" -> pregunta 
    else
        putStrLn"Adios"

suma = do
    putStrLn("Dame Numero 1: ")
    a <- getLine
    putStrLn("Dame Numero 2: ")
    b <- getLine
    putStrLn("El Resultado es: "++show(suma (read a)(read b)))

