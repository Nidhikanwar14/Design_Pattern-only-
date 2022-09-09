package FactoryMethodPattern;

public abstract class AbstractDocument {
protected static Document createdoc(String doc){
      switch(doc){
          case "zip":
              return new zip();
          case "rar":
              return new rar();
          case "tar":
              return new tar();
          default:
              throw new IllegalStateException("Unexpected request: " + doc);
      }

}
public static Document requestdoc(String doc){
    return createdoc(doc);
}

}
