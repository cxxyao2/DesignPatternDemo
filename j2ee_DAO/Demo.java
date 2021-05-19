
// dao ， data access object pattern 把用于低级的数据访问API或者操作从高级的业务数据中分离出来,
// 1, DAO interface 定义一个要执行的标准
// 2,dao interface class 实现了上诉接口， 从数据源获取数据，数据源可以是数据库，XML文件，或者其他存储机制
// 3 模型对象/数值对象 Model Object/Value object. 使用get/set方式来粗出通过DAO类检索到的数据
public class Demo {
  public static void main(String[] args) {
    StudentDao studentDao = new StudentDaoImpl();

    for (Student student : studentDao.getAllStudents()) {
      System.out.println("Student no is " + student.getRollNo() 
      + "  name is  " + student.getName() );
    }

    // update student
    Student student = studentDao.getAllStudents().get(0);
    student.setName("Michalll0000");
    studentDao.updateStudent(student);

    // get student
    student = studentDao.getStudent(1);
    System.out.println("Student no is " + student.getRollNo() 
    + "  name is  " + student.getName() );

    // delete tudent
    studentDao.deleteStudent(student);
  }
}
