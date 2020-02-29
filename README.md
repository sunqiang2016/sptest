环境说明：JDK1.8、SpringBoot

HttpClient详细使用示例

访问方式：先启动类SptestApplication，
        然后直接运行HttpCliTest中的每个test方法即可；
        
        
        
HTTP 协议可能是现在 Internet 上使用得最多、最重要的协议了，越来越多的 Java 应用程序需要直接通过 HTTP 协议来访问网络资源。虽然在 JDK 的 java net包中已经提供了访问 HTTP 协议的基本功能，但是对于大部分应用程序来说，JDK 库本身提供的功能还不够丰富和灵活。HttpClient 是 Apache Jakarta Common 下的子项目，用来提供高效的、最新的、功能丰富的支持 HTTP 协议的客户端编程工具包，并且它支持 HTTP 协议最新的版本和建议。

        HTTP和浏览器有点像，但却不是浏览器。很多人觉得既然HttpClient是一个HTTP客户端编程工具，很多人把他当做浏览器来理解，但是其实HttpClient不是浏览器，它是一个HTTP通信库，因此它只提供一个通用浏览器应用程序所期望的功能子集，最根本的区别是HttpClient中没有用户界面，浏览器需要一个渲染引擎来显示页面，并解释用户输入，例如鼠标点击显示页面上的某处，有一个布局引擎，计算如何显示HTML页面，包括级联样式表和图像。javascript解释器运行嵌入HTML页面或从HTML页面引用的javascript代码。来自用户界面的事件被传递到javascript解释器进行处理。除此之外，还有用于插件的接口，可以处理Applet，嵌入式媒体对象（如pdf文件，Quicktime电影和Flash动画）或ActiveX控件（可以执行任何操作）。HttpClient只能以编程的方式通过其API用于传输和接受HTTP消息。

HttpClient的主要功能：

实现了所有 HTTP 的方法（GET、POST、PUT、HEAD、DELETE、HEAD、OPTIONS 等）
支持 HTTPS 协议
支持代理服务器（Nginx等）等
支持自动（跳转）转向
—————