class Atom{

  static int i = 10;

  static {

    System.out.println(i);
    System.out.println("static block");
  }

  public static void main(String[] args) throws Exception{


    for (int i;i<10 ;i++ ) {
      System.out.println(i);

    }

    System.out.println("Hello Git");


  }
}
