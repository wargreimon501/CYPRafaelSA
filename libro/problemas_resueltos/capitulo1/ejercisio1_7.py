L1=float(input("de la medida del primer lado"))
L2=float(input("deme la medida del segundo lado"))
L3=float(input("dame la medida del tercer lado"))
S=(L1+L2+L3)/2
AREA=(S*(S-L1)*(S-L2)*(S-L3))**0.5
print(f"el area del trangulo con lados {L1} , {L2} y {L3} es {AREA}")
