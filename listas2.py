#arreglos
# 
#escritura asignacion
#actualizacion : incercion , eliminacion , modificacion 
#ordenamiento
#busqueda


#escritura
frutas=["zapote" ,"manzana" , "pera" , "aguacate" ,"durazno", "uva","sandia"]
# lo asemos  con el selector [indice]
print(frutas [2])
#lectura con for
#for opcion 1
for indice in range (0,7,1):
    print(frutas [indice])
print ("----")
#for opcion 2 -- por un itador for each
for fr in frutas:
    print(fr)

# asignacion
frutas [2]= "melon"
print(frutas )
# insercion al final
frutas.append("naranja")
print(frutas)
print(len(frutas))
#dir(list) comado de lista



#help (list.comando) te deescribe lo que hace
frutas.insert(2,"toronja")
print(frutas)
print (len(frutas))
frutas.insert(0,"mamey")



#eliminacion con pop
print(frutas.pop())
print(frutas)
print(frutas.pop(1))
print(frutas)
frutas.append("toronja")
frutas.append("toronja")
print(frutas)
frutas.remove("toronja")
print(frutas)




#ordenamiento
frutas.sort()
print(frutas)
frutas.reverse()
print(frutas)

#buqueda
#print(f"la toronja esta en la pocicion .{frutas.index( manzana)} ")
#print(f"la toronja esta {frutas.count( manzana )} veces en la lista")
#concatenar
print(frutas)
otras_frutas=["rambutan","nispero","liche","phitahaya"]
frutas.extend(otras_frutas)
print(frutas)

#copiar
copia=frutas
copia.append("naranja")
print(frutas)
print(copia)

otra_copia=frutas.copy()
otra_copia.append("fresa")
otra_copia.append("fresa")
print(frutas)
print(otra_copia)
