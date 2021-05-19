

public class StudentController {
  private Student model;
  private StudentView view;

  public StudentController(Student  model, StudentView view) {
    this.model = model;
    this.view = view;
  }

  public String getStuNo() {
    return model.getRollNo();
  }
  
  public void setStuNo(String no) {
    model.setRollNo(no);
  }

  public void updateView() {
    view.printStudent(model.getRollNo());
  }
  
}
