MAT=int(input("dama tu matricula :"))
CARR=str(input("dame el nombre de la carrera :"))
SEM=int(input("dime en que semestre vas :"))
PROM=float(input("dame tu promedio"))
if CARR=="economia":
    if SEM>=6 and PROM>=8.8:
        print(f"el alumno con matricula {MAT} y de la  {CARR} es aceptado")
if CARR=="computacion":
    if SEM>6 and PROM>8.5:
        print(f"el alumno con matricula {MAT} y de la  {CARR} es aceptado")
if CARR=="contabilidad":
    if SEM>5 and PROM>8.5:
        print(f"el alumno con matricula {MAT} y de la  {CARR} es aceptado")
if CARR=="administracion":
    if SEM>5 and PROM>8.5:
        print(f"el alumno con matricula {MAT} y de la  {CARR} es aceptado")

