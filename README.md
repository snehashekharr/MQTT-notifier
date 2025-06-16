# MQTT Notifier

-MQTT Notifier is a Spring Boot application built to demonstrate the use of the MQTT protocol for real-time communication. It acts as an MQTT client that connects to a broker, subscribes to a specific topic, and listens for messages published on that topic. The application can also be extended to publish messages to MQTT topics.

-This project was created to understand how MQTT, a lightweight publish-subscribe network protocol, integrates with backend applications in use cases like IoT, messaging systems, and real-time dashboards. It offers an example of how Java and Spring Boot can be used to build efficient and responsive communication channels between devices or services.

-The application uses the Eclipse Paho MQTT client library to connect to an MQTT broker, such as HiveMQ or Mosquitto. When the application starts, it initializes a connection to the broker using properties defined in the configuration file. It subscribes to a specified topic and waits for messages. Any messages received are logged to the console.

-To run the project, clone the repository and open it in IntelliJ IDEA. You can configure the broker details in the `application.properties` file under `src/main/resources`. Once configured, you can run the application through the IDE or by using the `mvn spring-boot:run` command in the terminal.

-The application establishes a connection with the broker, subscribes to the configured topic, and logs any received messages. It provides a foundational setup that can be extended further to include publishing capabilities or integration with other services.


## 🚀 Features

- ✅ Connects to an MQTT broker (e.g., Eclipse Mosquitto)
- 📩 Publishes and subscribes to MQTT topics
- 🔔 Sends and receives real-time notifications
- 🧩 Configurable broker URL, topic, and QoS through `application.properties`


## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot**
- **Eclipse Paho MQTT Client**
- **Maven**
- **IntelliJ IDEA**

## *Project Structure
mqtt-notifier/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── mqttdemo/
│ └── mqttnotifier/
│ ├── MqttNotifierApplication.java
│ └── [Your Service Classes]
│
├── resources/
│ └── application.properties
│
├── pom.xml

## 🚀 Running the Project

Follow the steps below to run the MQTT Notifier Spring Boot application locally.

### 1. Clone the Repository

```bash
git clone https://github.com/snehashekharr/MQTT-notifier.git
cd MQTT-notifier

