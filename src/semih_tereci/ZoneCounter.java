package semih_tereci;

public class ZoneCounter implements ZoneCounterInterface {
    MapInterface mMap;

    @Override
    public void Init(MapInterface map) {
        mMap = map;
    }

    @Override
    public int Solve() throws Exception {
        int width = 40, height = 20;
        Dimension dimension = new Dimension(width, height);
        mMap.GetSize(dimension);
        boolean[] visited = new boolean[width * height];
        int count = 0;

        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                visited[j * width + i] = false;
            }
        }

        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                if (!mMap.IsBorder(i, j) && !visited[j * width + i]) {
                    Search(i, j, width, height, visited);
                    count++;
                }
            }
        }

        return count;
    }

    private void Search(int x, int y, int width, int height, boolean[] visited) throws Exception {
        if (!mMap.IsBorder(x, y) && !visited[y * width + x] && x >= 0 && y >= 0 && x < width && y < height) {
            visited[y * width + x] = true;
            Search(x - 1, y, width, height, visited);
            Search(x + 1, y, width, height, visited);
            Search(x, y - 1, width, height, visited);
            Search(x, y + 1, width, height, visited);
        }
    }
}



