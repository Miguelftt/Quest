#include <iostream>

int main() {
    int INDICE = 12, SOMA = 0, K = 1;
    while (K < INDICE) {
        K = K + 1;
        SOMA = SOMA + K;
    }
    std::cout << "SOMA: " << SOMA << std::endl;
    return 0;
}