
    public class VQClassA {
        protected int x;
        public VQClassA(int x) {
            this.x = x;
        } 
    
        
        public static void main(String[]args) {
            VQClassA vqa = new VQClassA(10);
    
            VQClassB vqb = new VQClassB(20, 10);
    
            vqa = vqb;
            System.out.println(vqa.x + " " + vqb.y);
        }
    }
    public class VQClassB extends VQClassA {
        
            private int x;
        
            private int y;
        public VQClassB(int x, int x2, int y) {
            super(x);
            x = x2;
            this.y = y;
        } private VQClassB(int x, int y) {
            super(x);
            this.x = x;
            this.y = y;
        }
    }
    