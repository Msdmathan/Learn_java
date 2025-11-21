class PreDefinedClasses{
    public static void main(String[] args){
        /*
         toString
         toBinarySrting
         valueOf
         parseInt
        */
        String strNum = Integer.toString(123);
        System.out.println("String value : " + strNum);
         
        String binaryStr = Integer.toBinaryString(10);
        System.out.println("Binary String value : " + binaryStr);

        String valueOfNum = String.valueOf(456);
        System.out.println("Value of String : " + valueOfNum);

        int parsedNum = Integer.parseInt("789");
        System.out.println("Parsed Integer value : " + parsedNum);

    }
}
