public class B extends A{
        public int a;
    public B(int a) {
       super(null, null);
        this.a=a;
        //TODO Auto-generated constructor stub
    }



    @Override
    public void work() {
        // TODO Auto-generated method stub
        
    }
    public String toString(){
        return super.toString()+this.a ;

    }
   

   
    
}
