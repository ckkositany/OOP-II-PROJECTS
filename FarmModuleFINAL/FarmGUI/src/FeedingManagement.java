class FeedingManagement {
    private String name;
    private String feedingSchedule;

    public FeedingManagement(String name, String feedingSchedule) {
        this.name = name;
        this.feedingSchedule = feedingSchedule;
    }

    public String getName() {
        return name;
    }

    public String getFeedingSchedule() {
        return feedingSchedule;
    }

    public void setFeedingSchedule(String feedingSchedule) {
        this.feedingSchedule = feedingSchedule;
    }

    public void displayFeedingInfo() {
        System.out.println("Feeding Information for " + name + ": " + feedingSchedule);
    }
}
