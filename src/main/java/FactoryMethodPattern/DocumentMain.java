package FactoryMethodPattern;

public class DocumentMain {
    public static void  main(String[] args){
        Document obj = AbstractDocument.requestdoc("tar");
        obj.document();

//        Document obj = AbstractDocument.createdoc("mat");
//        obj.document();
    }
}
