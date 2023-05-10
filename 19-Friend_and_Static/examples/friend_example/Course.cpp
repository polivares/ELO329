
bool validateCourseData(const Course &C){
    return (C.x + C.y) > 0;
}


class Course{
    public:
        friend bool validateCourseData(const Course &C);
    private:
        int x, y;

};