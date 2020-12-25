package semih_tereci;

public class Map implements MapInterface {

    public boolean[][] mData;

    @Override
    public void SetSize(Dimension dim) {
        mData = new boolean[dim.width][dim.height];
        for (int i = 0; i < dim.width; ++i) {
            for (int j = 0; j < dim.height; ++j) {
                mData[i][j] = false;
            }
        }
    }

    @Override
    public void GetSize(Dimension dim) {
        dim.width = mData.length;
        dim.height = mData.length > 0 ? mData[0].length : 0;
    }

    @Override
    public void SetBorder(int x, int y) {
        mData[x][y] = true;
    }

    @Override
    public void ClearBorder(int x, int y) {
        mData[x][y] = false;
    }

    @Override
    public boolean IsBorder(int x, int y) {
        if (x >= 0 && y >= 0 && x < mData.length && y < mData[0].length) {
            return mData[x][y];
        } else {
            return true;
        }
    }

    @Override
    public void Show() {
        int width = 40, height = 20;
        Dimension dimension = new Dimension(width, height);
        GetSize(dimension);

        for (int j = 0; j < width + 2; ++j) {
            System.out.print('+');
        }
        System.out.println();

        for (int i = 0; i < height; ++i) {
            System.out.print('+');
            for (int j = 0; j < width; ++j) {
                System.out.print((mData[j][i] ? '+' : ' '));
            }
            System.out.print('+');
            System.out.println();
        }

        for (int j = 0; j < width + 2; ++j) {
            System.out.print('+');
        }
        System.out.println();
    }

}
