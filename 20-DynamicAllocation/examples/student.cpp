#include<string>
#include<iostream>
#include"student.h"

Student::Student(){
    courses = new std::string[50];
    count=0;
}

Student::Student(Student &s){
    courses = s.courses;
    count = s.count;

}

Student::~Student(){
    delete []courses;
}