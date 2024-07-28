# OrderNotificationSystem

## Descrição

Este projeto é um exemplo prático de uso de vários padrões de projeto em Java puro. Ele implementa os padrões Singleton, Factory, Observer e Strategy para criar um sistema de notificações de pedidos e processamento de pagamentos.

## Padrões de Projeto Implementados

1. **Singleton Pattern**: Garantir que haja apenas uma instância da classe `OrderManager`.
2. **Factory Pattern**: Criar diferentes tipos de notificações (`EmailNotification` e `SMSNotification`) sem expor a lógica de criação ao cliente.
3. **Observer Pattern**: Notificar os clientes quando um pedido é concluído.
4. **Strategy Pattern**: Permitir a escolha da estratégia de pagamento em tempo de execução.
