package test;

public class BigClass {
      private int number = 0;
        private String text = "null";
        public BigClass(int numner,String text){
           this.number=number;
            this.text=text;
        }
        public BigClass(){}
        public BigClass(int number){
            this.number = number;
        }
    public BigClass(String text){
        this.text = text;
    }
        public int getNumber() {
            return number;
        }
        public String getText() {
            return text;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public void setText(String text) {
            this.text = text;
        }

      public void printExample(){
            String name = "abc";
          text =name.toUpperCase();
            System.out.println(name.toUpperCase());
         // return name;
      }

    public String printretExample(String name){

        System.out.println(name.toUpperCase());
         return name.toUpperCase();
    }
      public void StringLength(){
            String Example = "Akshaj";
          System.out.println(Example.length());
      }
      public String textnull(String text){
            return null;
      }
    public  int Add(int a,int b ){
        int sum =0;
        if(a>0 && b>0){
            sum = (a+b);
        }
        return sum ;
    }

    @Override
    public String toString() {
        return "BigClass{" +
                "text='" + text + '\'' +
                '}';
    }
}

