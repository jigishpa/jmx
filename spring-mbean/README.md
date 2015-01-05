Spring JMX MBean example
==============================

In this example, we create an MBean called "HelloBean" that is exposed via JMX. You can connect to this MBean and invoke operations on it in real time using JConsole (or other JMX Client).

Notice that you could set a name using the setName() operation and then call sayHello() operation to get a "Hello <i>name<i>!" message back.