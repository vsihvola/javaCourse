/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajoneuvo;

import java.io.*;

class Ajoneuvo
{
   private int paino;
   private int huippunopeus;
   private int ajetut_kilometrit;

   Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit)
   {
      this.paino = paino;
      this.huippunopeus = huippunopeus;
      this.ajetut_kilometrit = ajetut_kilometrit;
   }

   protected void aja(int ajettava_matka)
   {
      this.ajetut_kilometrit += ajettava_matka;
   }

   protected int anna_paino()
   {
      return this.paino;
   }

   protected int anna_huippunopeus()
   {
      return this.huippunopeus;
   }

   protected int anna_ajetut_kilometrit()
   {
      return this.ajetut_kilometrit;
   }
} 