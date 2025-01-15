class data_types
{
    public static void main(String[] args)
    {
        //integer data type
        byte a = 50;
        short b = 10;
        int c = 7;
        long d = 107;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();


        //every no. that we store is stored in the form of binary and when we
        //print it is is converted from binary to no. and is displayed.
        int ak = 45;                   //treated as decimal
        int akhil = 045;               //treated as octal
        int nile = 0x45;               //treated as hexadecimal
        int nilesh = 0b101101;         //treated as binary
        System.out.println(ak);       
        System.out.println(akhil);
        System.out.println(nile);
        System.out.println(nilesh);
        System.out.println();


        //real no. data type
        float e = 55.5555555555f;       
        double f = 55.5555555555;       //double is more precise than float
        System.out.println(e);
        System.out.println(f);
        

        float g = 72.543F;
        float h = 7.2543E1f;           //in scientific notation
        float i = (float)22.3;         //type casting
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println();


        //character data type
        char ch = 'A';
        char cha = 'अ';               //java follows unicode.....not ascii
        System.out.println(ch);
        System.out.println(cha);
        

        int uni = '0';                //to find unicode value of a character
        System.out.println(uni);
        System.out.println();


        //typecasting
        byte iron = 55;
        double man = (double)iron;
        System.out.println(iron);
        System.out.println(man);        //implecit type casting


        double tony = 44.4;
        byte stark = (byte)tony;
        System.out.println(stark);      //explicit type casting(loss of data)


        //boolean data type
        boolean lol = true;
        boolean olo = false;
        System.out.println(lol);
        System.out.println(olo);

        

    }
}
