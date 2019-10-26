NOM=0
SUE=float(input("dime cuanto es tu sueldo ;"))
while (SUE!=-1):
    if SUE<1000:
        NSUE=SUE*1.15
    else:
        NSUE=SUE*1.12
    NOM=NOM+NSUE
    print(f" tu nuevo sueldo es {NSUE}")
    SUE=float(input("dime cuanto es tu sueldo ;"))
print(f"{NOM}")
