
// Transfer Object Pattern 用于客户端向服务器一次性传递带有多个属性的数据
// 客户端---业务对象--传输对象（简单POJO类，getter/setter方法有，可以序列化）
// client - bo ,business object - transfer object
// 都是实体，没有DAO模式中的接口，与DAO模式给的代码示例而非常相似
public class Demo {
  public static void main(String[] args) {
    StudentBo studentBusinessObject = new StudentBo();

    //输出所有的学生
    for (StudentVo student : studentBusinessObject.getAllStudents()) {
       System.out.println("Student: [RollNo : "
       +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

    //更新学生
    StudentVo student =studentBusinessObject.getAllStudents().get(0);
    student.setName("Michael");
    studentBusinessObject.updateStudent(student);

    //获取学生
    studentBusinessObject.getStudent(0);
    System.out.println("Student: [RollNo : "
    +student.getRollNo()+", Name : "+student.getName()+" ]");
 }
}
