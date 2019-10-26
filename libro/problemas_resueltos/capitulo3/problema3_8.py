NUM=int(input("dame un numero positivo :"))
if NUM>0:
    while (NUM !=1):
        if (-1**NUM) > 0:
            NUM=NUM/2
        else:
            NUM=(NUM*3)+1
    print(f"{NUM}")
else:
    print(f"NUM TIENE QUE SER UN ENTERO POSITIVO")
