package semih_tereci;

public interface MapInterface {

    void SetSize(Dimension dim);//method isimleri küçük harfle başlamalı clean code prensipleri kapsamında

    void GetSize(Dimension dim);//get methodları harhangi bir tipte değer, değişken dönerler genelde, bu yüzden void olmamalı

    void SetBorder(int x, int y) throws Exception;

    void ClearBorder(int x, int y) throws Exception;

    boolean IsBorder(int x, int y) throws Exception;

    void Show();
}
