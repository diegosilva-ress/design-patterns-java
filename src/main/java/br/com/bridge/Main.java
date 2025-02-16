package br.com.bridge;

import br.com.bridge.platforms.Facebook;
import br.com.bridge.platforms.IPlatform;
import br.com.bridge.platforms.Twitch;
import br.com.bridge.platforms.Youtube;
import br.com.bridge.transmissions.AdvancedLive;
import br.com.bridge.transmissions.Live;

public class Main {

  public static void main(String[] args) {
    startLive(new Youtube());
    startLive(new Facebook());
    startLive(new Twitch());
  }

  public static void startLive(IPlatform platform) {
//    System.out.println("...Aguarde");
//    Live live = new Live(platform);
//    live.broadcasting();
//    live.result();
    System.out.println("Transmissão avançada... aguarde");
    AdvancedLive advancedLive = new AdvancedLive(platform);
    advancedLive.broadcasting();
    advancedLive.comments();
    advancedLive.subtitles();
    advancedLive.result();
  }

}
