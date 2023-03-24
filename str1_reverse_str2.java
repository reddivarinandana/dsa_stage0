class HelloWorld {
    public static void main(String[] args) {
        String str1="xyz";
        String str2="zyx";
        String bag="";
        for(int i=str1.length()-1;i>=0;i--){
           bag=bag+str1.charAt(i);
        }
        if(str2.equals(bag)){
            System.out.println("str 1 is reverse of str 2");
        }else{
            System.out.println("not reverse");
        }
    }
}