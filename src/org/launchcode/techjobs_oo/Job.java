package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job(){
        this.id=nextId;
        nextId++;
    }

    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.id=nextId;
        nextId++;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

//    public static int getNextId() {
//        return nextId;
//    }

//    public static void setNextId(int nextId) {
//        Job.nextId = nextId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        if(name == ""){
            name = "Data not available";

        }if(employer.getValue().equals("")){
            this.employer = new Employer("Data not available");

        }if(location.getValue().equals("")){
            this.location = new Location("Data not available");

        }if(positionType.getValue().equals("")) {
            this.positionType = new PositionType("Data not available");

        }if(coreCompetency.getValue().equals("")) {
            this.coreCompetency = new CoreCompetency("Data not available");
        }

        return "\n"  +
                "ID: " + id + '\n' +
                "Name: " + name + '\n' +
                "Employer: " + employer.getValue() + '\n' +
                "Location: " + location.getValue() + '\n' +
                "PositionType: " + positionType.getValue() + '\n' +
                "CoreCompetency: " + coreCompetency.getValue() + '\n' +
                "\n" ;
    }
}
