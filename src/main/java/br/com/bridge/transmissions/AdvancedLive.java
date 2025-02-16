package br.com.bridge.transmissions;

import br.com.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

  public AdvancedLive(IPlatform platform) {
    super(platform);
  }

  public void subtitles() {
    System.out.println("Legendas atividas");
  }

  public void comments() {
    System.out.println("Comentários atividos");
  }

}
