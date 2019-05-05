package psn.design.pattern.designPatterns.Iterator.auxClasses;

import psn.design.pattern.designPatterns.Iterator.Container;
import psn.design.pattern.designPatterns.Iterator.Iterator;

public class DragonBallRepository implements Container {
    public String names[] = {"Goku" , "Gohan" ,"Kika" , "Krillin", "Vegeta", "Gothen", "Bulma"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
