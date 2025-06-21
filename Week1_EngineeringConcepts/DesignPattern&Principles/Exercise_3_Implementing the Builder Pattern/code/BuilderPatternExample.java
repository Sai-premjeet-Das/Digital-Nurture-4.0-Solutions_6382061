public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                                .setStorage("1TB SSD")
                                .setGraphicsCard("NVIDIA RTX 4090")
                                .setWifiEnabled(true)
                                .build();
        Computer officePC = new Computer.Builder("Intel i3", "8GB")
                                .setStorage("512GB HDD")
                                .setWifiEnabled(false)
                                .build();

        System.out.println(gamingPC);
        System.out.println();
        System.out.println(officePC);
    }
}

class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private boolean hasWifi;
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.hasWifi = builder.hasWifi;
    }
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private boolean hasWifi;
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Builder setWifiEnabled(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
    @Override
    public String toString() {
        return "Computer Config:\nCPU: " + cpu + "\nRAM: " + ram +
               "\nStorage: " + storage + "\nGraphics Card: " + graphicsCard +
               "\nWiFi Enabled: " + hasWifi;
    }
}