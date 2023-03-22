public class Main{
    public static void main(String[] args) {
        String str = "This is a short story of Princess Moana.Once upon a time, there lived a little, beautiful girl named Moana in Motunui Island.Even when she was little, she loved the ocean. She also loved listening to Gramma Tala’s stories.  Moana’s favorite was about the trickster demigod Maui, who stole the heart of the mother island, Te Fiti. According to Gramma, Maui upset the balance of nature by stealing the heart.";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}