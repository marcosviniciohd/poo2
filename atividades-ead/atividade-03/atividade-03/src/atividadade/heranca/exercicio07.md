>> 7 - Quais são as regras para a utilização de sobrecarga de métodos? Forneça um exemplo em código java.
 
- A sobrecarga de métodos é a possibilidade de termos mais de um método com o mesmo nome, porém com assinaturas diferentes. 
- A assinatura de um método é composta pelo nome do método e a lista de parâmetros. 
- A assinatura de um método não inclui o tipo de retorno do método.
 
```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
 
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
 
    public double somar(double a, double b) {
        return a + b;
    }
}
```