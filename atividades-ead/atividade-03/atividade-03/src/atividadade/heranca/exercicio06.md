>> Quais são as regras para utilização de sobrescrita de métodos? Forneça um exemplo em código Java.

- O método sobrescrito deve ter a mesma assinatura do método da classe pai.
- O método sobrescrito não pode ser menos acessível que o método da classe pai.
- O método sobrescrito não pode lançar exceções que não sejam lançadas pelo método da classe pai.
- O método sobrescrito não pode retornar um tipo mais específico que o método da classe pai.

```java
public class Animal {
    public void comer() {
        System.out.println("Animal comendo...");
    }
}

public class Cachorro extends Animal {
    @Override
    public void comer() {
        System.out.println("Cachorro comendo...");
    }
}
```