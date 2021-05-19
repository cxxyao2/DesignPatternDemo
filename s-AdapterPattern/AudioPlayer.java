public class AudioPlayer implements MediaPlayer {
  MediaAdapter mediaAdapter;

  @Override
  public void play(String audioType, String fileName){

    // play mp3
    if(audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file is " + fileName);
    } else if(  audioType.equalsIgnoreCase("mp4") ||audioType.equalsIgnoreCase("vlc")  ) {
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported");
    }
  }

}