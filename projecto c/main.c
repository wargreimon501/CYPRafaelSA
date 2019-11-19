#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
    int x;
	x=10;
	int y = 20;
	
	
	printf("hola mundo de programacion en c\n");
	printf("introduce un numero entero:");
	scanf("%d",&y);
	
	
	
	
	printf("\t x vale :%d y  Y vale: %d \a\n",x,y);
	if (y>10){
		
	printf("\n \t %d es mayor que 10",y);}
	if (y<10){
		printf("\t %d es mayor que 10",y);
	}
	
	if (y>10){
	printf("\n %d es manor que 10",y);
	}else{
		printf("\n %d es menor que 10",y);
	}
	printf("introduce un valor entero entre 1 y 5");
	scanf("%d",&x);
	switch(x){
	case 1:
		printf("hola \n");
	    break;
	case 2:
		printf("adios");
		break;
	case 3 :
		printf("bye");
		break;
	case 4 :
		printf("guten tag");
		break;
	case 5 :
		printf("buongiorno");
		break;
	case 6 :
		printf("hello");
	default:
		printf("opcion no valida");
	}
	
	return 0;
	
	
}
