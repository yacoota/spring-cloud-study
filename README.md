# spring-cloud-study

#### 介绍
springcloud 基本开发组件集成学习知识整理总结

#### 说明
> 1、springcloud-1.X.X分支：
- springcloud版本为：Edgware.RELEASE
- springboot版本为：1.5.19.RELEASE
- JDK 1.8

>  2、springcloud-2.X.X分支：
- springcloud版本为：Hoxton.RELEASE
- springboot版本为：2.2.6.RELEASE
- JDK 1.8

> 3、master分支：
- 保持与springcloud和springboot配套版本同步更新
- JDK 8
受到eureka的限制，不能升级更高的jdk。

> 4、springcloud和springboot的版本需要配套使用

- spring-cloud-dependencies 版本列表可查看：
-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-dependencies
- spring-boot-starter-parent 版本列表可查看：
-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent

```
版本匹配关系如下：
```
<table>
  <thead>
   <tr>
    <td>cloud</td>
    <td></td>
    <td></td>
    <td>boot</td>
    <td></td>
    <td></td>
   </tr>
  </thead>
  <tr>
    <td>Angel</td>
    <td>安吉尔</td>
    <td>SR6</td>
    <td>1.2.X</td>
    <td>1.2.8</td>
    <td>GA</td>
  </tr>
  <tr>
    <td>Brixton</td>
    <td>布里克斯顿</td>
    <td>SR7</td>
    <td>1.3.X</td>
    <td>1.3.8</td>
    <td>GA</td>
  </tr>
  <tr>
    <td>Camden</td>
    <td>卡梅登</td>
    <td>SR7</td>
    <td>1.4.X</td>
    <td>1.4.2</td>
    <td>GA</td>
  </tr>  
  <tr>
    <td>Dalston</td>
    <td>达斯顿</td>
    <td>SR5</td>
    <td>1.5.X</td>
    <td>*</td>
    <td>GA</td>
  </tr>     
  <tr>
    <td>Edgware</td>
    <td>艾奇韦尔</td>
    <td>SR5</td>
    <td>1.5.X</td>
    <td>1.5.19</td>
    <td>GA</td>
  </tr>  
  <tr>
    <td>Finchley</td>
    <td>芬奇利</td>
    <td>SR2</td>
    <td>2.0.X</td>
    <td>2.0.8</td>
    <td>GA</td>
  </tr>
  <tr>
    <td>Greenwich</td>
    <td>格林威治</td>
    <td>SR2</td>
    <td>2.1.X</td>
    <td>2.1.2</td>
    <td>GA</td>
  </tr>  
  <tr>
    <td>Hoxton</td>
    <td>霍克斯顿</td>
    <td>SR2</td>
    <td>2.2.X</td>
    <td>2.2.6</td>
    <td>GA</td>
  </tr>      
</table>
        
