class Main {
  public static void main(String[] args)
  {
    try{
      int a = 3/2;
      int[] daftarAngka = {1,2};
      System.out.println(a);
      System.out.println(daftarAngka[100]);
    }
    catch(ArithmeticException e){
      System.out.println("Operasi pembagian dengan 0 tidak valid");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Indeks array hanya bisa berisi 2");
    }
    finally{
      System.out.println("Exception telah berhasil ditangani");
    }
    System.out.println("Program selesai");
  }
}