#include <iostream>

bool pertenceAFibonacci(int num) {
    if (num < 0) return false;
    int a = 0, b = 1, fib = 0;
    if (num == 0 || num == 1) return true;
    while (fib < num) {
        fib = a + b;
        a = b;
        b = fib;
    }
    return fib == num;
}

int main() {
    int numero;
    std::cout << "Digite um número para verificar se ele pertence à sequência de Fibonacci: ";
    std::cin >> numero;
    if (pertenceAFibonacci(numero)) {
        std::cout << "O número " << numero << " pertence à sequência de Fibonacci." << std::endl;
    } else {
        std::cout << "O número " << numero << " não pertence à sequência de Fibonacci." << std::endl;
    }
    return 0;
}