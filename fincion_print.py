#print tiene 4 formas de uso
"""
1.- con comas
2.- consigno ´+´
3.- con la  funcion  format ()
4.- es con una variante de format ()
"""
# con comas , concatenar agregando
# un espacio y haciendo casting de tipo 
edad = 10
nombre = "rafael"
estatura = 1.78
print(edad , estatura , nombre)
# con ´+´hace lo mismo pero no
# realiza el casting automatico
#no agrega espacio
print(str(edad)+ str(estatura) +nombre)
# funcion forma ()
print("nombre : {} edad : {}".format(nombre , edad))
#la forma 4 es con una variante de format simplificada
print(f"nombre: \"{nombre}\"edad :\t{edad}")
#print y el argumento end
print("solo hay 10 tipo de personas, las que saben binario y las que no",end="--- ")
print("otra linea")
