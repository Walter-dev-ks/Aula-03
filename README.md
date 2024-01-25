# Java Max Number Finder - Projeto de Estudo

Este é um simples programa em Java desenvolvido para fins educacionais, criado para auxiliar no estudo de lógica de programação e estruturas condicionais.

## Como Usar

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/java-max-number-finder.git
   ```

2. **Navegue até o Diretório do Projeto:**
   ```bash
   cd java-max-number-finder
   ```

3. **Compile o Arquivo Java:**
   ```bash
   javac Main.java
   ```

4. **Execute o Programa:**
   ```bash
   java Main
   ```

5. **Siga as Instruções:**
   Insira três números quando solicitado, e o programa exibirá o número mais alto.

## Estrutura do Código

O código está organizado na classe `Main`, onde você tem a opção de escolher entre duas implementações:

- **Sem Utilizar uma Função:**
  Descomente o bloco de código dentro do método `main` e comente a seção que utiliza a função.

- **Utilizando uma Função:**
  Descomente o bloco de código dentro do método `main` e comente a seção sem utilizar a função. A lógica para encontrar o número máximo está encapsulada na função `max`.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        // ...
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Descomente uma das seguintes seções com base em sua preferência:

        /*
        // Sem Utilizar uma Função

        if(a > b && a > c){
            System.out.println("Maior = " + a);
        } else if (b > c) {
            System.out.println("Maior = " + b);
        } else {
            System.out.println("Maior = " + c);
        }
        */

        // Utilizando uma Função

        int maior = max(a, b, c);
        showResult(maior);

        // ...
    }

    // ...
}
```

## Funções

- **max(int x, int y, int z):**
  Determina e retorna o máximo entre três números.

- **showResult(int result):**
  Exibe o resultado.

Sinta-se à vontade para explorar ambas as implementações e usar aquela que melhor atenda aos seus objetivos de estudo. Este projeto foi desenvolvido com o propósito de aprendizado
