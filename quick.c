void printarray(int A[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d\n",A[i]);
    }
}
void QuickSort(int A[],int low,int high)
{
    int PI;
    if(low<high)
    {
        PI=partition(A,low,high);
        QuickSort(A,low,PI-1);
        QuickSort(A,PI+1,high);
    }
}
 int partition(int A[],int low,int high)
{
    int pivot=A[low];
    int i=low+1;
    int j=high;
    int temp;
    do
    {
        while(A[i]<=pivot)
        {
            i++;
        }
        while (A[j]>pivot)
        {
            j--;
        }
        if(i<j)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
    }while(i<j);
    temp=A[low];
    A[low]=A[j];
    A[j]=temp;
    return j;

}
    


int main()
{
    int val;
    int A[]={10,42,13,64,55,16,1,27};
    int n=8;
    printf("Array before sort:\n");
    printarray(A,n);
    QuickSort(A,0,n-1);
    printf("Array after sort:\n");
    printarray(A,n);
    return 0;

}