otra = bool(int(input("hay mas alumnos(0 no,1 si)")))
suma = 0.0
cont=0
while(otra==True):
    cal = float(input("calificacion:"))
    cont+=1
    suma += cal 
    otra = bool(int(input("hay mas alumnos(0 no,1 si)")))
print(f"suma:",suma)
print(f"promedio:",suma/cont)
print("finn delprograma")
