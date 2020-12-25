package semih_tereci;

public class Main {
    public static void main(String[] args) throws Exception {
        MapInterface map = new Map();
        Dimension dimension = new Dimension(40, 20);
        map.SetSize(dimension);
        for (int i = 0; i < 6; i++) {
            map.SetBorder(5 - i, i);
        }
        for (int i = 0; i < 16; i++) {
            map.SetBorder(15 - i, i);
        }
        for (int i = 0; i < 40; i++) {
            map.SetBorder(i, 10);
        }
        for (int i = 0; i < 20; i++) {
            map.SetBorder(i, i);
        }
        for (int i = 0; i < 20; i++) {
            map.SetBorder(13, i);
        }
        for (int i = 0; i < 20; i++) {
            map.SetBorder(35, i);
        }
        map.Show();
        ZoneCounterInterface zoneCounter = new ZoneCounter();
        zoneCounter.Init(map);
        System.out.println("Number of zones: " + zoneCounter.Solve());
    }
}
