principal = do
    putStrLn("1.Fibonacci\n2.Factorial\n3.Palindromo\n4.Calculadora\n5.Salir\n¿Que Opcion Deseas?")
    n<-getLine
    casos n

casos n = do
    case n of
        "1"->fibonacci 1
        "2"->factorial 2
        "3"->palindromo 3
        "4"->calcu 4
        "5"->print("Salir")
        _ ->print("Opcion No Disponible")

fibonacci n = do
    putStr("Ingresa Posicion")
    a<-getLine
    let aInt = (read a)
    fibonacci 0 = 0
    fibonacci 1 = 1
    fibonacci a = fibonacci(a-1)+fibonacci(a-2)
    principal

factorial n = do
    putStrLn("Digita Numero: ")
    a<-getLine
    let aInt = (read a)
    factorial 0 = 1
    factorial a = factorial(a-1)*a
    principal

palindromo n = do
    palindromo [] = True
    palindromo [x]= True
    palindromo (x:xs) = reverse (x:xs) == (x:xs)
    principal

calcu = do
    main = do
    putStrLn ("Que opcion quieres: ")
    n <- getLine
    casos n

casos n = do
    case n of
        "1" -> suma 1
        "2" -> resta 2
        "3" -> multiplicacion 3
        "4" -> divicion 4
        "5" -> print ("Salir")

suma n = do
    putStrLn ("Ingresa el numero1: ")
    a <- getLine
    putStrLn ("Ingresa el numero 2:")
    b <- getLine

    let aInt = (read a)
    let bInt = (read b)
    let resultado = aInt + bInt

    putStrLn("El resultado es: "++show resultado) 
    main

resta n = do
    putStrLn ("Ingresa el numero1: ")
    a <- getLine
    putStrLn ("Ingresa el numero 2:")
    b <- getLine

    let aInt = (read a)
    let bInt = (read b)
    let resultado = aInt - bInt

    putStrLn("El resultado es: "++show resultado) 
    main

multiplicacion n= do
    putStrLn ("Ingresa el numero1: ")
    a <- getLine
    putStrLn ("Ingresa el numero 2:")
    b <- getLine

    let aInt = (read a)
    let bInt = (read b)
    let resultado = aInt * bInt

    putStrLn("El resultado es: "++show resultado) 
    main

divicion n = do
    putStrLn ("Ingresa el numero1: ")
    a <- getLine
    putStrLn ("Ingresa el numero 2:")
    b <- getLine

    let aInt = (read a)
    let bInt = (read b)
    let resultado = div aInt  bInt

    putStrLn("El resultado es: "++show resultado) 
    main
