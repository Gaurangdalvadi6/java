#include<stdio.h>

void main()
{
    int a,b,sum,sub,multi,division,modulo;

    printf("Enter the value of a:");
    scanf("%d",&a);

    printf("Enter the value of b:");
    scanf("%d",&b);

    printf("Sum is:%d\n",sum=a+b);
    printf("Sub is:%d\n",sub=a-b);
    printf("Multi is:%d\n",multi=a*b);
    printf("Division is:%d\n",division=a/b);
    printf("Modulo is:%d\n",modulo=a%b);

}