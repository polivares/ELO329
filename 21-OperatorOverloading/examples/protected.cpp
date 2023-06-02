#include<string>

class CMotor{
    public:
        CMotor(std::string id){
            id_motor = id;
        }
    protected:
        std::string id_motor;
};

class CElectricMotor:public CMotor{
    public:
        CElectricMotor(std::string id, int v){
            CMotor::id_motor = id;
            voltage = v;
        }
    private:
        int voltage;
};