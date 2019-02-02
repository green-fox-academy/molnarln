package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List <Sharpie> sharpies;

    public SharpieSet(){
        sharpies = new ArrayList();

    }
    public void add(Sharpie sharpie){
        sharpies.add(sharpie);
    }

    public int countUsable(){
        int counter = 0;
        for (Sharpie sharpie: this.sharpies
             ) {
            if (sharpie.inkAmount >0){
                counter ++;
            }
        }
        return counter;
    }
    public void removeTrash (){
        ArrayList<Sharpie> temp = new ArrayList<>();
        for (Sharpie sharpie: this.sharpies
             ) {
            if (sharpie.inkAmount>0){
                temp.add(sharpie);
            }
        }this.sharpies = temp;
    }
}
