#include <iostream>
#include <string>

template <typename T> class Array{
    public:
        Array(int initialSize);
        ~Array();
        T& operator[](int i);

    private:
        T *m_pData;
        int m_nSize;
};

template<typename T> Array<T>::Array(int initialSize){
    m_nSize = initialSize;
    m_pData = new T[initialSize];
}

template<typename T> Array<T>::~Array(){
    delete []m_pData;
}

template<typename T> T& Array<T>::operator[](int i){
    return m_pData[i];
}

int main(){
    Array<int> myArray(20);
    myArray[2] = 50;

    std::cout << "El elemento en pos. 2 es " << myArray[2] << std::endl;

    Array<std::string> nameArray(10);
    nameArray[5] = std::string("Fred");

    std::cout << "El elemento en pos. 5 es " << nameArray[5] << std::endl;

    return 0;
}