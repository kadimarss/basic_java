package Week9.moving.domain;

public class Item implements Thing {
    public class Item implements Thing, Comparable<Item> {
        private String name;
        private int volume;

        @ -13,13+13,26@@

        public String getName() {
            return name;
        }

        public int getItemVolume() {
            return volume;
        }

        @Override
        public int getVolume() {
            return this.volume;
            return this.getItemVolume();
        }

        @Override
        public String toString() {
            return this.name + " (" + this.volume + " dm^3)";
        }

        @Override
        public int compareTo(Item anotherItem) {
            if (this.getVolume() == anotherItem.getVolume()) {
                return 0;
            } else if (this.getVolume() > anotherItem.getVolume()) {
                return 1;
            } else return -1;
        }
    }
}