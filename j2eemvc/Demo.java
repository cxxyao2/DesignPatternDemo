// M-V-C
// model: 代表一个存取数据的对象,可以带逻辑，在数据变化时更新控制器
// view: 数据的可视化
// controller: 用在模型和试图上。控制数据流模型，数据变化时更新视图。让视图和模型分开


public class Demo{

  public static void main(String[] args){
    // get data from DB
    Student model = retriveDataFromDB();

    // create a view and display data
     StudentView view = new StudentView();
     StudentController  controller = new StudentController(model,view);
     controller.updateView();
     
     // update model
     controller.setStuNo("newno 123");
     controller.updateView();


  }

  private static Student retriveDataFromDB() {
    Student st = new Student();
    st.setRollNo("helalal");
    return st;
  }
}