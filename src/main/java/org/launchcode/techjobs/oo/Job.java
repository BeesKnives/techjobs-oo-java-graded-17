package org.launchcode.techjobs.oo;

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
        id = nextId;
        nextId ++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
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
        if (o == null || getClass() != o.getClass()) return false;
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
    } //__________________________________________Getters

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }


    public void setName(String name) {
        this.name = name;
    } //____________________Setters

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }




    public String checkStringForEmpty(String aString){
        if (aString.equals("")){
            return "Data not available";
        }
        return aString;
    }

    @Override
    public String toString() {
        //If a field is empty, the method should add, “Data not available” after the label. (see above method, used below)


        return  System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + checkStringForEmpty(name) + System.lineSeparator() +
                "Employer: " + checkStringForEmpty(String.valueOf(employer)) + System.lineSeparator() +
                "Location: " + checkStringForEmpty(String.valueOf(location)) + System.lineSeparator() +
                "Position Type: " + checkStringForEmpty(String.valueOf(positionType)) + System.lineSeparator() +
                "Core Competency: " + checkStringForEmpty(String.valueOf(coreCompetency)) + System.lineSeparator();
    }
    //lineSeparator()
    //ID:  _______
    //Name: _______
    //Employer: _______
    //Location: _______
    //Position Type: _______
    //Core Competency: _______
    //lineSeparator()
}
