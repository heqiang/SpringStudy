衍生的注解
    @Component有几个衍生的注解 在web开发中 会按照mvc三层架构分层,都代表组件的意思
    dao层  【@Repository】
    service层 【Service】
    controller 【Controller】
    这四个注解功能一样 都是代表将某个类注册到spring容器中装配bean

xml 和注解最佳实践
        xml 用于 bean的管理
        注解只负责完成属性的注入

让注解生效的注意事项：一是开启注解的支持 二是扫描包的开启

