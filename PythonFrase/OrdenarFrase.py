
FraseCorrecta = ['Mi', 'Nombre', 'Es', 'Edgar', 'Rosales', 'Perez', 'De', 'Septimo', 'Semestre']
FraseDesordenada = []
FraseOrdenada = []

#Archivo = open('Desktop\FraseDescompuesta.txt') Ruta en Windows
Archivo = open('/home/ometlann/Escritorio/FraseDescompuesta') # Ruta En Linux

for i in Archivo.readlines():
    FraseDesordenada.append(i) 
print('Frase Desordenada:{}'.format(FraseDesordenada)) 

for item in FraseCorrecta:
    for item2 in FraseDesordenada:
        if item in item2:
            FraseOrdenada.append(item)
print('Frase Ordenada: {}'.format(FraseOrdenada))
