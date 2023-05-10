#include <string>
#include <fstream>
#include <iostream>

int main()
{
  std::string s;
  std::ifstream fin;

  // Abrimos nuestro archivo de interés
  fin.open("/etc/passwd");
  // Mientras siga leyendo líneas de mi archivo...
  while(getline(fin,s)){
    // ... voy a mostrar el contenido almacenado en la variable s
    std::cout << s << std::endl;
    std::cout << "Siguiente línea..." << std::endl;
  }
  return 0;
}
