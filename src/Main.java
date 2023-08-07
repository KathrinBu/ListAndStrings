public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts=new ArrayList<>();
        vvod(texts);
        obratnyiPorjdok(texts);
        sredneeKolvo(texts);
        kolvoSlovStroke();
        slovoTekste();
    }
    public static ArrayList<String> vvod(ArrayList<String> texts){
        String name = "text.txt";
        try{
            Scanner sc = new Scanner(new File(name));
            while (sc.hasNext()) {
                texts.add(sc.nextLine().replace(",", "").replace(".", "").replace("—", "").replace(":", ""));
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :(");
        }
        return texts;
    }
    static ArrayList<String> obratnyiPorjdok(ArrayList<String> texts) {
        Collections.reverse(texts);
        System.out.println("Obratnyi porjdok:" + "\n" + texts);
        return texts;
    }

    static ArrayList<String> sredneeKolvo(ArrayList<String> texts){
        float number = 0;
        for (int i = 0; i < texts.size(); i++) {
            number += texts.get(i).length();
        }
        float average=number/(texts.size());
        System.out.println("Srednjj dlina stroki - "+average);
        return texts;
    }
    static String kolvoSlovStroke(){
        String name = "text.txt";
        try {
            Scanner sc = new Scanner(new File(name));
            int words = 0;
            while (sc.hasNextLine()){
                String[] arr = sc.nextLine().split(" ");
                words=arr.length;
                System.out.println("Kolichestvo slov v stroke - "+words);
            }

        } catch (FileNotFoundException e) {
            System.out.println(":((((");
        }
        return name;
    }

    static String slovoTekste(){
        String name = "text.txt";
        try {
            Scanner sc=new Scanner(new File(name));
            String st = sc.nextLine();
            String [] words=st.split("\s");
            HashMap<String, Integer> count=new HashMap<>();
            for (String word:words) {
                if(! count.containsKey(word)) {
                    count.put(word,0);
                }
                count.put(word,count.get(word)+1);
            }
            for (String word:count.keySet()) {
                System.out.println(word+" - raz - "+count.get(word));
            }

        } catch (FileNotFoundException e) {
            System.out.println(":(");
        }
        return name;
    }
}
