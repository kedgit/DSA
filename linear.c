#include<stdio.h>
int linearSearch(int A[],int n,int val){
    for(int i=0;i<n;i++)
       {
        if(A[i]==val)
            return i;
        else  
           return -1;
       }
}

int main()
{
    int val;
    int A[]={1,2,3,4,5,6,7};
    int n=7;
   
    printf("Enter the value to be search: ");
    scanf("%d",&val);
    int res=linearSearch(A,n,val);
    if (res==-1)
    {
        printf("Element is not present ");

    }
    else 
    printf("Element is present at %d index",res);
    return 0;
}