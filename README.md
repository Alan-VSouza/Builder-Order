# **Order Management System**

### Integrantes:
-> Alan Andrade Vasconi de Souza - SC3038319

-> Antonio Augusto de Campos - SC3038246

-> Felipe Santos Lourenço - SC303867X

### **Descrição**
Este projeto é um exemplo de sistema de gerenciamento de pedidos desenvolvido em **Java**, utilizando os padrões de projeto **MVC** e **Step Builder**. Ele demonstra práticas modernas de design de software, com foco em modularidade, clareza e escalabilidade. A aplicação permite criar, exibir e gerenciar pedidos de forma segura e fluida.

---

## **Funcionalidades**
- **Criação de Pedidos:**
    - Adicione detalhes como produto, quantidade, preço, cliente e endereço de entrega.
    - Utiliza o padrão **Step Builder** para garantir que os pedidos sejam criados corretamente, seguindo uma ordem lógica.

- **Exibição de Pedidos:**
    - Detalhes do pedido formatados em um estilo amigável e visual.
    - Inclui numeração sequencial automática para cada pedido exibido.

- **Arquitetura Organizada:**
    - Implementação baseada no padrão **MVC**:
        - **Model:** Representação do objeto `Order` e sua lógica de construção.
        - **View:** Responsável por exibir as informações dos pedidos.
        - **Controller:** Gerencia a interação entre Model e View, controlando o fluxo da aplicação.

---

## **Como Funciona?**
### **1. Estrutura do Projeto**
src/ ├── controller/ │ └── OrderController.java ├── model/ │ └── Order.java ├── view/ │ └── OrderView.java └── Main.java

### **2. Fluxo Principal**
1. O **usuário** chama o método `createOrder` no `OrderController`, fornecendo os detalhes do pedido.
2. O `OrderController` utiliza o **Step Builder** para construir um objeto `Order`.
3. O pedido criado é exibido na **OrderView** com formatação detalhada e numeração sequencial.

---

## **Exemplo de Uso**
### **Criação e Exibição de Pedidos**

```
public class Main {
    public static void main(String[] args) {
        OrderView view = new OrderView();
        OrderController controller = new OrderController(view);

        controller.createOrder(
                "Laptop",
                1,
                2500.00,
                "Alice Silva",
                "Rua Principal, 123"
        );

        controller.createOrder(
                "Smartphone",
                2,
                1500.00,
                "Carlos Oliveira",
                "Avenida Central, 45"
        );

        controller.createOrder(
                "Headset Gamer",
                1,
                300.00,
                "Beatriz Lima",
                "Rua das Flores, 789"
        );
    }
}
```
---

## **Saída do programa**

```
=====================================
          ORDER DETAILS - 1
=====================================
Product:           Laptop
Quantity:          1
Price:             $2500.00
Customer:          Alice Silva
Delivery Address:  Rua Principal, 123
=====================================

=====================================
          ORDER DETAILS - 2
=====================================
Product:           Smartphone
Quantity:          2
Price:             $1500.00
Customer:          Carlos Oliveira
Delivery Address:  Avenida Central, 45
=====================================

=====================================
          ORDER DETAILS - 3
=====================================
Product:           Headset Gamer
Quantity:          1
Price:             $300.00
Customer:          Beatriz Lima
Delivery Address:  Rua das Flores, 789
=====================================

```
---

## Tecnologias Utilizadas
- **Java 8+:** Linguagem principal para implementação do projeto.
- **Padrão Step Builder:** Garante a criação fluida e lógica de objetos complexos.
- **Lombok:** Reduz a verbosidade do código, gerando automaticamente métodos como `toString`, `builder` e outros.
- **Padrão Builder:** Implementação de construção segura de objetos utilizando um design modular.
- **Arquitetura MVC:** Organização do código em camadas (Model, View e Controller), garantindo modularidade e clareza.

---

## Como Rodar o Projeto

- Clone este repositório:

```
git clone https://github.com/Alan-VSouza/Builder-Order.git
```
- Importe o projeto em sua IDE de preferência (IntelliJ, Eclipse, etc.).
- Certifique-se de que o Java 8+ está configurado em sua IDE.
- Compile e execute a classe Main para visualizar os pedidos.

