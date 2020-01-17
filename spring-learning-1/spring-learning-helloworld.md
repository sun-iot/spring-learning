+ Spring 是一个开源框架.
+ Spring 为简化企业级应用开发而生. 使用 Spring 可以使简单的 JavaBean 实现以前只有 EJB 才能实现的功能.
+ Spring 是一个 IOC(DI) 和 AOP 容器框架.

**开发环境**

+ 开发工具： IDEA
+ JDK 8.0
+ Spring 4.0

## Spring 的简单介绍

![spring-xmind](https://sun-iot.coding.net/p/hexo-image/d/hexo-image/git/raw/master/spring/spring/spring-xmind.png)
具体描述 Spring:

+ 轻量级：Spring 是非侵入性的 - 基于 Spring 开发的应用中的对象可以不依赖于 Spring 的 API
+ 依赖注入(DI --- dependency injection、IOC)
+ 面向切面编程(AOP --- aspect oriented programming)
+ 容器: Spring 是一个容器, 因为它包含并且管理应用对象的生命周期
+ 框架: Spring 实现了使用简单的组件配置组合成一个复杂的应用. 在 Spring 中可以使用 XML 和 Java 注解组合这些对象
+ 一站式：在 IOC 和 AOP 的基础上可以整合各种企业应用的开源框架和优秀的第三方类库 （实际上 Spring 自身也提供了展现层的 SpringMVC 和 持久层的 Spring JDBC）

### Spring 模块

![spring-model](https://sun-iot.coding.net/p/hexo-image/d/hexo-image/git/raw/master/spring/spring/spring-model.png)

**核心容器(Core Container) 包括Core、Beans、Context、EL模块**
1. Core和Beans模块提供了Spring最基础的功能，提供IoC和依赖注入特性。这里的基础概念是BeanFactory，它提供对Factory模式的经典实现来消除对程序性单例模式的需要，并真正地允许你从程序逻辑中分离出依赖关系和配置。
2. Context模块基于Core和Beans来构建，它提供了用一种框架风格的方式来访问对象，有些像JNDI注册表。Context封装包继承了beans包的功能，还增加了国际化（I18N）,事件传播，资源装载，以及透明创建上下文，例如通过servlet容器，以及对大量JavaEE特性的支持，如EJB、JMX。核心接口是ApplicationContext。
3. Expression Language，表达式语言模块，提供了在运行期间查询和操作对象图的强大能力。支持访问和修改属性值，方法调用，支持访问及修改数组、容器和索引器，命名变量，支持算数和逻辑运算，支持从Spring 容器获取Bean，它也支持列表投影、选择和一般的列表聚合等。

**数据访问/集成部分(Data Access/Integration)**
1. JDBC模块，提供对JDBC的抽象，它可消除冗长的JDBC编码和解析数据库厂商特有的错误代码。
2. ORM模块，提供了常用的"对象/关系"映射APIs的集成层。 其中包括JPA、JDO、Hibernate 和 iBatis 。利用ORM封装包，可以混合使用所有Spring提供的特性进行"对象/关系"映射，如简单声明性 事务管理 。
3. OXM模块，提供一个支持Object和XML进行映射的抽象层，其中包括JAXB、Castor、XMLBeans、JiBX和XStream。
4. JMS模块，提供一套"消息生产者、消费者"模板用于更加简单的使用JMS，JMS用于用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。
5. Transaction模块，支持程序通过简单声明性 事务管理，只要是Spring管理对象都能得到Spring管理事务的好处，即使是POJO，也可以为他们提供事务。

**Web**
1. Web模块，提供了基础的web功能。例如多文件上传、集成IoC容器、远程过程访问、以及Web Service支持，并提供一个RestTemplate类来提供方便的Restful services访问
2. Web-Servlet模块，提供了Web应用的Model-View-Controller（MVC）实现。Spring MVC框架提供了基于注解的请求资源注入、更简单的数据绑定、数据验证等及一套非常易用的JSP标签，完全无缝与Spring其他技术协作。
3. Web-Struts模块， 提供了对Struts集成的支持，这个功能在Spring3.0里面已经不推荐了，建议你迁移应用到使用Struts2.0或Spring的MVC。
4. Web-Portlet模块，提供了在Portlet环境下的MVC实现

**AOP**
1. AOP模块，提供了符合AOP 联盟规范的面向方面的编程实现，让你可以定义如方法拦截器和切入点，从逻辑上讲，可以减弱代码的功能耦合，清晰的被分离开。而且，利用源码级的元数据功能，还可以将各种行为信息合并到你的代码中 。
2. Aspects模块，提供了对AspectJ的集成。
3. Instrumentation模块， 提供一些类级的工具支持和ClassLoader级的实现，可以在一些特定的应用服务器中使用。

**Test**
1. Test模块，提供对使用JUnit和TestNG来测试Spring组件的支持，它提供一致的ApplicationContexts并缓存这些上下文，它还能提供一些mock对象，使得你可以独立的测试代码。

## HelloWorld

首先创建一个 Maven 工程（也可以使用IDEA里面的那个 Spring . 这里初学，就不建议使用那个了。同样，建议创建 maven 工程，方便 Jar 包的管理）；Maven工程大家就可以自己创建一个空白的 工程就行。

创建好我们的 Maven 工程后，我们需要配置好我们的 pom.xml 文件，引入我们的开发包。

```xml
 <dependencies>
        <!-- Spring Core-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!-- Spring Context-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!-- Spring Beans-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!-- Spring Web-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!-- Spring WebMvc-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!-- Spring Aop-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${spring.version}</version>
        </dependency>
    </dependencies>
```

我们的父工程的搭建好了之后，就开始创建我们的子工程。我这取名： spring-learning-quickstart.子工程是继承父工程的，这样我们就不用再次导入我们的开发包了。

我们在 子工程中创建一个 bean , 取名 HelloWorld .

```java
public class HelloWorld {
    private String name ;
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }
    public HelloWorld() {
        System.out.println("Constructor for HelloWorld");
    }
}
```

然后，我们在创建一个主类 Main .

```java
public class Main {
    public static void main(String[] args) {
        // 传统做法( 这不是Spring 的做法)
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Spring");
        helloWorld.sayHello();
    }
}
```

一运行，我们就可以看到控制台出现了：

```shell
hello Spring
```

当然，这个不是 Spring 的方式。现在我们来看看 Spring 中怎么去做。

**Spring 实现**

在Spring 中，我们需要通过配置去实现我们的这个 HelloWorld 的。首先，我们在 resource 中新建一个 XML 的文件 。 我这就叫 applicationContext.xml 。 内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!-- 配置Bean -->
    <bean id="helloWorld" class="com.spring.bean.HelloWorld">
        <property name="name" value="SunYang's Spring"></property>
    </bean>
</beans>
```

这里稍后在解释。

然后我们在主类中，这么来写。

```java
        //1 创建 Spring 的 IOC 容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 从IOC 容器中获取 Bean 实例
        HelloWorld hello = (HelloWorld)applicationContext.getBean("helloWorld");
        //3 调用 sayHello()
        hello.sayHello();
```

这样我们的控制台就出现：

```shell
hello SunYang's Spring
```

现在呢，先来看一下，Spring创建了这个容器的过程中帮我们做了什么。我们在这个容器创建这边打一个断点。
![spring-helloworld](https://sun-iot.coding.net/p/hexo-image/d/hexo-image/git/raw/master/spring/spring/spring-helloworld.png)
然后程序执行到这以后，会自动跳到我们的 HelloWorld 类里面，在看这个：
![spring-helloworld-name](https://sun-iot.coding.net/p/hexo-image/d/hexo-image/git/raw/master/spring/spring/spring-helloworld-name.png)
我们可以看到，这个时候Spring就已经把 SunYang's Spring 给了 name 了。

## Spring 核心

### 两个重点概念

+ IOC: 控制反转，与依赖注入 DI 一样
+ AOP： 面向切面编程

### IOC

所谓控制反转，其实是一个由主动转被动的一个过程。举个例子：

之前，我们没有饮品店的时候，我们想喝果汁了，就是自己准备水果，然后自己榨果汁。这就是一个主动的创造一杯果汁的过程。但是，现在有饮品店了，我们想喝果汁了，我们就不在需要自己去榨一杯果汁，而是叫饮品店去榨一杯果汁，请注意，这里我们并没有创造一杯果汁，但是依然达到了我们要喝果汁的目的。这边是控制反转的思想。比如说：
我现在要喝 一个 大杯的三分糖的橙子汁。

```java
    /**
     * 我们要喝的水果汁
     * @param water 果汁加的水
     * @param fruit 水果类型
     * @param sugar 糖
     * @return
     */
    public static String juiceMix(String water , String fruit ,String sugar){
        String juice = String.format("我要喝 %s 的 , %s 的 %s" , water ,sugar ,fruit ) ;
        return juice ;
    }
```
现在我们有了要喝的果汁，现在就是需要有人去做，相当于一个店家去做。

```java
public class JuiceProduce {

    private String water ;
    private String fruit ;
    private String sugar ;

    public void setWater(String water) {
        this.water = water;
        System.out.println(this.water);
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public JuiceProduce() {
        System.out.println("Constructor for JuiceProduce");
    }

    public String juiceProduce(){
        return Blende.juiceMix(this.water , this.fruit , this.sugar) ;
    }
}
```

现在我们需要选择那家店去喝这个果汁了，就是在 配置文件里面去配置一下。

```xml
    <bean id="juiceProduce" class="com.spring.bean.JuiceProduce">
        <property name="water" value="大杯" />
        <property name="fruit" value="橙汁" />
        <property name="sugar" value="三分糖"/>
    </bean>
```

我们选择这个名叫 juiceProduce 的店家来制造我们的果汁。最后的结果就是:

```shell
我要喝 大杯 的 , 三分糖 的 橙汁
```

在下一篇中，讲一下这个关于 Bean 的配置问题。


