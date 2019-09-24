edad = int(input("dame tu edad"))
ine = bool(int(input("tienes ine(0 no /1 si)? :")))
if edad >=18 and ine==True:
    print("es mayor de edad")
    print("puede entrar al bar")
else:
    print("eres menor de edad")
    print("puedes ir a jugar kirby")
print("fin de programa")
