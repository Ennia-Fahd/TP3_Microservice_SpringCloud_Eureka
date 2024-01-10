# Microservices Architecture for E-commerce using Spring Cloud and Eureka

This GitHub repository showcases a microservices architecture for an E-commerce application built with Spring Cloud and Eureka. The system comprises various microservices, each responsible for a specific domain, including Inventory, Customer, Billing, and Discovery. Additionally, an API Gateway is employed to streamline external communication with the microservices.

### Components
#### 1. Eureka Server (Discovery Service)
The Eureka Server acts as the discovery service, allowing microservices to register and discover each other dynamically (port 8761).

#### 2. Inventory Service
The Inventory Service manages product inventory, providing functionalities such as product availability and stock management (port 9082).

#### 3. Customer Service
The Customer Service handles customer-related operations, such as user profiles, order history, and authentication (port 9081).

#### 4. Billing Service
The Billing Service is responsible for processing and managing billing transactions, ensuring a seamless payment experience (port 9083).

#### 5. Gateway (API Gateway)
The API Gateway serves as the entry point for external clients, routing requests to the appropriate microservices. It enhances security and simplifies the overall architecture (port 9999).

### Getting Started
Clone the repository:

git clone https://github.com/your-username/e-commerce-microservices.git 

1-Set up and start each microservice individually. Ensure Eureka is started first.

2-Access the Eureka dashboard Discovery at http://localhost:8761 to verify service registration.

3-Start sending requests through the API Gateway at http://localhost:8765.

### Configuration
Adjust the configuration files for each microservice according to your environment and requirements. Update application.yml files with appropriate service names, ports, and Eureka server information.

### Communication Between Microservices
Utilize Spring Cloud Feign or RestTemplate for service-to-service communication. Microservices communicate with each other using their registered names in the Eureka server.

### Routes :
##### localhost:9999/CUSTOMER-SERVICE/customers : Display the list of all Customer-Service customers.
![Customers](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/2124e73e-b074-4bcd-8f88-06f7dc9d40fe)
##### localhost:9999/Inventory-SERVICE/products : Display the list of Inventory-Service products.
![Products](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/5edb3705-68c0-45e8-8dff-c6b74de17db0)
##### localhost:9999/BILLING-SERVICE/bills : Consult the list of invoices for the Billing-Service department.
![Bills](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/a74f7ea6-3ec0-4823-93fa-2be4cb236a07)
##### localhost:9999/BILLING-SERVICE/productsItems : Consult the list of Billing-Service products.
![productItems](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/c74cf0cb-375c-411d-9492-142fdc1ebbb7)
##### localhost:9999/BILLING-SERVICE/bills/{id} : View the details of an bills by its id.
![FullBill1](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/67234bc3-02ca-4e59-a198-dba7a8501be9)
##### http://localhost:8761/ : Management of different services with Eureka.
![discovery](https://github.com/Ennia-Fahd/TP3_Microservice_SpringCloud_Eureka/assets/92646945/4e795e88-172f-4e96-b180-ce175d8a825d)



