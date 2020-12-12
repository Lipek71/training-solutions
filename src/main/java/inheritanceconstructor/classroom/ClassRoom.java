package inheritanceconstructor.classroom;

public class ClassRoom extends Room{
    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public boolean isSuitable(Course course){
        boolean suitableFacility = getFacility() == course.getFacilityNeeded() ? true : false;
        boolean suitableCapacity = getCapacity() >= course.getParticipants() ? true : false;

        return suitableCapacity && suitableFacility ? true : false;
    }
}
