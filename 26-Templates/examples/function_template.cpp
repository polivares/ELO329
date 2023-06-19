#include <iostream>

template <typename T> void display(const T &val){
    std::cout << "El valor de val es " << val << std::endl;
}

template <typename TParam> void swap(TParam &x, TParam &y){
    TParam temp;
    temp = x;
    x = y;
    y = temp;
}

int main(){
    display(10);
    display("hello");
    display(true);

    std::string x = "10";
    std::string y = "20";

    swap(x,y);
    std::cout << "Valor de x es " << x << " y valor de y es " << y << std::endl;

    return 0;
}