package je22_compositeEntity;

public class CompositeEntity {
  private CoarseGraineObject cgo = new CoarseGraineObject();

  public void setData(String data1, String data2) {
    cgo.setData(data1, data2);
  }

  public String[] getData() {
    return cgo.getData();
  }
 
}
