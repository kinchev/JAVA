package Comments;

public class Complex {
    double real;
    double image;

    void add(Complex num){
        this.real += num.real;
        this.image += num.image;
    }   void subtract(Complex num){
        this.real -= num.real;
        this.image -= num.image;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
