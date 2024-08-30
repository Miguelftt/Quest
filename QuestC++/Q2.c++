#include <iostream>
#include <string>
int contarLetraA(const std::string& str) {
    int contador = 0;
    for (char c : str) {
        if (c == 'a' || c == 'A') {
            contador++;
        }
    }
    return contador;
}
int main() {
    std::string texto;
    std::cout << "Digite a string para verificar a quantidade de letras 'a' e 'A': ";
    std::getline(std::cin, texto);
    int quantidade = contarLetraA(texto);
    if (quantidade > 0) {
        std::cout << "A letra 'a' ou 'A' aparece " << quantidade << " vezes na string." << std::endl;
    } else {
        std::cout << "A letra 'a' ou 'A' não aparece na string." << std::endl;
    }
    return 0;
}