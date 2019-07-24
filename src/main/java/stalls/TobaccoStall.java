package stalls;

import behaviours.ISecurity;
import behaviours.IReviewed;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }

}
