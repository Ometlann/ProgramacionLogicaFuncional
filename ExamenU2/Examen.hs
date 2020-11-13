
principal = dia
dia = do
    putStrLn("Ingresa dia")
    n<-getLine
    if((read n) > 0 && (read n) < 31)
        then do 
        mes
    else do
        putStrLn("Dia Incorrecto")
        dia 

mes = do
 putStrLn("Ingresa Mes")
 n <- getLine
 --Ingresamos mayor a 0 y menor a 13, despues entra a los casos
 --if (read n) > 0 && (read n) <= 13
 if (read n) > 0 && (read n) < 13
     then do 
         case n of 
             "1"->do
                 putStrLn("Eres De Enero y Tiene 31 Dias")
             "2"->do
                 putStrLn("Eres De Febrero y Tiene 28 Dias")
             "3"->do
                 putStrLn("Eres De Marzo y Tiene 31 Dias")
             "4"->do
                 putStrLn("Eres De Abril y Tiene 30 Dias")
             "5"->do
                 putStrLn("Eres De Mayo y Tiene 31 Dias")
             "6"->do
                 putStrLn("Eres de Junio y Tiene 30 Dias")
             "7"->do
                 putStrLn("Eres De Julio y Tiene 31 Dias")
             "8"->do
                 putStrLn("Eres De Agosto y Tiene 31 Dias")
             "9"->do
                 putStrLn("Eres De Septiembre y Tiene 3O Dias")
             "10"->do
                 putStrLn("Eres De Octubre y Tiene 31 Dias")
             "11"->do
                 putStrLn("Eres De Noviembre y Tiene 30 Dias")
             "12"->do
                 putStrLn("Eres De Diciembre y Tiene 31 Dias")
 else do
    putStrLn("No Existe Mes")
    mes
