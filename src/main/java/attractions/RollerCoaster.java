package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.40;

    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        return (visitor.getAge() > 12 && visitor.getHeight() > 145);
    }

    @Override
    public double defaultPrice(){
        return this.defaultPrice();
    }

}
