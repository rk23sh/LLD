package fly_weight;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        TreeType t1 = TreeFactory.getTreeType("mango");
        TreeType t2 = TreeFactory.getTreeType("mango");

        System.out.println(t1 == t2);
    }
}

class Tree{
    int x, y;
    Boolean isCut;
    TreeType type;

    Tree(TreeType type, int x, int y){
        this.type = type;
        this.x = x;
        this.y = y;
        this.isCut = false;
    }
}

class TreeType{
    String type;
    TreeType(String type){
        this.type = type;
    }
}

class TreeFactory{
    private static HashMap<String, TreeType> table = new HashMap<>();

    static TreeType getTreeType(String type){
        if (!table.containsKey(type)){
            table.put(type, new TreeType(type));
        }
        return table.get(type);
    }
}

//package fly_weight;
//
//import java.util.HashMap;

//public class Client {
//    public static void main(String[] args) {
//
//        for(int i = 0; i < 10000; i++){
//            TreeType type = TreeFactory.getTreeType("mango");
//
//            Tree tree = new Tree(type, i, i+10);
//            // imagine storing tree somewhere
//        }
//
//        TreeType t1 = TreeFactory.getTreeType("mango");
//        TreeType t2 = TreeFactory.getTreeType("mango");
//
//        System.out.println(t1 == t2); // true ✅
//    }
//}
//
//class Tree{
//    int x, y;
//    Boolean isCut;
//    TreeType type;
//
//    Tree(TreeType type, int x, int y){
//        this.type = type;
//        this.x = x;
//        this.y = y;
//        this.isCut = false;
//    }
//}
//
//class TreeType{
//    String type;
//
//    TreeType(String type){
//        this.type = type;
//    }
//}
//
//class TreeFactory{
//    private static HashMap<String, TreeType> table = new HashMap<>();
//
//    static TreeType getTreeType(String type){
//        if (!table.containsKey(type)){
//            table.put(type, new TreeType(type));
//        }
//        return table.get(type);
//    }
//}