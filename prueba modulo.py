import modulos

modulos.mi_print("hola")

from modulos import*
import time
import sys
from asciistuff import Banner
mi_print("hola de nuevo")
otro_print("otro print usado")
print(sumar(4,5))
print(restar(10,7))

for i in range (10,0,-1):
    print(i,"....")
    time.sleep(.1)
    
print(Banner("boooooom entu cara perra"))
print(sys.platform)

