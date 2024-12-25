public class ControlStatements {
    public static void main(String args[]){
        InnerControlStatements ins = new InnerControlStatements();
        
        System.out.println(ins.add(3, 5));
    }
}

class InnerControlStatements {

    public int add(int a, int b){
        return a + b;
    }
}