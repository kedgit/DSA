void printarray(int A[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d\n",A[i]);
    }
}
void SelectionSort
int main()
{
    int val;
    int A[]={10,42,13,64,55,16,7};
    int n=7;
    printf("Array before sort:\n");
    printarray(A,n);
    electionSort(A,n);
    printf("Array after sort:\n");
    printarray(A,n);
    return 0;

}