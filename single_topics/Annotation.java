package single_topics;

class taylor {
    public void showTheDataWhichBelongToThisClass() {
        System.out.println("in A show");
    }
}

class swift extends taylor {
    @Override    //annotation describes ur intention to compile so it already gives u an error so tht u can change
    public void showTheDataWhichBelongToThisClass() {
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        swift obj = new swift();
        obj.showTheDataWhichBelongToThisClass();
    }
}

