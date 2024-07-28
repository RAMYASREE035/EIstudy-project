# EIstudy-project
Exercise 1: Design Patterns Examples

## Exercise 1: Design Patterns Examples

### Behavioral Design Patterns

#### Chain of Responsibility

**Overview**: This pattern allows an object to pass a request along a chain of potential handlers until one of them handles the request.

**Use Case**: Handling different types of user requests.

**Classes**:
- `Handler`: Abstract base class defining a method for handling requests and for setting the next handler in the chain.
- `ConcreteHandlerA`, `ConcreteHandlerB`: Concrete implementations that handle specific types of requests.
- `Request`: Class representing a request.
- `Main`: Class demonstrating the pattern by creating handlers and passing requests through the chain.

#### Observer

**Overview**: This pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Use Case**: Stock market application notifying subscribers about stock price changes.

**Classes**:
- `Observer`: Interface defining the update method for observers.
- `StockObserver`: Concrete implementation of `Observer`.
- `Subject`: Class managing observers and notifying them of changes.
- `Main`: Class demonstrating the pattern by creating a subject and observers, and notifying them of stock price changes.

### Creational Design Patterns

#### Factory Method

**Overview**: This pattern defines an interface for creating an object but allows subclasses to alter the type of objects that will be created.

**Use Case**: Creating different types of notifications (Email, SMS, Push).

**Classes**:
- `Notification`: Interface defining a method to notify the user.
- `EmailNotification`, `SMSNotification`, `PushNotification`: Concrete implementations of `Notification`.
- `NotificationFactory`: Factory class for creating notification instances based on a given type.
- `Main`: Class demonstrating the pattern by creating different types of notifications using the factory.

#### Singleton

**Overview**: This pattern ensures a class has only one instance and provides a global point of access to it.

**Use Case**: Managing a logging mechanism.

**Classes**:
- `Logger`: Singleton class for logging messages.
- `Main`: Class demonstrating the pattern by using the singleton logger to log messages.

### Structural Design Patterns

#### Adapter

**Overview**: This pattern allows incompatible interfaces to work together by wrapping an existing class with a new interface.

**Use Case**: Integrating with different payment gateways.

**Classes**:
- `PaymentProcessor`: Interface defining a method to process payments.
- `PayPalProcessor`, `StripeProcessor`: Concrete implementations of `PaymentProcessor`.
- `PaymentAdapter`: Adapter class for processing payments.
- `Main`: Class demonstrating the pattern by using the adapter to process payments through different gateways.

#### Decorator

**Overview**: This pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

**Use Case**: Extending functionalities of a basic coffee machine.

**Classes**:
- `Coffee`: Interface defining methods to get the cost and description of coffee.
- `BasicCoffee`: Basic implementation of `Coffee`.
- `CoffeeDecorator`: Abstract decorator class implementing `Coffee` and holding a reference to a `Coffee` object.
- `MilkDecorator`, `SugarDecorator`: Concrete decorators adding functionalities to `Coffee`.
- `Main`: Class demonstrating the pattern by creating decorated coffee objects.

# Exercise 2: Real-Time Chat Application

## Overview

This project is a real-time chat application developed in Java. It allows users to communicate instantly with each other, supporting multiple chat rooms, user authentication, and persistent chat history.

## Features

- User authentication and registration.
- Real-time messaging between users.
- Persistent chat history storage.
- Multiple chat rooms or channels.
- Secure and efficient communication.

## Key Design Patterns

- **Observer Pattern**: Notify clients of new messages or user activities.
- **Singleton Pattern**: Ensure a single instance of the server.
- **Adapter Pattern**: Allow the system to work with different types of client communication protocols.

### Prerequisites

- Java Development Kit (JDK) installed.

