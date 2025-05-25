package com.example.vtrack.Models;

public class CarModel {
    int carPic;
    String carName;
    String carNo;
//    String carCompany;
//    String carAddress;

    public CarModel(int carPic, String carName, String carNo, String carCompany, String carAddress) {
        this.carPic = carPic;
        this.carName = carName;
        this.carNo = carNo;
//        this.carCompany = carCompany;
//        this.carAddress = carAddress;
    }


    public int getCarPic() {
        return carPic;
    }

    public void setCarPic(int carPic) {
        this.carPic = carPic;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

//    public String getCarCompany() {
//        return carCompany;
//    }
//
//    public void setCarCompany(String carCompany) {
//        this.carCompany = carCompany;
//    }
//
//    public String getCarAddress() {
//        return carAddress;
//    }
//
//    public void setCarAddress(String carAddress) {
//        this.carAddress = carAddress;
//    }


}
