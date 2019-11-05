#diccionario('llave':'valor')
alumno={"num_cta":'201647757473',
        'nombre':('jose','perez','garcia'),
        'semestre':1,
        'promedio':0.0,
        'materias':['cyp','algebra','calculo','geometria','introICO'],
        'regular':True,
        'lagrimas_por_examen':5,
        'direccion':{
                    'calle':'rancho seco',
                     'colonia':'impulsora popular avicola',
                     'numero':1000,
                     'cp':17570,
                     'del_mun':'neza',

                     'estado':{
                         'id':15,
                         'nombre':'estado de mexico ',
                         'corto':'edomex'
                     }
        }
        }
alumno['lagrimas_por_examen']=10
print(alumno)
alumno['cursa_ingles']=True
print(alumno)
print(alumno['nombre'])
print(alumno)
print(alumno['nombre'][1])
print(alumno['direccion']['cp'])
print(alumno['direccion']['estado']['corto'])


mi_lista=[['a','b'],['c',10],['d',True]]

diccionario=dict(mi_lista)
print(diccionario)
print(alumno['materias'][1].upper())
print(alumno['direccion']['estado']['nombre'][10::].upper())
#funcion keys()
llaves=alumno.keys()
print(llaves)
for llaves in llaves:
    print("------------")
    print(llaves)
    print("-----------")
    print(alumno[llaves])
    print("++++++++")
#funcion values
for val in alumno.values():
    print("......")
    print(val)
    print("++++++++++++")
#funcion items()
for elem in alumno.items():
    print("..........")
    print(elem)
    print("++++++++++++")
    
