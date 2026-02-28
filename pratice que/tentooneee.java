// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class tentooneee {
   public tentooneee() {
   }

   public static void Decending(int var0) {
      if (var0 == 1) {
         System.out.println(1);
      } else {
         System.out.println("" + var0 + " ");
         Decending(var0 - 1);
      }
   }

   public static void main(String[] var0) {
      byte var1 = 99;
      Decending(var1);
   }
}
