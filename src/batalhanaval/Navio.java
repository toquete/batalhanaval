/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class Navio {
  private List<Integer> posicoes = new ArrayList<Integer>();

  /**
   * @return the posicoes
   */
  public List<Integer> getPosicoes() {
    return posicoes;
  }

  /**
   * @param posicoes the posicoes to set
   */
  public void setPosicoes(List<Integer> posicoes) {
    this.posicoes = posicoes;
  }
}
