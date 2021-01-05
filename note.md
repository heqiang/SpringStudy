Spring的三种装配方式
        1、在xml中显示的装配 autowire 可以通过bytype和byname的方式实现 必须得有set方法
        2、在java中显示配置
        3、隐式的自动装配bean【重要】

自动装配@Resource和@AutoWired
       @Resource 是java 的  默认通过bytype的方式实现 如果找不到name 则会通过bytype进行查找 都找不到就报错
       @AutoWired spring框架的 通过byname的方式实现 而且必须要求这个对象存在

