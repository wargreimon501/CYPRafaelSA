MAT=str(input("dame el nombre de la materia:"))
CAL1=float(input("dame tu primera calificacion:"))
CAL2=float(input("dame la segunda calificacion:"))
CAL3=float(input("dame la tercera calificacion:"))
CAL4=float(input("dame la cuarta calificacion:"))
CAL5=float(input("dame la quinta calificacion:"))
PRO=(CAL1+CAL2+CAL3+CAL4+CAL5)/5
if PRO>=6:
    print(f"la materia {MAT} tienes de promedio {PRO} y estas aprobado")
else:
    print(f"la materia {MAT} tienes de promedio {PRO} y estas reprobado")
print(f"fin del condicional paso3")
