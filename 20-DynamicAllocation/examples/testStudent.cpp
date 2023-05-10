#include"student.h"

int main(){
    Student s; // Esta notación ya crea un objeto Student
    s.courses[0] = "ELO329";
    s.courses[1] = "ELO320";
    s.courses[2] = "TEL101";
    std::cout << s.courses[0] << " " << s.courses[2]; 

    Student X(s);
    //X.courses[0] = "FIS110";
    //std::cout << s.courses[0] << " " << s.courses[2];

    return 0;
}