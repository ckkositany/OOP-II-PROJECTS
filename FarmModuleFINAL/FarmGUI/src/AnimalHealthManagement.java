class AnimalHealth {
    private String name;
    private String healthStatus;

    public AnimalHealth(String name, String healthStatus) {
        this.name = name;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void displayHealthInfo() {
        System.out.println("Health Information for " + name + ": " + healthStatus);
    }
}
