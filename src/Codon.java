public class Codon {

   NucleotideBase[] tripletBase;

   public Codon(NucleotideBase base1, NucleotideBase base2, NucleotideBase base3){
      this.tripletBase = new NucleotideBase[]{base1, base2, base3};
   }

   @Override
   public String toString(){
      StringBuilder sb = new StringBuilder();
      for(NucleotideBase base : this.tripletBase ){
         sb.append(base.name());
      }
      return sb.toString();
   }
}
