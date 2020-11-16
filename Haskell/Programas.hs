principal = do
    putStrLn("1.Factorial \n2.Numero1-10 \n3.Palindromo \n4.Calculadora \n5.Salir \n¿Que Opcion Deseas?")
    n<-getLine
    casos(read n)

casos n = do
    case n of
        1 -> factorial
        2 -> numUnoDiez 1
        3 -> palindromo
        4 -> calculadora
        5 -> print("Salir")
        _ -> print("Opcion No Valida")

factorial = do
    print("Factorial De: ")
    n<-getLine
    print(product[1..(read n)])
    principal

numUnoDiez n = do
  if n<= 10
    then do 
    print n
    numUnoDiez (n+1)
  else 
     principal

palindromo = do 
 print("Ingresa Cadena: ")
 n<-getLine
 if n == reverse n
  then do 
   print("Es Palindromo")
  else 
   print("No Es Palindromo")
 principal

calculadora = do
  print("1 Suma")
  print("2 Resta")
  print("3 Multiplicacion")
  print("4 Division")
  print("5. Menu Principal ")
  n<-getLine
  calc(read n)

calc n = do
    case n of
     1 -> suma
     2 -> resta
     3 -> multiplicacion
     4 -> division
     5 -> principal

suma = do
 putStrLn ("Ingresa Numero 1")
 a <-getLine
 putStrLn ("Ingresa Numero 2")
 b <-getLine 
 let aInt = (read a)
 let bInt = (read b)
 let resultado = aInt + bInt
 putStrLn("La Suma Es: "++show resultado) 
 calculadora

resta = do
 putStrLn ("Ingresa Numero 1:")
 a <-getLine
 putStrLn ("Ingresa Numero 2:")
 b <-getLine 
 let aInt = (read a)
 let bInt = (read b)
 let resultado = aInt - bInt
 putStrLn("La Resta Es: "++show resultado) 
 calculadora


multiplicacion = do
 putStrLn ("Ingresa Numero 1:")
 a <-getLine
 putStrLn ("Ingresa Numero 2:")
 b <-getLine
 let aInt = (read a)
 let bInt = (read b)
 let resultado = aInt * bInt
 putStrLn("La Multiplicacion Es: "++show resultado) 
 calculadora

division = do
 putStrLn ("Ingresa Numero 1:")
 a<-getLine
 putStrLn ("Ingresa Numero 2:")
 b<-getLine 
 let aInt = (read a)
 let bInt = (read b)
 let resultado = aInt / bInt
 putStrLn("La division Es: "++show resultado) 
 calculadora
