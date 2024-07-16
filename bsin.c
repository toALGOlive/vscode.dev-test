#include <stdio.h>

void pc(int *arr, int size) {
 for(int i =0; i <size -1 ; i++)
  if (*(arr +i)%2 ==0) {
*(arr+ i) += *(arr +i +1);

  }else{
*(arr +i +1) -= *(arr +i);

 
   } 

}

int cal(int *p , int size) {
    int sum =0;
    for (int i =0; i <size; i++) {
        if(i%2 ==0){

        sum += *(p+i);
        }else{
            sum -= *(p +i);
        }
    }




return sum;
}

int main() {
int data[] = {10,5,8,3,12,6};
int length = sizeof(data)/ sizeof(data[0]);

pc(data, length);
int res = cal(data, length);

printf("%d\n", res);
return 0;


}