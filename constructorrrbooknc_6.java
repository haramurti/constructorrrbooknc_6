public class constructorrrbooknc_6{
    String title;
    String author;
    double price;

    public constructorrrbooknc_6(String title , String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displaysystem() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main (String[]args){
        constructorrrbooknc_6 cons = new constructorrrbooknc_6("makan","lah",98);
        cons.displaysystem();        
    }
}