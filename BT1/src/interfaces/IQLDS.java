package interfaces;

import parts.CaNhan;
import java.util.ArrayList;

public interface IQLDS {
    public int them(CaNhan caNhan);
    public int xoa(String ten);
    public void inDS(ArrayList<CaNhan> ds);
}