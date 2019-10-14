A=int(input("dame un numero entero :"))
B=int(input("dame otro numero entero :"))
C=int(input("dame otro numero entero :"))
if A>B:
    if A>C:
        print(f"a es el numero mayor que vale {A}")
    elif A==C:
        print(f"a y c son el mismo valor y el valor es {A}")
    else:
        print(f"c es el mayor con el valor {C}")
elif A==B:
    if A>C:
        print(f"a y b son los mayores que valen {A}y {B}")
    elif A==C:
        print(f"a ,b y c son iguales con valor {A}")
    else:
        print(f"c es el mayor con valor {C} ")
elif B>C:
    print(f"b es el mayor y su valor es {B}")
elif B==C:
    print(f"b y c son los mayores con valores {B} y {C}")
else:
    print(f"c es el mayor con valor {C}")
