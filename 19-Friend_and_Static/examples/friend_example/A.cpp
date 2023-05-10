class A{
    public:
        friend class B;
    private:
        int x, y;

};

class B{
    public:
        void f(A a){
            int p = a.x + a.y;
        }
};

