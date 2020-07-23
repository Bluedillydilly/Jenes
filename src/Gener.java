public class Gener {
   public static void main(String[] args){
      System.out.println("Hello world!");

      Codon c1 = new Codon(NucleotideBase.A, NucleotideBase.C, NucleotideBase.A);
      System.out.println(c1);
      Codon c2 = new Codon(NucleotideBase.A, NucleotideBase.C, NucleotideBase.A);
      System.out.println(c2);
      System.out.println(c1.equals(c2));
   }

}
