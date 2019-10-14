A=int(input("dame un numero entero :"))
B=int(input("dame otro numero entero :"))
C=int(input("dame otro numero entero :"))
if A<B:
    if B<C:
        print(f"los numero estan en orden cresiente")
    else:
        print(f"los numero no estan en orden cresiente")
else:
    print(f"los numeros no estan de orden cresiente ")
