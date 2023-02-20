package hospital.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.setDistrict();
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    private void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getSqlInsertQuery() {
        String sql = String.format("(\"%s\", \"%s\", \"%s\", \"%s\", %d, \"%s\", \"%s\"),\n", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

}
