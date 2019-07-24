package attractions;

import behaviours.ISecurity;
import behaviours.IReviewed;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed{

    public Playground(String name, int rating) {
        super(name, rating);
    }


    @Override

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 15);
    }
}


