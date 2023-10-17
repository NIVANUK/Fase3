public class Reduct implements IFase{
    @Override
    public int getResalt(int d, int f) {
        if (f != 0)
            return (d / f);
        else return 99999999;

    }
}
