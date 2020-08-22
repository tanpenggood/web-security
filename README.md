## web-security

### xss

借助js实现的攻击，由于服务端没有对提交的表单数据对`<>`进行转义处理，

数据在回显的时候发生，导致黑客可以在别人的浏览器上运行任意js代码。

**解决方案**：对数据中的特殊符号进行转义处理

如，`<`转义为`&lt;`、 `>`转义为`&gt;`

## web

访问：[http://localhost:8080](http://localhost:8080)

![](https://raw.githubusercontent.com/tanpenggood/web-security/master/localhost_8080_.png)
