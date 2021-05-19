## design pattern categories

对 Pattern 进行分 3 大类，creation, structure, behavior. 后续有加 J2EE，如 MVC,interceptor 等

## java is preinstalled in Mac.

## run a java file.

- javac Hello.java
- java Hello

## reference: web site

- https://www.runoob.com/design-pattern/design-pattern-tutorial.html

## 关于对其他类的引用

如果是同一个包中，不需要写 import 之类。

## 写在 pacakge 中的访问与编译

编译时， 进入同一 pacakge 所在目录 javac \*。java
运行时，到 package 上一目录 Java subpackage/main（。class）

## default

- 即不加任何访问修饰符，通常称为“默认访问权限“或者“包访问权限”。该模式下，只允许在同一个包中进行访问。
