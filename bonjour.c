#include <stdio.h>

int main(){
	char bj[15]="bonjour";
	int rep;
	printf("Veuillez entrer votre nombre de bonjour\n");
	scanf("%d",&rep);
	int i;
	for(i=0;i<rep;i++)
		printf("%s\n",bj);
	return 0;
}

