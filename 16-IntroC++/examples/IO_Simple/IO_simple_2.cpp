#include <string>
#include <fstream>
#include <iostream>

int main()
{
  std::string s;
  std::ifstream fin;
  fin.open("/etc/passwd");
  while(getline(fin,s))
    std::cout << s << std::endl;  
  return 0;
}
