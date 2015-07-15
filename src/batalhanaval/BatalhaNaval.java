/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BatalhaNaval {
  static private List<Navio> navios = new ArrayList<Navio>();
  
  /**
   * @return the navios
   */
  public List<Navio> getNavios() {
    return navios;
  }

  /**
   * @param navios the navios to set
   */
  public void setNavios(List<Navio> navios) {
    this.navios = navios;
  }
  
  public static void inicializarJogo(){
    Navio navio1 = new Navio();
    navio1.getPosicoes().add(15);
    navio1.getPosicoes().add(16);
    navio1.getPosicoes().add(17);
    
    Navio navio2 = new Navio();
    navio2.getPosicoes().add(13);
    navio2.getPosicoes().add(20);
    navio2.getPosicoes().add(27);
    
    Navio navio3 = new Navio();
    navio3.getPosicoes().add(39);
    navio3.getPosicoes().add(40);
    navio3.getPosicoes().add(41);
    
    navios.add(navio1);
    navios.add(navio2);
    navios.add(navio3);
  }
  
  public static void main(String[] args) {
    inicializarJogo();
    new Tela().setVisible(true);
  }
  
}
