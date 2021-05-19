// structural pattern
// 继承或者依赖（即把a当成私有成员变量）
// 功能：充当两个不兼容的接口间的桥梁，
// 场景：读卡器作为内存卡与笔记本之间的适配器
// 优点：1，可以让两个没有任何关联的类一起运行
// 2，提高了类的复用
// 缺点：1，过多适配器会不易整体把握。看到a接口，实际内部配置成b接口的实现
// 重点： 接口a,有方法b; adapter和 另外一个c都配置接口a, 
//  adapter 是c的私有成员，所以c的实际配置方法b 中包含了adapter的实现，扩展了c的功能
//   adapter把其他功能当成私有成员,调用也放在了方法b中。
// e.g.如果扩充audio播放器,来播放视频mp4/Vlc等。
// 跟decorator不一样,decorator包裹类,直接call decorator.method
// adapter pattern是adapter作为类成员，call class.method
public class Demo {
  public static void main(String[] args) {
    AudioPlayer audioPlayer =new AudioPlayer();

    audioPlayer.play("mp3","beyond the hrozion");
    audioPlayer.play("mp3","beyond the hrozion");
    audioPlayer.play("Vlc","beyonfafaffad the hrozion");
    audioPlayer.play("mp4","be soleil zion");

  }
}
