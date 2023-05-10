#include<string>
#include<iostream>

class Student{
    public:
        Student();
        Student(Student &s);
        ~Student();
        std::string *courses;
        int count;
};