class ParkingSystem {
    private int bigType;
    private int mediumType;
    private int smallType;
    
    public ParkingSystem(int big, int medium, int small) {
        this.bigType = big;
        this.mediumType = medium;
        this.smallType = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && bigType > 0) {
            bigType--;
            return true;
        } else if (carType == 2 && mediumType > 0) {
            mediumType--;
            return true;
        } else if (carType == 3 && smallType > 0) {
            smallType--;
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */