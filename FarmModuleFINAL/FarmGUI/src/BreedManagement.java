class BreedManagement {
    private String name;
    private boolean isBreeding;

    public BreedManagement(String name, boolean isBreeding) {
        this.name = name;
        this.isBreeding = isBreeding;
    }

    public String getName() {
        return name;
    }

    public boolean isBreeding() {
        return isBreeding;
    }

    public void setBreeding(boolean isBreeding) {
        this.isBreeding = isBreeding;
    }

    public void displayBreedingInfo() {
        System.out.println("Breeding Information for " + name + ": " + (isBreeding ? "Currently breeding" : "Not breeding"));
    }
}
