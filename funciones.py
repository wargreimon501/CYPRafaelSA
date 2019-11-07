def sumar(x,y):
    z=x+y
    return z
def restar(x,y):
    return x-y
def mi_print(texto):
    print(f"este es mi print:{texto}")
def multiplica (valor , veces):
    if veces==None:
        print("debes enviar el segundo argumento de la funcion")
    else:
        print(valor*veces)
def comanda(mesa,comensal,entrada,medio,fuerte,postre='gelatina de limon'):
    print(f"Mesa:{mesa} comensal:{comensal}")
    print(f"\t entrada:{entrada}")
    print(f"\tsegundo tiempo:{medio}")
    print(f"\t plato fuerte:{fuerte}")
    print(f"\t postre:{postre}")
def comando2(**comida):
    llaves=comida.keys()
    for elem in llaves:
        print(elem,"--->",comida[elem])
    print(llaves)
def imprime_argumentos(*argumentos):
    for index in range(len(argumentos)):
        print(argumentos[index])
    
a=10
b=5
c= sumar(a,b)
print(f"la suma de {a} y {b} es {c}")
c=restar(a,b)
print(f"la resta de {a} y {b} es {c}")
mi_print("hola¿¿¿")
multiplica(10,45)
multiplica(10,None)
multiplica('  hola',3)
comanda(2,1,"ensalada","sopa de rana","filete de pompi de sirena","flan")
comanda("ensalada","sopa de rana","filete de pompi de sirena","flan",2,1)
comanda(entrada="ensalada",medio="sopa de rana",fuerte="filete de pompi de sirena",mesa=2,comensal=1)
imprime_argumentos('hola',True,3.1416,1000,{'id':'sc01','nombre':'juan'})
comando2(entrada="ensalada",medio="sopa de rana",fuerte="filete de pompi de sirena",mesa=2,comensal=1,postre='pastel')
