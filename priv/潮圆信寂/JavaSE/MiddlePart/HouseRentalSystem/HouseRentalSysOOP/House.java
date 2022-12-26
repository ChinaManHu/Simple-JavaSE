package priv.潮圆信寂.JavaSE.MiddlePart.HouseRentalSystem.HouseRentalSysOOP;

/**
 *
 *@author 潮圆信寂
 *@date 2022/9/5
 */
public class House {
    private String number;
    private String houseOwner;
    private String telephoneNumber;
    private String location;
    private String monthlyRent;
    private String houseStatus;

    public House(String number, String houseOwner, String telephoneNumber, String location, String monthlyRent, String houseStatus) {
        this.number = number;
        this.houseOwner = houseOwner;
        this.telephoneNumber = telephoneNumber;
        this.location = location;
        this.monthlyRent = monthlyRent;
        this.houseStatus = houseStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    @Override
    public String toString() {
        return "房屋信息：" +
                number + '\t' +
                houseOwner + '\t' +
                telephoneNumber + '\t' +
                location + '\t' +
                monthlyRent + '\t' +
                houseStatus;
    }
}
