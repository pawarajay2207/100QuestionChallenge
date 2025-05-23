public class TwentySix {

    public int m(){

    
    try {
        return 1;
    } catch (NullPointerException e) {
        return 2;
    }
    catch(Exception e){
        return 3;
    }
    }
    public static void main(String[] args) {
      TwentySix ob = new TwentySix();
    
        System.out.println(ob.m());
    }
}
